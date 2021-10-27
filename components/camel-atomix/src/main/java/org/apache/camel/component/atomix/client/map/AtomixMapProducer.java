/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.atomix.client.map;

import java.time.Duration;

import io.atomix.collections.DistributedMap;
import io.atomix.resource.ReadConsistency;
import org.apache.camel.AsyncCallback;
import org.apache.camel.Message;
import org.apache.camel.component.atomix.client.AbstractAtomixClientProducer;
import org.apache.camel.spi.InvokeOnHeader;
import org.apache.camel.util.ObjectHelper;

import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_ACTION;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_DEFAULT_VALUE;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_KEY;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_NAME;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_OLD_VALUE;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_READ_CONSISTENCY;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_TTL;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_VALUE;

public final class AtomixMapProducer extends AbstractAtomixClientProducer<AtomixMapEndpoint, DistributedMap<Object, Object>> {
    private final AtomixMapConfiguration configuration;

    protected AtomixMapProducer(AtomixMapEndpoint endpoint) {
        super(endpoint);
        this.configuration = endpoint.getConfiguration();
    }

    // *********************************
    // Handlers
    // *********************************

    @InvokeOnHeader("PUT")
    boolean onPut(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final Object key = message.getHeader(RESOURCE_KEY, configuration::getKey, Object.class);
        final Object val = message.getHeader(RESOURCE_VALUE, message::getBody, Object.class);
        final long ttl = message.getHeader(RESOURCE_TTL, configuration::getTtl, long.class);

        ObjectHelper.notNull(key, RESOURCE_KEY);
        ObjectHelper.notNull(val, RESOURCE_VALUE);

        if (ttl > 0) {
            map.put(key, val, Duration.ofMillis(ttl)).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.put(key, val).thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("PUT_IF_ABSENT")
    boolean onPutIfAbsent(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final Object key = message.getHeader(RESOURCE_KEY, configuration::getKey, Object.class);
        final Object val = message.getHeader(RESOURCE_VALUE, message::getBody, Object.class);
        final long ttl = message.getHeader(RESOURCE_TTL, configuration::getTtl, long.class);

        ObjectHelper.notNull(key, RESOURCE_KEY);
        ObjectHelper.notNull(val, RESOURCE_VALUE);

        if (ttl > 0) {
            map.putIfAbsent(key, val, Duration.ofMillis(ttl)).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.putIfAbsent(key, val).thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("GET")
    boolean onGet(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final Object key = message.getHeader(RESOURCE_KEY, configuration::getKey, Object.class);
        final Object defaultValue = message.getHeader(RESOURCE_DEFAULT_VALUE);
        final ReadConsistency consistency = message.getHeader(RESOURCE_READ_CONSISTENCY,  configuration::getReadConsistency, ReadConsistency.class);

        ObjectHelper.notNull(key, RESOURCE_KEY);

        if (consistency != null) {
            if (defaultValue != null) {
                map.getOrDefault(key, defaultValue, consistency).thenAccept(
                    result -> processResult(message, callback, result)
                );
            } else {
                map.get(key, consistency).thenAccept(
                    result -> processResult(message, callback, result)
                );
            }
        } else {
            if (defaultValue != null) {
                map.getOrDefault(key, defaultValue).thenAccept(
                    result -> processResult(message, callback, result)
                );
            } else {
                map.get(key).thenAccept(
                    result -> processResult(message, callback, result)
                );
            }
        }

        return false;
    }

    @InvokeOnHeader("CLEAR")
    boolean onClear(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);

        map.clear().thenAccept(
            result -> processResult(message, callback, result)
        );

        return false;
    }

    @InvokeOnHeader("SIZE")
    boolean onSize(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final ReadConsistency consistency = message.getHeader(RESOURCE_READ_CONSISTENCY,  configuration::getReadConsistency, ReadConsistency.class);

        if (consistency != null) {
            map.size(consistency).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.size().thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("IS_EMPTY")
    boolean onIsEmpty(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final ReadConsistency consistency = message.getHeader(RESOURCE_READ_CONSISTENCY,  configuration::getReadConsistency, ReadConsistency.class);

        if (consistency != null) {
            map.isEmpty(consistency).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.isEmpty().thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("ENTRY_SET")
    boolean onEntrySet(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final ReadConsistency consistency = message.getHeader(RESOURCE_READ_CONSISTENCY, configuration::getReadConsistency, ReadConsistency.class);

        if (consistency != null) {
            map.entrySet(consistency).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.entrySet().thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("VALUES")
    boolean onValues(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final ReadConsistency consistency = message.getHeader(RESOURCE_READ_CONSISTENCY, configuration::getReadConsistency, ReadConsistency.class);

        if (consistency != null) {
            map.values(consistency).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.values().thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("CONTAINS_KEY")
    boolean onContainsKey(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final ReadConsistency consistency = message.getHeader(RESOURCE_READ_CONSISTENCY,  configuration::getReadConsistency, ReadConsistency.class);
        final Object key = message.getHeader(RESOURCE_KEY, message::getBody, Object.class);

        ObjectHelper.notNull(key, RESOURCE_KEY);

        if (consistency != null) {
            map.containsKey(key, consistency).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.containsKey(key).thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("CONTAINS_VALUE")
    boolean onContainsValue(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final ReadConsistency consistency = message.getHeader(RESOURCE_READ_CONSISTENCY,  configuration::getReadConsistency, ReadConsistency.class);
        final Object value = message.getHeader(RESOURCE_VALUE, message::getBody, Object.class);

        ObjectHelper.notNull(value, RESOURCE_VALUE);

        if (consistency != null) {
            map.containsValue(value, consistency).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.containsValue(value).thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("REMOVE")
    boolean onRemove(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final Object key = message.getHeader(RESOURCE_KEY, message::getBody, Object.class);
        final Object value = message.getHeader(RESOURCE_VALUE, message::getBody, Object.class);

        ObjectHelper.notNull(key, RESOURCE_KEY);

        if (value != null) {
            map.remove(key, value).thenAccept(
                result -> processResult(message, callback, result)
            );
        } else {
            map.remove(key).thenAccept(
                result -> processResult(message, callback, result)
            );
        }

        return false;
    }

    @InvokeOnHeader("REPLACE")
    boolean onReplace(Message message, AsyncCallback callback) throws Exception {
        final DistributedMap<Object, Object> map = getResource(message);
        final long ttl = message.getHeader(RESOURCE_TTL, configuration::getTtl, long.class);
        final Object key = message.getHeader(RESOURCE_KEY, configuration::getKey, Object.class);
        final Object newValue = message.getHeader(RESOURCE_VALUE, message::getBody, Object.class);
        final Object oldValue = message.getHeader(RESOURCE_OLD_VALUE, Object.class);

        ObjectHelper.notNull(key, RESOURCE_KEY);
        ObjectHelper.notNull(newValue, RESOURCE_VALUE);

        if (ttl > 0) {
            if (oldValue != null) {
                map.replace(key, oldValue, newValue, Duration.ofMillis(ttl)).thenAccept(
                    result -> processResult(message, callback, result)
                );
            } else {
                map.replace(key, newValue, Duration.ofMillis(ttl)).thenAccept(
                    result -> processResult(message, callback, result)
                );
            }
        } else {
            if (oldValue != null) {
                map.replace(key, oldValue, newValue).thenAccept(
                    result -> processResult(message, callback, result)
                );
            } else {
                map.replace(key, newValue).thenAccept(
                    result -> processResult(message, callback, result)
                );
            }
        }

        return false;
    }

    // *********************************
    // Implementation
    // *********************************

    @Override
    protected String getProcessorKey(Message message) {
        return message.getHeader(RESOURCE_ACTION, configuration::getDefaultAction, String.class);
    }

    @Override
    protected String getResourceName(Message message) {
        return message.getHeader(RESOURCE_NAME, getAtomixEndpoint()::getResourceName, String.class);
    }

    @Override
    protected DistributedMap<Object, Object> createResource(String resourceName) {
        return getAtomixEndpoint()
            .getAtomix()
            .getMap(
                resourceName,
                new DistributedMap.Config(getAtomixEndpoint().getConfiguration().getResourceOptions(resourceName)),
                new DistributedMap.Options(getAtomixEndpoint().getConfiguration().getResourceConfig(resourceName)))
            .join();
    }
}

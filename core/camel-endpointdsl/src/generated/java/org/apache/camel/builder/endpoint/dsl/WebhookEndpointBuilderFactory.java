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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The webhook component allows other Camel components that can receive push
 * notifications to expose webhook endpoints and automatically register them
 * with their own webhook provider.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface WebhookEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Webhook component.
     */
    public interface WebhookEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedWebhookEndpointBuilder advanced() {
            return (AdvancedWebhookEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default WebhookEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default WebhookEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Automatically register the webhook at startup and unregister it on
         * shutdown.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default WebhookEndpointBuilder webhookAutoRegister(
                boolean webhookAutoRegister) {
            doSetProperty("webhookAutoRegister", webhookAutoRegister);
            return this;
        }
        /**
         * Automatically register the webhook at startup and unregister it on
         * shutdown.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default WebhookEndpointBuilder webhookAutoRegister(
                String webhookAutoRegister) {
            doSetProperty("webhookAutoRegister", webhookAutoRegister);
            return this;
        }
        /**
         * The first (base) path element where the webhook will be exposed. It's
         * a good practice to set it to a random string, so that it cannot be
         * guessed by unauthorized parties.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookEndpointBuilder webhookBasePath(String webhookBasePath) {
            doSetProperty("webhookBasePath", webhookBasePath);
            return this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * netty-http.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookEndpointBuilder webhookComponentName(
                String webhookComponentName) {
            doSetProperty("webhookComponentName", webhookComponentName);
            return this;
        }
        /**
         * The URL of the current service as seen by the webhook provider.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookEndpointBuilder webhookExternalUrl(
                String webhookExternalUrl) {
            doSetProperty("webhookExternalUrl", webhookExternalUrl);
            return this;
        }
        /**
         * The path where the webhook endpoint will be exposed (relative to
         * basePath, if any).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default WebhookEndpointBuilder webhookPath(String webhookPath) {
            doSetProperty("webhookPath", webhookPath);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Webhook component.
     */
    public interface AdvancedWebhookEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default WebhookEndpointBuilder basic() {
            return (WebhookEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedWebhookEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedWebhookEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedWebhookEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedWebhookEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedWebhookEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedWebhookEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedWebhookEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedWebhookEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface WebhookBuilders {
        /**
         * Webhook (camel-webhook)
         * The webhook component allows other Camel components that can receive
         * push notifications to expose webhook endpoints and automatically
         * register them with their own webhook provider.
         * 
         * Category: cloud
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-webhook
         * 
         * Syntax: <code>webhook:endpointUri</code>
         * 
         * Path parameter: endpointUri (required)
         * The delegate uri. Must belong to a component that supports webhooks.
         */
        default WebhookEndpointBuilder webhook(String path) {
            return WebhookEndpointBuilderFactory.webhook(path);
        }
    }
    /**
     * Webhook (camel-webhook)
     * The webhook component allows other Camel components that can receive push
     * notifications to expose webhook endpoints and automatically register them
     * with their own webhook provider.
     * 
     * Category: cloud
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-webhook
     * 
     * Syntax: <code>webhook:endpointUri</code>
     * 
     * Path parameter: endpointUri (required)
     * The delegate uri. Must belong to a component that supports webhooks.
     */
    static WebhookEndpointBuilder webhook(String path) {
        class WebhookEndpointBuilderImpl extends AbstractEndpointBuilder implements WebhookEndpointBuilder, AdvancedWebhookEndpointBuilder {
            public WebhookEndpointBuilderImpl(String path) {
                super("webhook", path);
            }
        }
        return new WebhookEndpointBuilderImpl(path);
    }
}
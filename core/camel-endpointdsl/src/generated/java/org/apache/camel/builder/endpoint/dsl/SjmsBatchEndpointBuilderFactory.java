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

import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Generated;
import org.apache.camel.AggregationStrategy;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Predicate;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * The sjms-batch component is a specialized for highly performant,
 * transactional batch consumption from a JMS queue.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SjmsBatchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Simple JMS Batch component.
     */
    public interface SjmsBatchEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedSjmsBatchEndpointBuilder advanced() {
            return (AdvancedSjmsBatchEndpointBuilder) this;
        }
        /**
         * The aggregation strategy to use, which merges all the batched
         * messages into a single message.
         * 
         * The option is a: <code>org.apache.camel.AggregationStrategy</code>
         * type.
         * 
         * Required: true
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder aggregationStrategy(
                AggregationStrategy aggregationStrategy) {
            doSetProperty("aggregationStrategy", aggregationStrategy);
            return this;
        }
        /**
         * The aggregation strategy to use, which merges all the batched
         * messages into a single message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.AggregationStrategy</code> type.
         * 
         * Required: true
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder aggregationStrategy(
                String aggregationStrategy) {
            doSetProperty("aggregationStrategy", aggregationStrategy);
            return this;
        }
        /**
         * Whether to allow sending messages with no body. If this option is
         * false and the message body is null, then an JMSException is thrown.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder allowNullBody(boolean allowNullBody) {
            doSetProperty("allowNullBody", allowNullBody);
            return this;
        }
        /**
         * Whether to allow sending messages with no body. If this option is
         * false and the message body is null, then an JMSException is thrown.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder allowNullBody(String allowNullBody) {
            doSetProperty("allowNullBody", allowNullBody);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder bridgeErrorHandler(
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
        default SjmsBatchEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The completion interval in millis, which causes batches to be
         * completed in a scheduled fixed rate every interval. The batch may be
         * empty if the timeout triggered and there was no messages in the
         * batch. Notice you cannot use both completion timeout and completion
         * interval at the same time, only one can be configured.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1000
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionInterval(
                int completionInterval) {
            doSetProperty("completionInterval", completionInterval);
            return this;
        }
        /**
         * The completion interval in millis, which causes batches to be
         * completed in a scheduled fixed rate every interval. The batch may be
         * empty if the timeout triggered and there was no messages in the
         * batch. Notice you cannot use both completion timeout and completion
         * interval at the same time, only one can be configured.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1000
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionInterval(
                String completionInterval) {
            doSetProperty("completionInterval", completionInterval);
            return this;
        }
        /**
         * The completion predicate, which causes batches to be completed when
         * the predicate evaluates as true. The predicate can also be configured
         * using the simple language using the string syntax. You may want to
         * set the option eagerCheckCompletion to true to let the predicate
         * match the incoming message, as otherwise it matches the aggregated
         * message.
         * 
         * The option is a: <code>org.apache.camel.Predicate</code> type.
         * 
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionPredicate(
                Predicate completionPredicate) {
            doSetProperty("completionPredicate", completionPredicate);
            return this;
        }
        /**
         * The completion predicate, which causes batches to be completed when
         * the predicate evaluates as true. The predicate can also be configured
         * using the simple language using the string syntax. You may want to
         * set the option eagerCheckCompletion to true to let the predicate
         * match the incoming message, as otherwise it matches the aggregated
         * message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.Predicate</code> type.
         * 
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionPredicate(
                String completionPredicate) {
            doSetProperty("completionPredicate", completionPredicate);
            return this;
        }
        /**
         * The number of messages consumed at which the batch will be completed.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 200
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionSize(int completionSize) {
            doSetProperty("completionSize", completionSize);
            return this;
        }
        /**
         * The number of messages consumed at which the batch will be completed.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 200
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionSize(String completionSize) {
            doSetProperty("completionSize", completionSize);
            return this;
        }
        /**
         * The timeout in millis from receipt of the first first message when
         * the batch will be completed. The batch may be empty if the timeout
         * triggered and there was no messages in the batch. Notice you cannot
         * use both completion timeout and completion interval at the same time,
         * only one can be configured.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 500
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionTimeout(int completionTimeout) {
            doSetProperty("completionTimeout", completionTimeout);
            return this;
        }
        /**
         * The timeout in millis from receipt of the first first message when
         * the batch will be completed. The batch may be empty if the timeout
         * triggered and there was no messages in the batch. Notice you cannot
         * use both completion timeout and completion interval at the same time,
         * only one can be configured.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 500
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder completionTimeout(
                String completionTimeout) {
            doSetProperty("completionTimeout", completionTimeout);
            return this;
        }
        /**
         * The number of JMS sessions to consume from.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder consumerCount(int consumerCount) {
            doSetProperty("consumerCount", consumerCount);
            return this;
        }
        /**
         * The number of JMS sessions to consume from.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder consumerCount(String consumerCount) {
            doSetProperty("consumerCount", consumerCount);
            return this;
        }
        /**
         * Use eager completion checking which means that the
         * completionPredicate will use the incoming Exchange. As opposed to
         * without eager completion checking the completionPredicate will use
         * the aggregated Exchange.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder eagerCheckCompletion(
                boolean eagerCheckCompletion) {
            doSetProperty("eagerCheckCompletion", eagerCheckCompletion);
            return this;
        }
        /**
         * Use eager completion checking which means that the
         * completionPredicate will use the incoming Exchange. As opposed to
         * without eager completion checking the completionPredicate will use
         * the aggregated Exchange.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder eagerCheckCompletion(
                String eagerCheckCompletion) {
            doSetProperty("eagerCheckCompletion", eagerCheckCompletion);
            return this;
        }
        /**
         * Whether to include all JMSXxxx properties when mapping from JMS to
         * Camel Message. Setting this to true will include properties such as
         * JMSXAppID, and JMSXUserID etc. Note: If you are using a custom
         * headerFilterStrategy then this option does not apply.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder includeAllJMSXProperties(
                boolean includeAllJMSXProperties) {
            doSetProperty("includeAllJMSXProperties", includeAllJMSXProperties);
            return this;
        }
        /**
         * Whether to include all JMSXxxx properties when mapping from JMS to
         * Camel Message. Setting this to true will include properties such as
         * JMSXAppID, and JMSXUserID etc. Note: If you are using a custom
         * headerFilterStrategy then this option does not apply.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder includeAllJMSXProperties(
                String includeAllJMSXProperties) {
            doSetProperty("includeAllJMSXProperties", includeAllJMSXProperties);
            return this;
        }
        /**
         * Specifies whether Camel should auto map the received JMS message to a
         * suited payload type, such as javax.jms.TextMessage to a String etc.
         * See section about how mapping works below for more details.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder mapJmsMessage(boolean mapJmsMessage) {
            doSetProperty("mapJmsMessage", mapJmsMessage);
            return this;
        }
        /**
         * Specifies whether Camel should auto map the received JMS message to a
         * suited payload type, such as javax.jms.TextMessage to a String etc.
         * See section about how mapping works below for more details.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder mapJmsMessage(String mapJmsMessage) {
            doSetProperty("mapJmsMessage", mapJmsMessage);
            return this;
        }
        /**
         * The duration in milliseconds of each poll for messages.
         * completionTimeOut will be used if it is shorter and a batch has
         * started.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1000
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder pollDuration(int pollDuration) {
            doSetProperty("pollDuration", pollDuration);
            return this;
        }
        /**
         * The duration in milliseconds of each poll for messages.
         * completionTimeOut will be used if it is shorter and a batch has
         * started.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1000
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder pollDuration(String pollDuration) {
            doSetProperty("pollDuration", pollDuration);
            return this;
        }
        /**
         * If using completion timeout or interval, then the batch may be empty
         * if the timeout triggered and there was no messages in the batch. If
         * this option is true and the batch is empty then an empty message is
         * added to the batch so an empty message is routed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If using completion timeout or interval, then the batch may be empty
         * if the timeout triggered and there was no messages in the batch. If
         * this option is true and the batch is empty then an empty message is
         * added to the batch so an empty message is routed.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SjmsBatchEndpointBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Simple JMS Batch component.
     */
    public interface AdvancedSjmsBatchEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default SjmsBatchEndpointBuilder basic() {
            return (SjmsBatchEndpointBuilder) this;
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
        default AdvancedSjmsBatchEndpointBuilder exceptionHandler(
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
        default AdvancedSjmsBatchEndpointBuilder exceptionHandler(
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
        default AdvancedSjmsBatchEndpointBuilder exchangePattern(
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
        default AdvancedSjmsBatchEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether to startup the consumer message listener asynchronously, when
         * starting a route. For example if a JmsConsumer cannot get a
         * connection to a remote JMS broker, then it may block while retrying
         * and/or failover. This will cause Camel to block while starting
         * routes. By setting this option to true, you will let routes startup,
         * while the JmsConsumer connects to the JMS broker using a dedicated
         * thread in asynchronous mode. If this option is used, then beware that
         * if the connection could not be established, then an exception is
         * logged at WARN level, and the consumer will not be able to receive
         * messages; You can then restart the route to retry.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder asyncStartListener(
                boolean asyncStartListener) {
            doSetProperty("asyncStartListener", asyncStartListener);
            return this;
        }
        /**
         * Whether to startup the consumer message listener asynchronously, when
         * starting a route. For example if a JmsConsumer cannot get a
         * connection to a remote JMS broker, then it may block while retrying
         * and/or failover. This will cause Camel to block while starting
         * routes. By setting this option to true, you will let routes startup,
         * while the JmsConsumer connects to the JMS broker using a dedicated
         * thread in asynchronous mode. If this option is used, then beware that
         * if the connection could not be established, then an exception is
         * logged at WARN level, and the consumer will not be able to receive
         * messages; You can then restart the route to retry.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder asyncStartListener(
                String asyncStartListener) {
            doSetProperty("asyncStartListener", asyncStartListener);
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
        default AdvancedSjmsBatchEndpointBuilder basicPropertyBinding(
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
        default AdvancedSjmsBatchEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to filter header to and from
         * Camel message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * Pluggable strategy for encoding and decoding JMS keys so they can be
         * compliant with the JMS specification. Camel provides two
         * implementations out of the box: default and passthrough. The default
         * strategy will safely marshal dots and hyphens (. and -). The
         * passthrough strategy leaves the key as is. Can be used for JMS
         * brokers which do not care whether JMS header keys contain illegal
         * characters. You can provide your own implementation of the
         * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it
         * using the # notation.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder jmsKeyFormatStrategy(
                Object jmsKeyFormatStrategy) {
            doSetProperty("jmsKeyFormatStrategy", jmsKeyFormatStrategy);
            return this;
        }
        /**
         * Pluggable strategy for encoding and decoding JMS keys so they can be
         * compliant with the JMS specification. Camel provides two
         * implementations out of the box: default and passthrough. The default
         * strategy will safely marshal dots and hyphens (. and -). The
         * passthrough strategy leaves the key as is. Can be used for JMS
         * brokers which do not care whether JMS header keys contain illegal
         * characters. You can provide your own implementation of the
         * org.apache.camel.component.jms.JmsKeyFormatStrategy and refer to it
         * using the # notation.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder jmsKeyFormatStrategy(
                String jmsKeyFormatStrategy) {
            doSetProperty("jmsKeyFormatStrategy", jmsKeyFormatStrategy);
            return this;
        }
        /**
         * The delay in millis between attempts to re-establish a valid session.
         * If this is a positive value the SjmsBatchConsumer will attempt to
         * create a new session if it sees an IllegalStateException during
         * message consumption. This delay value allows you to pause between
         * attempts to prevent spamming the logs. If this is a negative value
         * (default is -1) then the SjmsBatchConsumer will behave as it always
         * has before - that is it will bail out and the route will shut down if
         * it sees an IllegalStateException.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder keepAliveDelay(
                int keepAliveDelay) {
            doSetProperty("keepAliveDelay", keepAliveDelay);
            return this;
        }
        /**
         * The delay in millis between attempts to re-establish a valid session.
         * If this is a positive value the SjmsBatchConsumer will attempt to
         * create a new session if it sees an IllegalStateException during
         * message consumption. This delay value allows you to pause between
         * attempts to prevent spamming the logs. If this is a negative value
         * (default is -1) then the SjmsBatchConsumer will behave as it always
         * has before - that is it will bail out and the route will shut down if
         * it sees an IllegalStateException.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: -1
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder keepAliveDelay(
                String keepAliveDelay) {
            doSetProperty("keepAliveDelay", keepAliveDelay);
            return this;
        }
        /**
         * To use the given MessageCreatedStrategy which are invoked when Camel
         * creates new instances of javax.jms.Message objects when Camel is
         * sending a JMS message.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sjms.jms.MessageCreatedStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder messageCreatedStrategy(
                Object messageCreatedStrategy) {
            doSetProperty("messageCreatedStrategy", messageCreatedStrategy);
            return this;
        }
        /**
         * To use the given MessageCreatedStrategy which are invoked when Camel
         * creates new instances of javax.jms.Message objects when Camel is
         * sending a JMS message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.sjms.jms.MessageCreatedStrategy</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder messageCreatedStrategy(
                String messageCreatedStrategy) {
            doSetProperty("messageCreatedStrategy", messageCreatedStrategy);
            return this;
        }
        /**
         * Specifies the interval between recovery attempts, i.e. when a
         * connection is being refreshed, in milliseconds. The default is 5000
         * ms, that is, 5 seconds.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder recoveryInterval(
                int recoveryInterval) {
            doSetProperty("recoveryInterval", recoveryInterval);
            return this;
        }
        /**
         * Specifies the interval between recovery attempts, i.e. when a
         * connection is being refreshed, in milliseconds. The default is 5000
         * ms, that is, 5 seconds.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 5000
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder recoveryInterval(
                String recoveryInterval) {
            doSetProperty("recoveryInterval", recoveryInterval);
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
        default AdvancedSjmsBatchEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedSjmsBatchEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * If using the completionInterval option a background thread is created
         * to trigger the completion interval. Set this option to provide a
         * custom thread pool to be used rather than creating a new thread for
         * every consumer.
         * 
         * The option is a:
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder timeoutCheckerExecutorService(
                ScheduledExecutorService timeoutCheckerExecutorService) {
            doSetProperty("timeoutCheckerExecutorService", timeoutCheckerExecutorService);
            return this;
        }
        /**
         * If using the completionInterval option a background thread is created
         * to trigger the completion interval. Set this option to provide a
         * custom thread pool to be used rather than creating a new thread for
         * every consumer.
         * 
         * The option will be converted to a
         * <code>java.util.concurrent.ScheduledExecutorService</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSjmsBatchEndpointBuilder timeoutCheckerExecutorService(
                String timeoutCheckerExecutorService) {
            doSetProperty("timeoutCheckerExecutorService", timeoutCheckerExecutorService);
            return this;
        }
    }

    public interface SjmsBatchBuilders {
        /**
         * Simple JMS Batch (camel-sjms)
         * The sjms-batch component is a specialized for highly performant,
         * transactional batch consumption from a JMS queue.
         * 
         * Category: messaging
         * Since: 2.16
         * Maven coordinates: org.apache.camel:camel-sjms
         * 
         * Syntax: <code>sjms-batch:destinationName</code>
         * 
         * Path parameter: destinationName (required)
         * The destination name. Only queues are supported, names may be
         * prefixed by 'queue:'.
         */
        default SjmsBatchEndpointBuilder sjmsBatch(String path) {
            return SjmsBatchEndpointBuilderFactory.sjmsBatch(path);
        }
    }
    /**
     * Simple JMS Batch (camel-sjms)
     * The sjms-batch component is a specialized for highly performant,
     * transactional batch consumption from a JMS queue.
     * 
     * Category: messaging
     * Since: 2.16
     * Maven coordinates: org.apache.camel:camel-sjms
     * 
     * Syntax: <code>sjms-batch:destinationName</code>
     * 
     * Path parameter: destinationName (required)
     * The destination name. Only queues are supported, names may be prefixed by
     * 'queue:'.
     */
    static SjmsBatchEndpointBuilder sjmsBatch(String path) {
        class SjmsBatchEndpointBuilderImpl extends AbstractEndpointBuilder implements SjmsBatchEndpointBuilder, AdvancedSjmsBatchEndpointBuilder {
            public SjmsBatchEndpointBuilderImpl(String path) {
                super("sjms-batch", path);
            }
        }
        return new SjmsBatchEndpointBuilderImpl(path);
    }
}
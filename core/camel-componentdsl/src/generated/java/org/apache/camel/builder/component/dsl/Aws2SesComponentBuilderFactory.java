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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.ses.Ses2Component;

/**
 * The aws2-ses component is used for sending emails with Amazon's SES service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2SesComponentBuilderFactory {

    /**
     * AWS 2 Simple Email Service (camel-aws2-ses)
     * The aws2-ses component is used for sending emails with Amazon's SES
     * service.
     * 
     * Category: cloud,mail
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-ses
     */
    static Aws2SesComponentBuilder aws2Ses() {
        return new Aws2SesComponentBuilderImpl();
    }

    /**
     * Builder for the AWS 2 Simple Email Service component.
     */
    interface Aws2SesComponentBuilder extends ComponentBuilder<Ses2Component> {
        /**
         * To use the AmazonSimpleEmailService as the client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.ses.SesClient</code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder amazonSESClient(
                software.amazon.awssdk.services.ses.SesClient amazonSESClient) {
            doSetProperty("amazonSESClient", amazonSESClient);
            return this;
        }
        /**
         * component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.ses.Ses2Configuration</code>
         * type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder configuration(
                org.apache.camel.component.aws2.ses.Ses2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Aws2SesComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SES client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SES client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Aws2SesComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which SES client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * List of reply-to email address(es) for the message, override it using
         * 'CamelAwsSesReplyToAddresses' header.
         * 
         * The option is a: <code>java.util.List<java.lang.String></code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder replyToAddresses(
                java.util.List<java.lang.String> replyToAddresses) {
            doSetProperty("replyToAddresses", replyToAddresses);
            return this;
        }
        /**
         * The email address to which bounce notifications are to be forwarded,
         * override it using 'CamelAwsSesReturnPath' header.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder returnPath(java.lang.String returnPath) {
            doSetProperty("returnPath", returnPath);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSesSubject'
         * is not present.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder subject(java.lang.String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * List of destination email address. Can be overriden with
         * 'CamelAwsSesTo' header.
         * 
         * The option is a: <code>java.util.List<java.lang.String></code> type.
         * 
         * Group: producer
         */
        default Aws2SesComponentBuilder to(java.util.List<java.lang.String> to) {
            doSetProperty("to", to);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default Aws2SesComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2SesComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Aws2SesComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2SesComponentBuilderImpl
            extends
                AbstractComponentBuilder<Ses2Component>
            implements
                Aws2SesComponentBuilder {
        @Override
        protected Ses2Component buildConcreteComponent() {
            return new Ses2Component();
        }
        private org.apache.camel.component.aws2.ses.Ses2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.ses.Ses2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.ses.Ses2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonSESClient": getOrCreateConfiguration((Ses2Component) component).setAmazonSESClient((software.amazon.awssdk.services.ses.SesClient) value); return true;
            case "configuration": ((Ses2Component) component).setConfiguration((org.apache.camel.component.aws2.ses.Ses2Configuration) value); return true;
            case "lazyStartProducer": ((Ses2Component) component).setLazyStartProducer((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((Ses2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Ses2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Ses2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((Ses2Component) component).setRegion((java.lang.String) value); return true;
            case "replyToAddresses": getOrCreateConfiguration((Ses2Component) component).setReplyToAddresses((java.util.List) value); return true;
            case "returnPath": getOrCreateConfiguration((Ses2Component) component).setReturnPath((java.lang.String) value); return true;
            case "subject": getOrCreateConfiguration((Ses2Component) component).setSubject((java.lang.String) value); return true;
            case "to": getOrCreateConfiguration((Ses2Component) component).setTo((java.util.List) value); return true;
            case "basicPropertyBinding": ((Ses2Component) component).setBasicPropertyBinding((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((Ses2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Ses2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}
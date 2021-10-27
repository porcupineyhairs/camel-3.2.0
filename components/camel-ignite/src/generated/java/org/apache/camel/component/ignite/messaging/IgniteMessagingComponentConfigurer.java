/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ignite.messaging;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class IgniteMessagingComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IgniteMessagingComponent target = (IgniteMessagingComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configurationresource":
        case "configurationResource": target.setConfigurationResource(property(camelContext, java.lang.Object.class, value)); return true;
        case "ignite": target.setIgnite(property(camelContext, org.apache.ignite.Ignite.class, value)); return true;
        case "igniteconfiguration":
        case "igniteConfiguration": target.setIgniteConfiguration(property(camelContext, org.apache.ignite.configuration.IgniteConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("configurationResource", java.lang.Object.class);
        answer.put("ignite", org.apache.ignite.Ignite.class);
        answer.put("igniteConfiguration", org.apache.ignite.configuration.IgniteConfiguration.class);
        answer.put("lazyStartProducer", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IgniteMessagingComponent target = (IgniteMessagingComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configurationresource":
        case "configurationResource": return target.getConfigurationResource();
        case "ignite": return target.getIgnite();
        case "igniteconfiguration":
        case "igniteConfiguration": return target.getIgniteConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return null;
        }
    }
}


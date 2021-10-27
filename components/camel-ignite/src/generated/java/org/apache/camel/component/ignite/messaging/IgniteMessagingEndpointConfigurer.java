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
public class IgniteMessagingEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IgniteMessagingEndpoint target = (IgniteMessagingEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clustergroupexpression":
        case "clusterGroupExpression": target.setClusterGroupExpression(property(camelContext, org.apache.camel.component.ignite.ClusterGroupExpression.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": target.setPropagateIncomingBodyIfNoReturnValue(property(camelContext, boolean.class, value)); return true;
        case "sendmode":
        case "sendMode": target.setSendMode(property(camelContext, org.apache.camel.component.ignite.messaging.IgniteMessagingSendMode.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, java.lang.Long.class, value)); return true;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": target.setTreatCollectionsAsCacheObjects(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("clusterGroupExpression", org.apache.camel.component.ignite.ClusterGroupExpression.class);
        answer.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        answer.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("propagateIncomingBodyIfNoReturnValue", boolean.class);
        answer.put("sendMode", org.apache.camel.component.ignite.messaging.IgniteMessagingSendMode.class);
        answer.put("synchronous", boolean.class);
        answer.put("timeout", java.lang.Long.class);
        answer.put("treatCollectionsAsCacheObjects", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IgniteMessagingEndpoint target = (IgniteMessagingEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clustergroupexpression":
        case "clusterGroupExpression": return target.getClusterGroupExpression();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return target.isPropagateIncomingBodyIfNoReturnValue();
        case "sendmode":
        case "sendMode": return target.getSendMode();
        case "synchronous": return target.isSynchronous();
        case "timeout": return target.getTimeout();
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return target.isTreatCollectionsAsCacheObjects();
        default: return null;
        }
    }
}

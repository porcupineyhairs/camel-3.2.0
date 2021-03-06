/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ignite.compute;

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
public class IgniteComputeEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IgniteComputeEndpoint target = (IgniteComputeEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clustergroupexpression":
        case "clusterGroupExpression": target.setClusterGroupExpression(property(camelContext, org.apache.camel.component.ignite.ClusterGroupExpression.class, value)); return true;
        case "computename":
        case "computeName": target.setComputeName(property(camelContext, java.lang.String.class, value)); return true;
        case "executiontype":
        case "executionType": target.setExecutionType(property(camelContext, org.apache.camel.component.ignite.compute.IgniteComputeExecutionType.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": target.setPropagateIncomingBodyIfNoReturnValue(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "taskname":
        case "taskName": target.setTaskName(property(camelContext, java.lang.String.class, value)); return true;
        case "timeoutmillis":
        case "timeoutMillis": target.setTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": target.setTreatCollectionsAsCacheObjects(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("clusterGroupExpression", org.apache.camel.component.ignite.ClusterGroupExpression.class);
        answer.put("computeName", java.lang.String.class);
        answer.put("executionType", org.apache.camel.component.ignite.compute.IgniteComputeExecutionType.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("propagateIncomingBodyIfNoReturnValue", boolean.class);
        answer.put("synchronous", boolean.class);
        answer.put("taskName", java.lang.String.class);
        answer.put("timeoutMillis", java.lang.Long.class);
        answer.put("treatCollectionsAsCacheObjects", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IgniteComputeEndpoint target = (IgniteComputeEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clustergroupexpression":
        case "clusterGroupExpression": return target.getClusterGroupExpression();
        case "computename":
        case "computeName": return target.getComputeName();
        case "executiontype":
        case "executionType": return target.getExecutionType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return target.isPropagateIncomingBodyIfNoReturnValue();
        case "synchronous": return target.isSynchronous();
        case "taskname":
        case "taskName": return target.getTaskName();
        case "timeoutmillis":
        case "timeoutMillis": return target.getTimeoutMillis();
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return target.isTreatCollectionsAsCacheObjects();
        default: return null;
        }
    }
}


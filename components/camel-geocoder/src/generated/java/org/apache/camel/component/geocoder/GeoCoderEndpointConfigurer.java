/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.geocoder;

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
public class GeoCoderEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GeoCoderEndpoint target = (GeoCoderEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apikey":
        case "apiKey": target.setApiKey(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkey":
        case "clientKey": target.setClientKey(property(camelContext, java.lang.String.class, value)); return true;
        case "headersonly":
        case "headersOnly": target.setHeadersOnly(property(camelContext, boolean.class, value)); return true;
        case "language": target.setLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "proxyauthdomain":
        case "proxyAuthDomain": target.setProxyAuthDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthhost":
        case "proxyAuthHost": target.setProxyAuthHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthmethod":
        case "proxyAuthMethod": target.setProxyAuthMethod(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthpassword":
        case "proxyAuthPassword": target.setProxyAuthPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyauthusername":
        case "proxyAuthUsername": target.setProxyAuthUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("apiKey", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("clientId", java.lang.String.class);
        answer.put("clientKey", java.lang.String.class);
        answer.put("headersOnly", boolean.class);
        answer.put("language", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("proxyAuthDomain", java.lang.String.class);
        answer.put("proxyAuthHost", java.lang.String.class);
        answer.put("proxyAuthMethod", java.lang.String.class);
        answer.put("proxyAuthPassword", java.lang.String.class);
        answer.put("proxyAuthUsername", java.lang.String.class);
        answer.put("proxyHost", java.lang.String.class);
        answer.put("proxyPort", java.lang.Integer.class);
        answer.put("synchronous", boolean.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GeoCoderEndpoint target = (GeoCoderEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apikey":
        case "apiKey": return target.getApiKey();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clientid":
        case "clientId": return target.getClientId();
        case "clientkey":
        case "clientKey": return target.getClientKey();
        case "headersonly":
        case "headersOnly": return target.isHeadersOnly();
        case "language": return target.getLanguage();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "proxyauthdomain":
        case "proxyAuthDomain": return target.getProxyAuthDomain();
        case "proxyauthhost":
        case "proxyAuthHost": return target.getProxyAuthHost();
        case "proxyauthmethod":
        case "proxyAuthMethod": return target.getProxyAuthMethod();
        case "proxyauthpassword":
        case "proxyAuthPassword": return target.getProxyAuthPassword();
        case "proxyauthusername":
        case "proxyAuthUsername": return target.getProxyAuthUsername();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getProxyPort();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

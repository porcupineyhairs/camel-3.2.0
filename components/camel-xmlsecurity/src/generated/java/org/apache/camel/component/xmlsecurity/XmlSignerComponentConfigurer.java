/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmlsecurity;

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
public class XmlSignerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration getOrCreateConfiguration(XmlSignerComponent target) {
        if (target.getSignerConfiguration() == null) {
            target.setSignerConfiguration(new org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration());
        }
        return target.getSignerConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XmlSignerComponent target = (XmlSignerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addkeyinforeference":
        case "addKeyInfoReference": getOrCreateConfiguration(target).setAddKeyInfoReference(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "baseuri":
        case "baseUri": getOrCreateConfiguration(target).setBaseUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "canonicalizationmethod":
        case "canonicalizationMethod": getOrCreateConfiguration(target).setCanonicalizationMethod(property(camelContext, javax.xml.crypto.AlgorithmMethod.class, value)); return true;
        case "clearheaders":
        case "clearHeaders": getOrCreateConfiguration(target).setClearHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "contentobjectid":
        case "contentObjectId": getOrCreateConfiguration(target).setContentObjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "contentreferencetype":
        case "contentReferenceType": getOrCreateConfiguration(target).setContentReferenceType(property(camelContext, java.lang.String.class, value)); return true;
        case "contentreferenceuri":
        case "contentReferenceUri": getOrCreateConfiguration(target).setContentReferenceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "cryptocontextproperties":
        case "cryptoContextProperties": getOrCreateConfiguration(target).setCryptoContextProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "digestalgorithm":
        case "digestAlgorithm": getOrCreateConfiguration(target).setDigestAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": getOrCreateConfiguration(target).setDisallowDoctypeDecl(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "keyaccessor":
        case "keyAccessor": getOrCreateConfiguration(target).setKeyAccessor(property(camelContext, org.apache.camel.component.xmlsecurity.api.KeyAccessor.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "omitxmldeclaration":
        case "omitXmlDeclaration": getOrCreateConfiguration(target).setOmitXmlDeclaration(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "outputxmlencoding":
        case "outputXmlEncoding": getOrCreateConfiguration(target).setOutputXmlEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "parentlocalname":
        case "parentLocalName": getOrCreateConfiguration(target).setParentLocalName(property(camelContext, java.lang.String.class, value)); return true;
        case "parentnamespace":
        case "parentNamespace": getOrCreateConfiguration(target).setParentNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "parentxpath":
        case "parentXpath": getOrCreateConfiguration(target).setParentXpath(property(camelContext, javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class, value)); return true;
        case "plaintext":
        case "plainText": getOrCreateConfiguration(target).setPlainText(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "plaintextencoding":
        case "plainTextEncoding": getOrCreateConfiguration(target).setPlainTextEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "prefixforxmlsignaturenamespace":
        case "prefixForXmlSignatureNamespace": getOrCreateConfiguration(target).setPrefixForXmlSignatureNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "properties": getOrCreateConfiguration(target).setProperties(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class, value)); return true;
        case "schemaresourceuri":
        case "schemaResourceUri": getOrCreateConfiguration(target).setSchemaResourceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "signaturealgorithm":
        case "signatureAlgorithm": getOrCreateConfiguration(target).setSignatureAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "signatureid":
        case "signatureId": getOrCreateConfiguration(target).setSignatureId(property(camelContext, java.lang.String.class, value)); return true;
        case "signerconfiguration":
        case "signerConfiguration": target.setSignerConfiguration(property(camelContext, org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class, value)); return true;
        case "transformmethods":
        case "transformMethods": getOrCreateConfiguration(target).setTransformMethods(property(camelContext, java.util.List.class, value)); return true;
        case "uridereferencer":
        case "uriDereferencer": getOrCreateConfiguration(target).setUriDereferencer(property(camelContext, javax.xml.crypto.URIDereferencer.class, value)); return true;
        case "xpathstoidattributes":
        case "xpathsToIdAttributes": getOrCreateConfiguration(target).setXpathsToIdAttributes(property(camelContext, java.util.List.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("addKeyInfoReference", java.lang.Boolean.class);
        answer.put("baseUri", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("canonicalizationMethod", javax.xml.crypto.AlgorithmMethod.class);
        answer.put("clearHeaders", java.lang.Boolean.class);
        answer.put("contentObjectId", java.lang.String.class);
        answer.put("contentReferenceType", java.lang.String.class);
        answer.put("contentReferenceUri", java.lang.String.class);
        answer.put("cryptoContextProperties", java.util.Map.class);
        answer.put("digestAlgorithm", java.lang.String.class);
        answer.put("disallowDoctypeDecl", java.lang.Boolean.class);
        answer.put("keyAccessor", org.apache.camel.component.xmlsecurity.api.KeyAccessor.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("omitXmlDeclaration", java.lang.Boolean.class);
        answer.put("outputXmlEncoding", java.lang.String.class);
        answer.put("parentLocalName", java.lang.String.class);
        answer.put("parentNamespace", java.lang.String.class);
        answer.put("parentXpath", javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class);
        answer.put("plainText", java.lang.Boolean.class);
        answer.put("plainTextEncoding", java.lang.String.class);
        answer.put("prefixForXmlSignatureNamespace", java.lang.String.class);
        answer.put("properties", org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class);
        answer.put("schemaResourceUri", java.lang.String.class);
        answer.put("signatureAlgorithm", java.lang.String.class);
        answer.put("signatureId", java.lang.String.class);
        answer.put("signerConfiguration", org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class);
        answer.put("transformMethods", java.util.List.class);
        answer.put("uriDereferencer", javax.xml.crypto.URIDereferencer.class);
        answer.put("xpathsToIdAttributes", java.util.List.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XmlSignerComponent target = (XmlSignerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addkeyinforeference":
        case "addKeyInfoReference": return getOrCreateConfiguration(target).getAddKeyInfoReference();
        case "baseuri":
        case "baseUri": return getOrCreateConfiguration(target).getBaseUri();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "canonicalizationmethod":
        case "canonicalizationMethod": return getOrCreateConfiguration(target).getCanonicalizationMethod();
        case "clearheaders":
        case "clearHeaders": return getOrCreateConfiguration(target).getClearHeaders();
        case "contentobjectid":
        case "contentObjectId": return getOrCreateConfiguration(target).getContentObjectId();
        case "contentreferencetype":
        case "contentReferenceType": return getOrCreateConfiguration(target).getContentReferenceType();
        case "contentreferenceuri":
        case "contentReferenceUri": return getOrCreateConfiguration(target).getContentReferenceUri();
        case "cryptocontextproperties":
        case "cryptoContextProperties": return getOrCreateConfiguration(target).getCryptoContextProperties();
        case "digestalgorithm":
        case "digestAlgorithm": return getOrCreateConfiguration(target).getDigestAlgorithm();
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": return getOrCreateConfiguration(target).getDisallowDoctypeDecl();
        case "keyaccessor":
        case "keyAccessor": return getOrCreateConfiguration(target).getKeyAccessor();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "omitxmldeclaration":
        case "omitXmlDeclaration": return getOrCreateConfiguration(target).getOmitXmlDeclaration();
        case "outputxmlencoding":
        case "outputXmlEncoding": return getOrCreateConfiguration(target).getOutputXmlEncoding();
        case "parentlocalname":
        case "parentLocalName": return getOrCreateConfiguration(target).getParentLocalName();
        case "parentnamespace":
        case "parentNamespace": return getOrCreateConfiguration(target).getParentNamespace();
        case "parentxpath":
        case "parentXpath": return getOrCreateConfiguration(target).getParentXpath();
        case "plaintext":
        case "plainText": return getOrCreateConfiguration(target).getPlainText();
        case "plaintextencoding":
        case "plainTextEncoding": return getOrCreateConfiguration(target).getPlainTextEncoding();
        case "prefixforxmlsignaturenamespace":
        case "prefixForXmlSignatureNamespace": return getOrCreateConfiguration(target).getPrefixForXmlSignatureNamespace();
        case "properties": return getOrCreateConfiguration(target).getProperties();
        case "schemaresourceuri":
        case "schemaResourceUri": return getOrCreateConfiguration(target).getSchemaResourceUri();
        case "signaturealgorithm":
        case "signatureAlgorithm": return getOrCreateConfiguration(target).getSignatureAlgorithm();
        case "signatureid":
        case "signatureId": return getOrCreateConfiguration(target).getSignatureId();
        case "signerconfiguration":
        case "signerConfiguration": return target.getSignerConfiguration();
        case "transformmethods":
        case "transformMethods": return getOrCreateConfiguration(target).getTransformMethods();
        case "uridereferencer":
        case "uriDereferencer": return getOrCreateConfiguration(target).getUriDereferencer();
        case "xpathstoidattributes":
        case "xpathsToIdAttributes": return getOrCreateConfiguration(target).getXpathsToIdAttributes();
        default: return null;
        }
    }
}


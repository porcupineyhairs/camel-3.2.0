/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.tarfile;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TarFileDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        TarFileDataFormat dataformat = (TarFileDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "usingiterator":
        case "usingIterator": dataformat.setUsingIterator(property(camelContext, boolean.class, value)); return true;
        case "allowemptydirectory":
        case "allowEmptyDirectory": dataformat.setAllowEmptyDirectory(property(camelContext, boolean.class, value)); return true;
        case "preservepathelements":
        case "preservePathElements": dataformat.setPreservePathElements(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}


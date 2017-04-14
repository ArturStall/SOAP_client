
package by.gsu.epamlab.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.gsu.epamlab.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConversionRateResponse_QNAME = new QName("http://ws.epamlab.gsu.by/", "conversionRateResponse");
    private final static QName _ConversionRate_QNAME = new QName("http://ws.epamlab.gsu.by/", "conversionRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.gsu.epamlab.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionRateResponse }
     * 
     */
    public ConversionRateResponse createConversionRateResponse() {
        return new ConversionRateResponse();
    }

    /**
     * Create an instance of {@link ConversionRate }
     * 
     */
    public ConversionRate createConversionRate() {
        return new ConversionRate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.epamlab.gsu.by/", name = "conversionRateResponse")
    public JAXBElement<ConversionRateResponse> createConversionRateResponse(ConversionRateResponse value) {
        return new JAXBElement<ConversionRateResponse>(_ConversionRateResponse_QNAME, ConversionRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.epamlab.gsu.by/", name = "conversionRate")
    public JAXBElement<ConversionRate> createConversionRate(ConversionRate value) {
        return new JAXBElement<ConversionRate>(_ConversionRate_QNAME, ConversionRate.class, null, value);
    }

}

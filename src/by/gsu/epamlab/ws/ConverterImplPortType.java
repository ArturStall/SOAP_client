
package by.gsu.epamlab.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ConverterImplPortType", targetNamespace = "http://ws.epamlab.gsu.by/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConverterImplPortType {


    /**
     * 
     * @param toCurrency
     * @param fromCurrency
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "http://ws.epamlab.gsu.by/")
    @RequestWrapper(localName = "conversionRate", targetNamespace = "http://ws.epamlab.gsu.by/", className = "by.gsu.epamlab.ws.ConversionRate")
    @ResponseWrapper(localName = "conversionRateResponse", targetNamespace = "http://ws.epamlab.gsu.by/", className = "by.gsu.epamlab.ws.ConversionRateResponse")
    public double conversionRate(
        @WebParam(name = "fromCurrency", targetNamespace = "http://ws.epamlab.gsu.by/")
        String fromCurrency,
        @WebParam(name = "toCurrency", targetNamespace = "http://ws.epamlab.gsu.by/")
        String toCurrency);

}
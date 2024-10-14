
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ProductWs", targetNamespace = "http://webservice.example.org/", wsdlLocation = "http://localhost:8088/?wsdl")
public class ProductWs
    extends Service
{

    private static final URL PRODUCTWS_WSDL_LOCATION;
    private static final WebServiceException PRODUCTWS_EXCEPTION;
    private static final QName PRODUCTWS_QNAME = new QName("http://webservice.example.org/", "ProductWs");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8088/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTWS_WSDL_LOCATION = url;
        PRODUCTWS_EXCEPTION = e;
    }

    public ProductWs() {
        super(__getWsdlLocation(), PRODUCTWS_QNAME);
    }

    public ProductWs(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTWS_QNAME, features);
    }

    public ProductWs(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTWS_QNAME);
    }

    public ProductWs(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTWS_QNAME, features);
    }

    public ProductWs(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductWs(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductWebService
     */
    @WebEndpoint(name = "ProductWebServicePort")
    public ProductWebService getProductWebServicePort() {
        return super.getPort(new QName("http://webservice.example.org/", "ProductWebServicePort"), ProductWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductWebService
     */
    @WebEndpoint(name = "ProductWebServicePort")
    public ProductWebService getProductWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.example.org/", "ProductWebServicePort"), ProductWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTWS_EXCEPTION!= null) {
            throw PRODUCTWS_EXCEPTION;
        }
        return PRODUCTWS_WSDL_LOCATION;
    }

}
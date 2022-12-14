
package icbt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebGoCheeta", targetNamespace = "http://icbt/", wsdlLocation = "http://localhost:8080/GoCheeta_Server/WebGoCheeta?wsdl")
public class WebGoCheeta_Service
    extends Service
{

    private final static URL WEBGOCHEETA_WSDL_LOCATION;
    private final static WebServiceException WEBGOCHEETA_EXCEPTION;
    private final static QName WEBGOCHEETA_QNAME = new QName("http://icbt/", "WebGoCheeta");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/GoCheeta_Server/WebGoCheeta?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBGOCHEETA_WSDL_LOCATION = url;
        WEBGOCHEETA_EXCEPTION = e;
    }

    public WebGoCheeta_Service() {
        super(__getWsdlLocation(), WEBGOCHEETA_QNAME);
    }

    public WebGoCheeta_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBGOCHEETA_QNAME, features);
    }

    public WebGoCheeta_Service(URL wsdlLocation) {
        super(wsdlLocation, WEBGOCHEETA_QNAME);
    }

    public WebGoCheeta_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBGOCHEETA_QNAME, features);
    }

    public WebGoCheeta_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebGoCheeta_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebGoCheeta
     */
    @WebEndpoint(name = "WebGoCheetaPort")
    public WebGoCheeta getWebGoCheetaPort() {
        return super.getPort(new QName("http://icbt/", "WebGoCheetaPort"), WebGoCheeta.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebGoCheeta
     */
    @WebEndpoint(name = "WebGoCheetaPort")
    public WebGoCheeta getWebGoCheetaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://icbt/", "WebGoCheetaPort"), WebGoCheeta.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBGOCHEETA_EXCEPTION!= null) {
            throw WEBGOCHEETA_EXCEPTION;
        }
        return WEBGOCHEETA_WSDL_LOCATION;
    }

}

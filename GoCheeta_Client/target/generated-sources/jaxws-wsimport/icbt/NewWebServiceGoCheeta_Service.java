
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
@WebServiceClient(name = "NewWebServiceGoCheeta", targetNamespace = "http://icbt/", wsdlLocation = "http://localhost:8080/mavenproject1/NewWebServiceGoCheeta?wsdl")
public class NewWebServiceGoCheeta_Service
    extends Service
{

    private final static URL NEWWEBSERVICEGOCHEETA_WSDL_LOCATION;
    private final static WebServiceException NEWWEBSERVICEGOCHEETA_EXCEPTION;
    private final static QName NEWWEBSERVICEGOCHEETA_QNAME = new QName("http://icbt/", "NewWebServiceGoCheeta");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/mavenproject1/NewWebServiceGoCheeta?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NEWWEBSERVICEGOCHEETA_WSDL_LOCATION = url;
        NEWWEBSERVICEGOCHEETA_EXCEPTION = e;
    }

    public NewWebServiceGoCheeta_Service() {
        super(__getWsdlLocation(), NEWWEBSERVICEGOCHEETA_QNAME);
    }

    public NewWebServiceGoCheeta_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NEWWEBSERVICEGOCHEETA_QNAME, features);
    }

    public NewWebServiceGoCheeta_Service(URL wsdlLocation) {
        super(wsdlLocation, NEWWEBSERVICEGOCHEETA_QNAME);
    }

    public NewWebServiceGoCheeta_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NEWWEBSERVICEGOCHEETA_QNAME, features);
    }

    public NewWebServiceGoCheeta_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NewWebServiceGoCheeta_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NewWebServiceGoCheeta
     */
    @WebEndpoint(name = "NewWebServiceGoCheetaPort")
    public NewWebServiceGoCheeta getNewWebServiceGoCheetaPort() {
        return super.getPort(new QName("http://icbt/", "NewWebServiceGoCheetaPort"), NewWebServiceGoCheeta.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NewWebServiceGoCheeta
     */
    @WebEndpoint(name = "NewWebServiceGoCheetaPort")
    public NewWebServiceGoCheeta getNewWebServiceGoCheetaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://icbt/", "NewWebServiceGoCheetaPort"), NewWebServiceGoCheeta.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NEWWEBSERVICEGOCHEETA_EXCEPTION!= null) {
            throw NEWWEBSERVICEGOCHEETA_EXCEPTION;
        }
        return NEWWEBSERVICEGOCHEETA_WSDL_LOCATION;
    }

}

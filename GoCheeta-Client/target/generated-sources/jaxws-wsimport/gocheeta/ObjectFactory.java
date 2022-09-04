
package gocheeta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gocheeta package. 
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

    private final static QName _AddDriver_QNAME = new QName("http://GoCheeta/", "addDriver");
    private final static QName _GetDriver_QNAME = new QName("http://GoCheeta/", "getDriver");
    private final static QName _GetDriversResponse_QNAME = new QName("http://GoCheeta/", "getDriversResponse");
    private final static QName _Hello_QNAME = new QName("http://GoCheeta/", "hello");
    private final static QName _GetDrivers_QNAME = new QName("http://GoCheeta/", "getDrivers");
    private final static QName _HelloResponse_QNAME = new QName("http://GoCheeta/", "helloResponse");
    private final static QName _AddDriverResponse_QNAME = new QName("http://GoCheeta/", "addDriverResponse");
    private final static QName _GetDriverResponse_QNAME = new QName("http://GoCheeta/", "getDriverResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gocheeta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDriverResponse }
     * 
     */
    public GetDriverResponse createGetDriverResponse() {
        return new GetDriverResponse();
    }

    /**
     * Create an instance of {@link AddDriverResponse }
     * 
     */
    public AddDriverResponse createAddDriverResponse() {
        return new AddDriverResponse();
    }

    /**
     * Create an instance of {@link GetDrivers }
     * 
     */
    public GetDrivers createGetDrivers() {
        return new GetDrivers();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AddDriver }
     * 
     */
    public AddDriver createAddDriver() {
        return new AddDriver();
    }

    /**
     * Create an instance of {@link GetDriver }
     * 
     */
    public GetDriver createGetDriver() {
        return new GetDriver();
    }

    /**
     * Create an instance of {@link GetDriversResponse }
     * 
     */
    public GetDriversResponse createGetDriversResponse() {
        return new GetDriversResponse();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "addDriver")
    public JAXBElement<AddDriver> createAddDriver(AddDriver value) {
        return new JAXBElement<AddDriver>(_AddDriver_QNAME, AddDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDriver")
    public JAXBElement<GetDriver> createGetDriver(GetDriver value) {
        return new JAXBElement<GetDriver>(_GetDriver_QNAME, GetDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriversResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDriversResponse")
    public JAXBElement<GetDriversResponse> createGetDriversResponse(GetDriversResponse value) {
        return new JAXBElement<GetDriversResponse>(_GetDriversResponse_QNAME, GetDriversResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDrivers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDrivers")
    public JAXBElement<GetDrivers> createGetDrivers(GetDrivers value) {
        return new JAXBElement<GetDrivers>(_GetDrivers_QNAME, GetDrivers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "addDriverResponse")
    public JAXBElement<AddDriverResponse> createAddDriverResponse(AddDriverResponse value) {
        return new JAXBElement<AddDriverResponse>(_AddDriverResponse_QNAME, AddDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDriverResponse")
    public JAXBElement<GetDriverResponse> createGetDriverResponse(GetDriverResponse value) {
        return new JAXBElement<GetDriverResponse>(_GetDriverResponse_QNAME, GetDriverResponse.class, null, value);
    }

}

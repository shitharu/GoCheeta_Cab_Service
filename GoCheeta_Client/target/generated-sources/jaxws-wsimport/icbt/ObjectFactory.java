
package icbt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the icbt package. 
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

    private final static QName _UpdateDriverrs_QNAME = new QName("http://icbt/", "updateDriverrs");
    private final static QName _AddUser_QNAME = new QName("http://icbt/", "addUser");
    private final static QName _DeleteDriverrsResponse_QNAME = new QName("http://icbt/", "deleteDriverrsResponse");
    private final static QName _GetDriverrResponse_QNAME = new QName("http://icbt/", "getDriverrResponse");
    private final static QName _UpdateDriverrsResponse_QNAME = new QName("http://icbt/", "updateDriverrsResponse");
    private final static QName _GetDriverrs_QNAME = new QName("http://icbt/", "getDriverrs");
    private final static QName _DeleteDriverrs_QNAME = new QName("http://icbt/", "deleteDriverrs");
    private final static QName _AddDriverrResponse_QNAME = new QName("http://icbt/", "addDriverrResponse");
    private final static QName _GetDriverr_QNAME = new QName("http://icbt/", "getDriverr");
    private final static QName _GetDriverrsResponse_QNAME = new QName("http://icbt/", "getDriverrsResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://icbt/", "helloResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://icbt/", "addUserResponse");
    private final static QName _Hello_QNAME = new QName("http://icbt/", "hello");
    private final static QName _AddDriverr_QNAME = new QName("http://icbt/", "addDriverr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: icbt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDriverrResponse }
     * 
     */
    public GetDriverrResponse createGetDriverrResponse() {
        return new GetDriverrResponse();
    }

    /**
     * Create an instance of {@link UpdateDriverrsResponse }
     * 
     */
    public UpdateDriverrsResponse createUpdateDriverrsResponse() {
        return new UpdateDriverrsResponse();
    }

    /**
     * Create an instance of {@link DeleteDriverrsResponse }
     * 
     */
    public DeleteDriverrsResponse createDeleteDriverrsResponse() {
        return new DeleteDriverrsResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link UpdateDriverrs }
     * 
     */
    public UpdateDriverrs createUpdateDriverrs() {
        return new UpdateDriverrs();
    }

    /**
     * Create an instance of {@link AddDriverrResponse }
     * 
     */
    public AddDriverrResponse createAddDriverrResponse() {
        return new AddDriverrResponse();
    }

    /**
     * Create an instance of {@link DeleteDriverrs }
     * 
     */
    public DeleteDriverrs createDeleteDriverrs() {
        return new DeleteDriverrs();
    }

    /**
     * Create an instance of {@link GetDriverrs }
     * 
     */
    public GetDriverrs createGetDriverrs() {
        return new GetDriverrs();
    }

    /**
     * Create an instance of {@link GetDriverrsResponse }
     * 
     */
    public GetDriverrsResponse createGetDriverrsResponse() {
        return new GetDriverrsResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetDriverr }
     * 
     */
    public GetDriverr createGetDriverr() {
        return new GetDriverr();
    }

    /**
     * Create an instance of {@link AddDriverr }
     * 
     */
    public AddDriverr createAddDriverr() {
        return new AddDriverr();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link Driverr }
     * 
     */
    public Driverr createDriverr() {
        return new Driverr();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDriverrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "updateDriverrs")
    public JAXBElement<UpdateDriverrs> createUpdateDriverrs(UpdateDriverrs value) {
        return new JAXBElement<UpdateDriverrs>(_UpdateDriverrs_QNAME, UpdateDriverrs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDriverrsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "deleteDriverrsResponse")
    public JAXBElement<DeleteDriverrsResponse> createDeleteDriverrsResponse(DeleteDriverrsResponse value) {
        return new JAXBElement<DeleteDriverrsResponse>(_DeleteDriverrsResponse_QNAME, DeleteDriverrsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "getDriverrResponse")
    public JAXBElement<GetDriverrResponse> createGetDriverrResponse(GetDriverrResponse value) {
        return new JAXBElement<GetDriverrResponse>(_GetDriverrResponse_QNAME, GetDriverrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDriverrsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "updateDriverrsResponse")
    public JAXBElement<UpdateDriverrsResponse> createUpdateDriverrsResponse(UpdateDriverrsResponse value) {
        return new JAXBElement<UpdateDriverrsResponse>(_UpdateDriverrsResponse_QNAME, UpdateDriverrsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "getDriverrs")
    public JAXBElement<GetDriverrs> createGetDriverrs(GetDriverrs value) {
        return new JAXBElement<GetDriverrs>(_GetDriverrs_QNAME, GetDriverrs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDriverrs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "deleteDriverrs")
    public JAXBElement<DeleteDriverrs> createDeleteDriverrs(DeleteDriverrs value) {
        return new JAXBElement<DeleteDriverrs>(_DeleteDriverrs_QNAME, DeleteDriverrs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDriverrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "addDriverrResponse")
    public JAXBElement<AddDriverrResponse> createAddDriverrResponse(AddDriverrResponse value) {
        return new JAXBElement<AddDriverrResponse>(_AddDriverrResponse_QNAME, AddDriverrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "getDriverr")
    public JAXBElement<GetDriverr> createGetDriverr(GetDriverr value) {
        return new JAXBElement<GetDriverr>(_GetDriverr_QNAME, GetDriverr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverrsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "getDriverrsResponse")
    public JAXBElement<GetDriverrsResponse> createGetDriverrsResponse(GetDriverrsResponse value) {
        return new JAXBElement<GetDriverrsResponse>(_GetDriverrsResponse_QNAME, GetDriverrsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDriverr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://icbt/", name = "addDriverr")
    public JAXBElement<AddDriverr> createAddDriverr(AddDriverr value) {
        return new JAXBElement<AddDriverr>(_AddDriverr_QNAME, AddDriverr.class, null, value);
    }

}

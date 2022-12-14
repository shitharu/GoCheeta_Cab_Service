
package icbt;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NewWebServiceGoCheeta", targetNamespace = "http://icbt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebServiceGoCheeta {


    /**
     * 
     * @param user
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://icbt/", className = "icbt.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://icbt/", className = "icbt.AddUserResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/addUserRequest", output = "http://icbt/NewWebServiceGoCheeta/addUserResponse")
    public boolean addUser(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param id
     * @return
     *     returns icbt.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://icbt/", className = "icbt.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://icbt/", className = "icbt.GetUserResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/getUserRequest", output = "http://icbt/NewWebServiceGoCheeta/getUserResponse")
    public User getUser(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param dvr
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addDriverr", targetNamespace = "http://icbt/", className = "icbt.AddDriverr")
    @ResponseWrapper(localName = "addDriverrResponse", targetNamespace = "http://icbt/", className = "icbt.AddDriverrResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/addDriverrRequest", output = "http://icbt/NewWebServiceGoCheeta/addDriverrResponse")
    public boolean addDriverr(
        @WebParam(name = "dvr", targetNamespace = "")
        Driverr dvr);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteDriverrs", targetNamespace = "http://icbt/", className = "icbt.DeleteDriverrs")
    @ResponseWrapper(localName = "deleteDriverrsResponse", targetNamespace = "http://icbt/", className = "icbt.DeleteDriverrsResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/deleteDriverrsRequest", output = "http://icbt/NewWebServiceGoCheeta/deleteDriverrsResponse")
    public boolean deleteDriverrs(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<icbt.Driverr>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDriverrs", targetNamespace = "http://icbt/", className = "icbt.GetDriverrs")
    @ResponseWrapper(localName = "getDriverrsResponse", targetNamespace = "http://icbt/", className = "icbt.GetDriverrsResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/getDriverrsRequest", output = "http://icbt/NewWebServiceGoCheeta/getDriverrsResponse")
    public List<Driverr> getDriverrs();

    /**
     * 
     * @param dvr
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateDriverrs", targetNamespace = "http://icbt/", className = "icbt.UpdateDriverrs")
    @ResponseWrapper(localName = "updateDriverrsResponse", targetNamespace = "http://icbt/", className = "icbt.UpdateDriverrsResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/updateDriverrsRequest", output = "http://icbt/NewWebServiceGoCheeta/updateDriverrsResponse")
    public boolean updateDriverrs(
        @WebParam(name = "dvr", targetNamespace = "")
        Driverr dvr);

    /**
     * 
     * @param id
     * @return
     *     returns icbt.Driverr
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDriverr", targetNamespace = "http://icbt/", className = "icbt.GetDriverr")
    @ResponseWrapper(localName = "getDriverrResponse", targetNamespace = "http://icbt/", className = "icbt.GetDriverrResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/getDriverrRequest", output = "http://icbt/NewWebServiceGoCheeta/getDriverrResponse")
    public Driverr getDriverr(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://icbt/", className = "icbt.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://icbt/", className = "icbt.HelloResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/helloRequest", output = "http://icbt/NewWebServiceGoCheeta/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.util.List<icbt.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://icbt/", className = "icbt.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://icbt/", className = "icbt.GetUsersResponse")
    @Action(input = "http://icbt/NewWebServiceGoCheeta/getUsersRequest", output = "http://icbt/NewWebServiceGoCheeta/getUsersResponse")
    public List<User> getUsers();

}

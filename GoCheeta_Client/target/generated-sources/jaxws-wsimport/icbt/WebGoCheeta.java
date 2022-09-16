
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
@WebService(name = "WebGoCheeta", targetNamespace = "http://icbt/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebGoCheeta {


    /**
     * 
     * @param carid
     * @return
     *     returns icbt.Car
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLocation", targetNamespace = "http://icbt/", className = "icbt.GetLocation")
    @ResponseWrapper(localName = "getLocationResponse", targetNamespace = "http://icbt/", className = "icbt.GetLocationResponse")
    @Action(input = "http://icbt/WebGoCheeta/getLocationRequest", output = "http://icbt/WebGoCheeta/getLocationResponse")
    public Car getLocation(
        @WebParam(name = "carid", targetNamespace = "")
        int carid);

    /**
     * 
     * @return
     *     returns java.util.List<icbt.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUsers", targetNamespace = "http://icbt/", className = "icbt.GetUsers")
    @ResponseWrapper(localName = "getUsersResponse", targetNamespace = "http://icbt/", className = "icbt.GetUsersResponse")
    @Action(input = "http://icbt/WebGoCheeta/getUsersRequest", output = "http://icbt/WebGoCheeta/getUsersResponse")
    public List<User> getUsers();

    /**
     * 
     * @param car
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCar", targetNamespace = "http://icbt/", className = "icbt.AddCar")
    @ResponseWrapper(localName = "addCarResponse", targetNamespace = "http://icbt/", className = "icbt.AddCarResponse")
    @Action(input = "http://icbt/WebGoCheeta/addCarRequest", output = "http://icbt/WebGoCheeta/addCarResponse")
    public boolean addCar(
        @WebParam(name = "car", targetNamespace = "")
        Car car);

    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authCustomer", targetNamespace = "http://icbt/", className = "icbt.AuthCustomer")
    @ResponseWrapper(localName = "authCustomerResponse", targetNamespace = "http://icbt/", className = "icbt.AuthCustomerResponse")
    @Action(input = "http://icbt/WebGoCheeta/authCustomerRequest", output = "http://icbt/WebGoCheeta/authCustomerResponse")
    public boolean authCustomer(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param vancarid
     * @return
     *     returns icbt.Van
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVan", targetNamespace = "http://icbt/", className = "icbt.GetVan")
    @ResponseWrapper(localName = "getVanResponse", targetNamespace = "http://icbt/", className = "icbt.GetVanResponse")
    @Action(input = "http://icbt/WebGoCheeta/getVanRequest", output = "http://icbt/WebGoCheeta/getVanResponse")
    public Van getVan(
        @WebParam(name = "vancarid", targetNamespace = "")
        int vancarid);

    /**
     * 
     * @param carid
     * @return
     *     returns icbt.Car
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCar", targetNamespace = "http://icbt/", className = "icbt.GetCar")
    @ResponseWrapper(localName = "getCarResponse", targetNamespace = "http://icbt/", className = "icbt.GetCarResponse")
    @Action(input = "http://icbt/WebGoCheeta/getCarRequest", output = "http://icbt/WebGoCheeta/getCarResponse")
    public Car getCar(
        @WebParam(name = "carid", targetNamespace = "")
        int carid);

    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authCustomerA", targetNamespace = "http://icbt/", className = "icbt.AuthCustomerA")
    @ResponseWrapper(localName = "authCustomerAResponse", targetNamespace = "http://icbt/", className = "icbt.AuthCustomerAResponse")
    @Action(input = "http://icbt/WebGoCheeta/authCustomerARequest", output = "http://icbt/WebGoCheeta/authCustomerAResponse")
    public boolean authCustomerA(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @return
     *     returns java.util.List<icbt.Van>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVans", targetNamespace = "http://icbt/", className = "icbt.GetVans")
    @ResponseWrapper(localName = "getVansResponse", targetNamespace = "http://icbt/", className = "icbt.GetVansResponse")
    @Action(input = "http://icbt/WebGoCheeta/getVansRequest", output = "http://icbt/WebGoCheeta/getVansResponse")
    public List<Van> getVans();

    /**
     * 
     * @return
     *     returns java.util.List<icbt.Driverr>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarsOnly", targetNamespace = "http://icbt/", className = "icbt.GetCarsOnly")
    @ResponseWrapper(localName = "getCarsOnlyResponse", targetNamespace = "http://icbt/", className = "icbt.GetCarsOnlyResponse")
    @Action(input = "http://icbt/WebGoCheeta/getCarsOnlyRequest", output = "http://icbt/WebGoCheeta/getCarsOnlyResponse")
    public List<Driverr> getCarsOnly();

    /**
     * 
     * @param id
     * @return
     *     returns icbt.Driverr
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDriverrbyId", targetNamespace = "http://icbt/", className = "icbt.GetDriverrbyId")
    @ResponseWrapper(localName = "getDriverrbyIdResponse", targetNamespace = "http://icbt/", className = "icbt.GetDriverrbyIdResponse")
    @Action(input = "http://icbt/WebGoCheeta/getDriverrbyIdRequest", output = "http://icbt/WebGoCheeta/getDriverrbyIdResponse")
    public Driverr getDriverrbyId(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<icbt.Car>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCars", targetNamespace = "http://icbt/", className = "icbt.GetCars")
    @ResponseWrapper(localName = "getCarsResponse", targetNamespace = "http://icbt/", className = "icbt.GetCarsResponse")
    @Action(input = "http://icbt/WebGoCheeta/getCarsRequest", output = "http://icbt/WebGoCheeta/getCarsResponse")
    public List<Car> getCars();

    /**
     * 
     * @param password
     * @param email
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "authCustomerD", targetNamespace = "http://icbt/", className = "icbt.AuthCustomerD")
    @ResponseWrapper(localName = "authCustomerDResponse", targetNamespace = "http://icbt/", className = "icbt.AuthCustomerDResponse")
    @Action(input = "http://icbt/WebGoCheeta/authCustomerDRequest", output = "http://icbt/WebGoCheeta/authCustomerDResponse")
    public boolean authCustomerD(
        @WebParam(name = "email", targetNamespace = "")
        String email,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param cnt
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addContactUs", targetNamespace = "http://icbt/", className = "icbt.AddContactUs")
    @ResponseWrapper(localName = "addContactUsResponse", targetNamespace = "http://icbt/", className = "icbt.AddContactUsResponse")
    @Action(input = "http://icbt/WebGoCheeta/addContactUsRequest", output = "http://icbt/WebGoCheeta/addContactUsResponse")
    public boolean addContactUs(
        @WebParam(name = "cnt", targetNamespace = "")
        Contact cnt);

    /**
     * 
     * @return
     *     returns java.util.List<icbt.Driverr>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVansOnly", targetNamespace = "http://icbt/", className = "icbt.GetVansOnly")
    @ResponseWrapper(localName = "getVansOnlyResponse", targetNamespace = "http://icbt/", className = "icbt.GetVansOnlyResponse")
    @Action(input = "http://icbt/WebGoCheeta/getVansOnlyRequest", output = "http://icbt/WebGoCheeta/getVansOnlyResponse")
    public List<Driverr> getVansOnly();

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
    @Action(input = "http://icbt/WebGoCheeta/helloRequest", output = "http://icbt/WebGoCheeta/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

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
    @Action(input = "http://icbt/WebGoCheeta/getDriverrRequest", output = "http://icbt/WebGoCheeta/getDriverrResponse")
    public Driverr getDriverr(
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
    @Action(input = "http://icbt/WebGoCheeta/getDriverrsRequest", output = "http://icbt/WebGoCheeta/getDriverrsResponse")
    public List<Driverr> getDriverrs();

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
    @Action(input = "http://icbt/WebGoCheeta/addDriverrRequest", output = "http://icbt/WebGoCheeta/addDriverrResponse")
    public boolean addDriverr(
        @WebParam(name = "dvr", targetNamespace = "")
        Driverr dvr);

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
    @Action(input = "http://icbt/WebGoCheeta/updateDriverrsRequest", output = "http://icbt/WebGoCheeta/updateDriverrsResponse")
    public boolean updateDriverrs(
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
    @Action(input = "http://icbt/WebGoCheeta/deleteDriverrsRequest", output = "http://icbt/WebGoCheeta/deleteDriverrsResponse")
    public boolean deleteDriverrs(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @return
     *     returns java.util.List<icbt.Contact>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMessages", targetNamespace = "http://icbt/", className = "icbt.GetMessages")
    @ResponseWrapper(localName = "getMessagesResponse", targetNamespace = "http://icbt/", className = "icbt.GetMessagesResponse")
    @Action(input = "http://icbt/WebGoCheeta/getMessagesRequest", output = "http://icbt/WebGoCheeta/getMessagesResponse")
    public List<Contact> getMessages();

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
    @Action(input = "http://icbt/WebGoCheeta/getUserRequest", output = "http://icbt/WebGoCheeta/getUserResponse")
    public User getUser(
        @WebParam(name = "id", targetNamespace = "")
        int id);

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
    @Action(input = "http://icbt/WebGoCheeta/addUserRequest", output = "http://icbt/WebGoCheeta/addUserResponse")
    public boolean addUser(
        @WebParam(name = "user", targetNamespace = "")
        User user);

    /**
     * 
     * @param carid
     * @return
     *     returns icbt.Car
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCarbyId", targetNamespace = "http://icbt/", className = "icbt.GetCarbyId")
    @ResponseWrapper(localName = "getCarbyIdResponse", targetNamespace = "http://icbt/", className = "icbt.GetCarbyIdResponse")
    @Action(input = "http://icbt/WebGoCheeta/getCarbyIdRequest", output = "http://icbt/WebGoCheeta/getCarbyIdResponse")
    public Car getCarbyId(
        @WebParam(name = "carid", targetNamespace = "")
        int carid);

    /**
     * 
     * @param vanid
     * @return
     *     returns icbt.Van
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVanbyId", targetNamespace = "http://icbt/", className = "icbt.GetVanbyId")
    @ResponseWrapper(localName = "getVanbyIdResponse", targetNamespace = "http://icbt/", className = "icbt.GetVanbyIdResponse")
    @Action(input = "http://icbt/WebGoCheeta/getVanbyIdRequest", output = "http://icbt/WebGoCheeta/getVanbyIdResponse")
    public Van getVanbyId(
        @WebParam(name = "vanid", targetNamespace = "")
        int vanid);

    /**
     * 
     * @param car
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCar", targetNamespace = "http://icbt/", className = "icbt.UpdateCar")
    @ResponseWrapper(localName = "updateCarResponse", targetNamespace = "http://icbt/", className = "icbt.UpdateCarResponse")
    @Action(input = "http://icbt/WebGoCheeta/updateCarRequest", output = "http://icbt/WebGoCheeta/updateCarResponse")
    public boolean updateCar(
        @WebParam(name = "car", targetNamespace = "")
        Car car);

    /**
     * 
     * @param van
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateVan", targetNamespace = "http://icbt/", className = "icbt.UpdateVan")
    @ResponseWrapper(localName = "updateVanResponse", targetNamespace = "http://icbt/", className = "icbt.UpdateVanResponse")
    @Action(input = "http://icbt/WebGoCheeta/updateVanRequest", output = "http://icbt/WebGoCheeta/updateVanResponse")
    public boolean updateVan(
        @WebParam(name = "van", targetNamespace = "")
        Van van);

}

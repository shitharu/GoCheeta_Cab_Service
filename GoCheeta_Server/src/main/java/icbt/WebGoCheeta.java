/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package icbt;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tharushi Dhananjika
 */
@WebService(serviceName = "WebGoCheeta")
public class WebGoCheeta {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "getDriverr")
    public Driverr getDriverr(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getDriverr(id);
    }
    
    @WebMethod(operationName = "getDriverrs")
    public List<Driverr> getDriverrs(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getDriverrs();
    }

    @WebMethod(operationName = "addDriverr")
    public boolean addDriverr(@WebParam(name = "dvr")Driverr dvr){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addDriverr(dvr);
    }
    
    @WebMethod(operationName = "updateDriverrs")
    public boolean updateDriverr(@WebParam(name = "dvr")Driverr dvr){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.updateDriverr(dvr);
    }
    
    @WebMethod(operationName = "deleteDriverrs")
    public boolean deleteDriverr(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.deleteDriverr(id);
    }
    
    @WebMethod(operationName = "addUser")
    public boolean addUser(@WebParam(name = "user")User user){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addUser(user);
    }
    
    @WebMethod(operationName = "getUsers")
    public List<User> getUsers(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getUsers();
    }
    
    @WebMethod(operationName = "getUser")
    public User getUser(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getUser(id);
    }
    
    @WebMethod(operationName = "getCars")
    public List<Car> getCars(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getCars();
    }
    
    @WebMethod(operationName = "addCar")
    public boolean addCar(@WebParam(name = "car")Car car){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addCar(car);
    }
    
    @WebMethod(operationName = "getCar")
    public Car getCar(@WebParam(name = "carid")int carid){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getCar(carid);
    }
    
    @WebMethod(operationName = "getCarsOnly")
    public List<Driverr> getCarsOnly(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getCarsOnly();
    }
    
    @WebMethod(operationName = "getVan")
    public Van getVan(@WebParam(name = "vancarid")int vanid){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getVan(vanid);
    }
    
    @WebMethod(operationName = "getVans")
    public List<Van> getVans(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getVans();
    }
    
    @WebMethod(operationName = "getVansOnly")
    public List<Driverr> getVansOnly(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getVansOnly();
    }
    
//    @WebMethod(operationName = "registerCustomer")
//    public boolean registerCustomer(@WebParam(name = "name") String name, @WebParam(name = "email") String email, @WebParam(name = "mobile") String mobile, @WebParam(name = "password") String password) {
//        Customer customer = new Customer(0, password, name, email, mobile);
//        MySQLDB db = new MySQLDB();
//        return db.registerCustomer(customer);
//    }
    
    @WebMethod(operationName = "authCustomer")
    public boolean authCustomer(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.authCustomer(email, password);
    }
    
    @WebMethod(operationName = "addContactUs")
    public boolean addContactUs(@WebParam(name = "cnt")Contact cnt){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addContactUs(cnt);
    }
    
    @WebMethod(operationName = "getMessages")
    public List<Contact> getMessages(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getMessages();
    }
}

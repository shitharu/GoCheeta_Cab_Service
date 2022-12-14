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
    
    @WebMethod(operationName = "updateCar")
    public boolean updateCar(@WebParam(name = "car")Car car){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.updateCar(car);
    }
    
    @WebMethod(operationName = "updateVan")
    public boolean updateVan(@WebParam(name = "van")Van van){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.updateVan(van);
    }
    
    @WebMethod(operationName = "deleteUser")
    public boolean deleteUser(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.deleteUser(id);
    }
    
    @WebMethod(operationName = "deleteDriverrs")
    public boolean deleteDriverr(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.deleteDriverr(id);
    }
    
    @WebMethod(operationName = "deleteCar")
    public boolean deleteCar(@WebParam(name = "carid")int carid){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.deleteCar(carid);
    }
    
    @WebMethod(operationName = "deleteCarTravel")
    public boolean deleteCarTravel(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.deleteCarTravel(id);
    }
    
    @WebMethod(operationName = "deleteVanTravel")
    public boolean deleteVanTravel(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.deleteVanTravel(id);
    }
    
    @WebMethod(operationName = "deleteVan")
    public boolean deleteVan(@WebParam(name = "vanid")int vanid){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.deleteVan(vanid);
    }
    
    @WebMethod(operationName = "getUserbyId")
    public User getUserbyId(@WebParam(name = "id") int id) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getUserbyId(id);
    }

    @WebMethod(operationName = "getDriverrbyId")
    public Driverr getDriverrbyId(@WebParam(name = "id") int id) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getDriverrbyId(id);
    }
    
    @WebMethod(operationName = "getCarbyId")
    public Car getCarbyId(@WebParam(name = "carid") int carid) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getCarbyId(carid);
    }
    
    @WebMethod(operationName = "getVanbyId")
    public Van getVanbyId(@WebParam(name = "vanid") int vanid) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getVanbyId(vanid);
    }

    @WebMethod(operationName = "getTravelCarbyId")
    public Payment getTravelCarbyId(@WebParam(name = "id") int id) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getTravelCarbyId(id);
    }
    
    @WebMethod(operationName = "getTravelVanbyId")
    public Payment getTravelVanbyId(@WebParam(name = "id") int id) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getTravelVanbyId(id);
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
    
    @WebMethod(operationName = "addVan")
    public boolean addVan(@WebParam(name = "van")Van van){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addVan(van);
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
    
    @WebMethod(operationName = "authCustomerD")
    public boolean authCustomerD(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.authCustomerD(email, password);
    }
    
    @WebMethod(operationName = "authCustomerA")
    public boolean authCustomerA(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.authCustomerA(email, password);
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
    
    @WebMethod(operationName = "getLocation")
    public Car getLocation(@WebParam(name = "carid")int carid){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getLocation(carid);
    }
    
    @WebMethod(operationName = "addpaymentcar")
    public boolean addpaymentcar(@WebParam(name = "payment")Payment payment){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addpaymentcar(payment);
    }
    
    @WebMethod(operationName = "getCarPayments")
    public List<Payment> getCarPayments(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getCarPayments();
    }

    
    @WebMethod(operationName = "addpaymentvan")
    public boolean addpaymentvan(@WebParam(name = "payment")Payment payment){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addpaymentvan(payment);
    }
    
    @WebMethod(operationName = "getVanPayments")
    public List<Payment> getVanPayments(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getVanPayments();
    }
    
    
    
    
    
    
//    @WebMethod(operationName = "addCarr")
//    public boolean addCarr(@WebParam(name = "car")Car car){
//        DBGoCheeta gocheeta = new DBGoCheeta();
//        return gocheeta.addCarr(car);
//    }
    
//    @WebMethod(operationName = "addVann")
//    public boolean addVann(@WebParam(name = "van")Van van){
//        DBGoCheeta gocheeta = new DBGoCheeta();
//        return gocheeta.addVann(van);
//    }
}

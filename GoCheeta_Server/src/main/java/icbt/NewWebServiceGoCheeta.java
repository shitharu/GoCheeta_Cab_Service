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
@WebService(serviceName = "NewWebServiceGoCheeta")
public class NewWebServiceGoCheeta {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !!!! ";
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
}

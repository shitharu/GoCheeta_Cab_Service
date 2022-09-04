/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package GoCheeta;

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
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getDriver")
    public Driver getDriver(@WebParam(name = "id")int id){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getDriver(id);
    }
    
    @WebMethod(operationName = "getDrivers")
    public List<Driver> getDrivers(){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.getDrivers();
    }
    
    @WebMethod(operationName = "addDriver")
    public boolean addDriver(@WebParam(name = "dv")Driver dv){
        DBGoCheeta gocheeta = new DBGoCheeta();
        return gocheeta.addDriver(dv);
    }
    
}

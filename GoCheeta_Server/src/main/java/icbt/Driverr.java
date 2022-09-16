/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

/**
 *
 * @author Tharushi Dhananjika
 */
public class Driverr {
    private int id;
    private String name;
    private int telno;
    private String branch;
    private String email;
    private String vehicle;
    private String username;
    private String password;
    
    public Driverr(){
        this.id =0;
        this.name ="";
        this.telno =0;
        this.branch ="";
        this.vehicle ="";
        this.email ="";
        this.username ="";
        this.password ="";
    }
    
    public Driverr(int id, String name, int telno, String branch,String email, String vehicle, String username,String password){
        this.id =id;
        this.name =name;
        this.telno =telno;
        this.branch =branch;
        this.email =email;
        this.vehicle= vehicle;
        this.username=username;
        this.password=password;
    }

//    Driverr(int aInt, String string, String string0, String string1) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getTelno(){
        return telno;
    }
    
    public void setTelno(int telno){
        this.telno = telno;
    }
    
    public String getBranch(){
        return branch;
    }
    
    public void setBranch(String branch){
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
    public String getVehicle(){
        return vehicle;
    }
    
    public void setVehicle(String vehicle){
        this.vehicle = vehicle;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

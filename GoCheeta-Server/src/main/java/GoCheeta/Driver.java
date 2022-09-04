/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GoCheeta;

/**
 *
 * @author Tharushi Dhananjika
 */
public class Driver {
    private int id;
    private String name;
    private int telno;
    private String branch;
    private String vehicle;
    
    public Driver(){
        this.id = 0;
        this.name = "";
        this.telno = 0;
        this.branch = "";
        this.vehicle = "";
    }
    
    public Driver(int id, String name, int telno, String branch,String vehicle){
        this.id = id;
        this.name = name;
        this.telno = telno;
        this.branch = branch;
        this.vehicle = vehicle;
    }
    
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
    
    
    public int gettelno(){
        return telno;
    }
    
    public void settelno(int telno){
        this.telno = telno;
    } 
    
    
    public String getbranch(){
        return branch;
    }
    
    public void setbranch(String branch){
        this.branch = branch;
    }
    
    
    public String getvehicle(){
        return vehicle;
    }
    
    public void setvehicle(String vehicle){
        this.vehicle = vehicle;
    }
    
}

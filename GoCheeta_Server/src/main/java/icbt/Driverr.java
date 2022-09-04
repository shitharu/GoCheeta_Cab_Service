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
    
    public Driverr(){
        this.id =0;
        this.name ="";
        this.telno =0;
        this.branch ="";
    }
    
    public Driverr(int id, String name, int telno, String branch){
        this.id =id;
        this.name =name;
        this.telno =telno;
        this.branch =branch;
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
    
}

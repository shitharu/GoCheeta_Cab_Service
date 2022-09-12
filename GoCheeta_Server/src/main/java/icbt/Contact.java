/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

/**
 *
 * @author Tharushi Dhananjika
 */
public class Contact {
    private String name;
    private int mobile;
    private String message;
    
    
    public Contact(){
        this.name="";
        this.mobile=0;
        this.message="";
    }

    
    public Contact(String name, int mobile, String message) {
        
        this.name = name;
        this.mobile = mobile;
        this.message = message;
    }
    

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    
}

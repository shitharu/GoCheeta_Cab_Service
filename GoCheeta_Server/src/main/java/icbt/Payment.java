/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

/**
 *
 * @author Tharushi Dhananjika
 */
public class Payment {
    private int id;
    private String name;
    private String startcity;
    private String endcity;
    private int price;
    private String destination;
    private String feedback;

    
    public Payment(){
        this.id =0;
        this.name="";
        this.startcity ="";
        this.endcity ="";
        this.price =0;  
        this.destination ="";  
        this.feedback ="";      
    }    
    
    public Payment(int id, String name, String startcity, String endcity, int price, String destination, String feedback) {
        this.id = id;
        this.name = name;
        this.startcity = startcity;
        this.endcity = endcity;
        this.price = price;
        this.destination = destination;
        this.feedback = feedback;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartcity() {
        return startcity;
    }

    public void setStartcity(String startcity) {
        this.startcity = startcity;
    }

    public String getEndcity() {
        return endcity;
    }

    public void setEndcity(String endcity) {
        this.endcity = endcity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

/**
 *
 * @author Tharushi Dhananjika
 */
public class Van {
    
    private int vanid;
    private String startcity;
    private String endcity;
    private String destination;
    private int price;
    
    
    public Van(){
        this.vanid =0;
        this.startcity ="";
        this.endcity ="";
        this.destination ="";
        this.price =0;        
    }

    public Van(int vanid, String startcity, String endcity, String destination, int price) {
        this.vanid = vanid;
        this.startcity = startcity;
        this.endcity = endcity;
        this.destination = destination;
        this.price = price;
    }

    public int getVanid() {
        return vanid;
    }

    public void setVanid(int vanid) {
        this.vanid = vanid;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}

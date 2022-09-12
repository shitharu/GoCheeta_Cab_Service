/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.ng.web.client;

import icbt.Car;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author Tharushi Dhananjika
 */
public class UICar {
    public static void printCarRows(Car car, JspWriter out){
        try{
            out.print("<tr>");
            out.print("<td>" + car.getCarid()+"</td>");
            out.print("<td>" + car.getStartcity()+"</td>");
            out.print("<td>" + car.getEndcity()+"</td>");
            out.print("<td>" + car.getDestination()+"</td>");
            out.print("<td>" + car.getPrice()+"</td>");

            out.print("<tr>");
        }catch(IOException e){
            //ignore
        }
        
    }
}

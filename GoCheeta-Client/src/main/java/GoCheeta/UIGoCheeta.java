/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GoCheeta;

import gocheeta.Driver;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author Tharushi Dhananjika
 */
public class UIGoCheeta {
    public static void printDriverRows(Driver dv, JspWriter out){
        try{
            out.print("<tr>");
            out.print("<td>" + dv.getId()+"</td>");
            out.print("<td>" + dv.getName()+"</td>");
            out.print("<td>" + dv.getTelno()+"</td>");
            out.print("<td>" + dv.getBranch()+"</td>");
            out.print("<td>" + dv.getVehicle()+"</td>");
            out.print("<tr>");
        }catch(IOException e){
            //ignore
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.ng.web.client;

import icbt.Van;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author Tharushi Dhananjika
 */
public class UIVan {
    public static void printVanRows(Van van, JspWriter out){
        try{
            out.print("<tr>");
            out.print("<td>" + van.getVanid()+"</td>");
            out.print("<td>" + van.getStartcity()+"</td>");
            out.print("<td>" + van.getEndcity()+"</td>");
            out.print("<td>" + van.getDestination()+"</td>");
            out.print("<td>" + van.getPrice()+"</td>");

            out.print("<tr>");
        }catch(IOException e){
            //ignore
        }
        
    }
}

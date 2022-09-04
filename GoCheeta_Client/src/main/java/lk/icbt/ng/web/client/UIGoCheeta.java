/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.ng.web.client;

import icbt.Driverr;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author Tharushi Dhananjika
 */
public class UIGoCheeta {
    public static void printDriverrRows(Driverr dvr, JspWriter out){
        try{
            out.print("<tr>");
            out.print("<td>" + dvr.getId()+"</td>");
            out.print("<td>" + dvr.getName()+"</td>");
            out.print("<td>" + dvr.getTelno()+"</td>");
            out.print("<td>" + dvr.getBranch()+"</td>");
            out.print("<tr>");
        }catch(IOException e){
            //ignore
        }
        
    }
    
    public static void printDriverr(Driverr dvr, JspWriter out){
        try{
            out.print("<input type='text' name='id'>" + dvr.getId() + "</input>");
            out.print("<input type='text' name='name'>" + dvr.getName() + "</input>");
            out.print("<input type='text' name='telno'>" + dvr.getTelno() + "</input>");
            out.print("<input type='text' name='branch'>" + dvr.getBranch() + "</input>");
        }catch(IOException e){
            //ignore
        }
    }
    
}
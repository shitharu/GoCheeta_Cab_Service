/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.ng.web.client;

import icbt.Contact;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author Tharushi Dhananjika
 */
public class UIMessages {
    public static void printMessagesRows(Contact cnt, JspWriter out){
        try{
            out.print("<tr>");
            out.print("<td>" + cnt.getId()+"</td>");
            out.print("<td>" + cnt.getName()+"</td>");
            out.print("<td>" + cnt.getMobile()+"</td>");
            out.print("<td>" + cnt.getMessage()+"</td>");

            out.print("<tr>");
        }catch(IOException e){
            //ignore
        }
        
    }
}

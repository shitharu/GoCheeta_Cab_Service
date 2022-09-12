/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.ng.web.client;

import icbt.User;
import java.io.IOException;
import javax.servlet.jsp.JspWriter;

/**
 *
 * @author Tharushi Dhananjika
 */
public class UIUsers {
    public static void printUsersRows(User user, JspWriter out){
        try{
            out.print("<tr>");
            out.print("<td>" + user.getFirstname()+"</td>");
            out.print("<td>" + user.getLastname()+"</td>");
            out.print("<td>" + user.getNic()+"</td>");
            out.print("<td>" + user.getAddress()+"</td>");
            out.print("<td>" + user.getEmail()+"</td>");
            out.print("<td>" + user.getMobile()+"</td>");
            out.print("<td>" + user.getId()+"</td>");
            out.print("<td>" + user.getUsername()+"</td>");
            out.print("<td>" + user.getPassword()+"</td>");

            out.print("<tr>");
        }catch(IOException e){
            //ignore
        }
        
    }
}

<%-- 
    Document   : logindriver
    Created on : Sep 14, 2022, 9:58:04 PM
    Author     : Tharushi Dhananjika
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta customerPoxy = service.getWebGoCheetaPort();
        
    if(customerPoxy.authCustomerD(email, password)) {
        out.print("login pass <br>need to redirect to customer dashboard");
    } else {
        out.print("login failed");
    }


%>

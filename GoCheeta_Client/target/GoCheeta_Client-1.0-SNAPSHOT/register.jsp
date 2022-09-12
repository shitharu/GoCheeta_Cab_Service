<%-- 
    Document   : register
    Created on : Sep 7, 2022, 3:36:24 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String name     = request.getParameter("name");
    String email    = request.getParameter("email");
    String mobile   = request.getParameter("mobile");
    String password = request.getParameter("password");
    
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta customerPoxy = service.getWebGoCheetaPort();
        
    if(customerPoxy.registerCustomer(name, email, mobile, password)) {
        out.print("success");
    } else {
        out.print("failed");
    }


%>

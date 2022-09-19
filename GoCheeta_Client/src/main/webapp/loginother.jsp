<%-- 
    Document   : login
    Created on : Sep 7, 2022, 3:34:21 PM
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
        
    if(customerPoxy.authCustomer(email, password)) {
        response.sendRedirect("booking.html");   
    } else {
        response.sendRedirect("index.html");
    }
 

%>


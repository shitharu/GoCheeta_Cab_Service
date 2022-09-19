<%-- 
    Document   : loginadmin
    Created on : Sep 14, 2022, 10:16:44 PM
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
        
    if(customerPoxy.authCustomerA(email, password)) {
        response.sendRedirect("driverr_details.jsp");
    } else {
        response.sendRedirect("index.html");
    }


%>
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
    
   // String emailD = request.getParameter("email");
   // String passwordD = request.getParameter("password");
    
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta customerPoxy = service.getWebGoCheetaPort();
        
    if(customerPoxy.authCustomer(email, password)) {
        //if(customerPoxy.authCustomerD(emailD, passwordD)) {
            out.print("login pass <br>need to redirect to customer dashboard");
       // }    
    } else {
        out.print("login failed");
    }


%>


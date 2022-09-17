<%-- 
    Document   : processcarpayment
    Created on : Sep 18, 2022, 1:40:54 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Payment"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();
   
    Payment payment = new Payment();
    payment.setId(Integer.parseInt(request.getParameter("id")));
    payment.setName(request.getParameter("name"));
    payment.setStartcity(request.getParameter("startcity"));
    payment.setEndcity(request.getParameter("endcity"));
    payment.setPrice(Integer.parseInt(request.getParameter("price")));
    payment.setDestination(request.getParameter("destination"));
    payment.setFeedback(request.getParameter("feedback"));
    
    proxy.addpaymentcar(payment);
    response.sendRedirect("contact.jsp");
    
    out.print("send message");
%>
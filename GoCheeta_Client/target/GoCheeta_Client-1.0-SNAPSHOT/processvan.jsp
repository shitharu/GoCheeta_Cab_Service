<%-- 
    Document   : processvan
    Created on : Sep 17, 2022, 1:39:49 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Van"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();
   
    Van van = new Van();
    
    van.setVanid(Integer.parseInt(request.getParameter("vanid")));
    van.setStartcity(request.getParameter("startcity"));
    van.setEndcity(request.getParameter("endcity"));
    van.setDestination(request.getParameter("destination"));
    van.setPrice(Integer.parseInt(request.getParameter("price")));
    
if(proxy.addVan(van)) {   
   response.sendRedirect("driverr_details.jsp");
}else {
    out.print("false");
}

%>
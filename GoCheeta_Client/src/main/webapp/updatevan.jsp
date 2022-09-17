<%-- 
    Document   : updatevan
    Created on : Sep 17, 2022, 1:26:07 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Van"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();  
    
    int vanid             = Integer.parseInt(request.getParameter("van_id"));
    String startcity      = request.getParameter("startcity");
    String endcity        = request.getParameter("endcity");
    String destination    = request.getParameter("destination");
    String price          = request.getParameter("price");
    
    Van van = new Van();
    
    van.setVanid(vanid);
    van.setStartcity(startcity);
    van.setEndcity(endcity);
    van.setDestination(destination);
    van.setPrice(Integer.parseInt(price));
    
if(proxy.updateVan(van)) {   
   response.sendRedirect("driverr_details.jsp");
}else {
    out.print("false");
}

%>
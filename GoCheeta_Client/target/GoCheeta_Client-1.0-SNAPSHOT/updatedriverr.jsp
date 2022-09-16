<%-- 
    Document   : updatedriverr
    Created on : Sep 16, 2022, 4:17:55 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Driverr"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();  
    
    int id  = Integer.parseInt(request.getParameter("driver_id"));
    String name     = request.getParameter("name");
    String telno    = request.getParameter("telno");
    String branch   = request.getParameter("branch");
    
    Driverr driverr = new Driverr();
    driverr.setId(id);
    driverr.setName(name);
    driverr.setTelno(Integer.parseInt(telno));
    driverr.setBranch(branch);


if(proxy.updateDriverrs(driverr)) {   
   response.sendRedirect("driverr_details.jsp");
}else {
    out.print("false");
}

%>

        
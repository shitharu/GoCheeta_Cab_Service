<%-- 
    Document   : updatecar
    Created on : Sep 17, 2022, 1:25:57 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Car"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();  
    
    int carid             = Integer.parseInt(request.getParameter("car_id"));
    String startcity      = request.getParameter("startcity");
    String endcity        = request.getParameter("endcity");
    String destination    = request.getParameter("destination");
    String price          = request.getParameter("price");
    
    Car car = new Car();
    
    car.setCarid(carid);
    car.setStartcity(startcity);
    car.setEndcity(endcity);
    car.setDestination(destination);
    car.setPrice(Integer.parseInt(price));
    


if(proxy.updateCar(car)) {   
   response.sendRedirect("driverr_details.jsp");
}else {
    out.print("false");
}

%>
<%@page import="icbt.Car"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>

<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();
   
    Car car = new Car();
    
    car.setCarid(Integer.parseInt(request.getParameter("carid")));
    car.setStartcity(request.getParameter("startcity"));
    car.setEndcity(request.getParameter("endcity"));
    car.setDestination(request.getParameter("destination"));
    car.setPrice(Integer.parseInt(request.getParameter("price")));
    
    proxy.addCar(car);
    response.sendRedirect("carsanddrivers.jsp");
    

%>
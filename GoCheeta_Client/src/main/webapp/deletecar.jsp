<%-- 
    Document   : deletecar
    Created on : Sep 17, 2022, 10:12:47 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();

            int carid = Integer.parseInt(request.getParameter("id"));

            if(proxy.deleteCar(carid)) {
               response.sendRedirect("driverr_details.jsp");
            }else {
                out.print("false");
            }
        %>
    </body>
</html>

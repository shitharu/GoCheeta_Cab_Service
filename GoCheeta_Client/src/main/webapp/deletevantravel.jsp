<%-- 
    Document   : deletevantravel
    Created on : Sep 18, 2022, 3:40:55 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="icbt.WebGoCheeta"%>
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

            int id = Integer.parseInt(request.getParameter("id"));

            if(proxy.deleteVanTravel(id)) {
               response.sendRedirect("bookvan.jsp");
            }else {
                out.print("false");
            }

    %>
    </body>
</html>

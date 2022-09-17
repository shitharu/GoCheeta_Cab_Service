<%-- 
    Document   : deleteuser
    Created on : Sep 16, 2022, 4:27:37 PM
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

            int id = Integer.parseInt(request.getParameter("id"));

            if(proxy.deleteDriverrs(id)) {
               response.sendRedirect("driverr_details.jsp");
            }else {
                out.print("false");
            }

    %>
    </body>
</html>

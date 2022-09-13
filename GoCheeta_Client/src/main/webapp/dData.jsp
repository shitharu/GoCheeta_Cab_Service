<%-- 
    Document   : dData
    Created on : Sep 13, 2022, 10:43:36 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page import="icbt.Driverr"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Driver Information</h1>
        
        <%
            String DB_URL = "jdbc:mysql://localhost/gocheeta?allowPublicKeyRetrieval=true&useSSL=false";
            String USER = "root";
            String PASS = "1007@wpTd";


            String id=request.getParameter("id");
            String name=request.getParameter("name");
            String telno=request.getParameter("telno");
            String branch=request.getParameter("branch");
            out.println("<table><tr><td>Driver ID</td><td>"+id+"</td></tr><tr><td>Driver Name</td><td>"+name+"</td></tr><tr><td>Driver TElno</td><td>"+telno+"</td></tr><tr><td>Driver Branch</td><td>"+branch+"</td></tr></table><br>");
            
            try{
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);   
                out.println("Connection Success!");
                
                String sql = "insert into driverrs values ("+id+",'"+name+"',"+telno+",'"+branch+"')";
                
                Statement statement = conn.createStatement();
                out.print(sql);
                out.println("Data Entered!");
                conn.close();
            }catch(Exception e){
                out.println("Error: "+e.toString());
            }
        %>

    </body>
</html>

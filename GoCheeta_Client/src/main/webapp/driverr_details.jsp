<%-- 
    Document   : driverr_details
    Created on : Sep 6, 2022, 3:46:50 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Van"%>
<%@page import="icbt.Car"%>
<%@page import="java.util.List"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="lk.icbt.ng.web.client.UIGoCheeta"%>
<%@page import="icbt.Driverr"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();
    
    List<Driverr> driverrs = proxy.getDriverrs();
    List<Car> cars = proxy.getCars();
    List<Van> vans = proxy.getVans();
        
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GoCheeta Client</title>
        
        <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>
        
        
        <style>
            
.about-section {
padding: 50px;
text-align: center;
background-color: #4d001f;
color: white;
}

#table {
    padding-top: 30px;
    padding-right: 20px;
    padding-bottom: 30px;
    padding-left: 75px;
    }    

p{
    font-size: 18px;
    color: #0088cc;
}

td
{
  width: 210px;
}

* {
margin: 0px;
padding: 0px;
box-sizing: border-box;
}

.body-text {
display: flex;
font-family: "Montserrat", sans-serif;
align-items: center;
justify-content: center;
margin-top: 250px;
}


.heading {
color: white;
text-transform: uppercase;
letter-spacing: 5px;
font-size: 20px;
}



            #result-section {
                padding-top: 30px;
                padding-right: 20px;
                padding-bottom: 30px;
                padding-left: 20px;
                }
                
            #control-section {
                padding-top: 30px;
                padding-right: 20px;
                padding-bottom: 30px;
                padding-left: 20px;
                }
                
            #msg-section{
                padding-top: 5px;
                padding-right: 20px;
                padding-bottom: 5px;
                padding-left: 40px;
                outline-style: solid;
                } 
              
.btn-success{
    width: 100%;
}
        </style>
        
    </head>
    <body>
        <div id='result-section'>
        <h1 align="center">GoCheeta</h1>
        <h2 align="center">Drivers and Travel Details</h2>
        
        <hr>
        
        <h3>Add Driver</h3>
        <a class="btn btn-success" href="index.jsp" role="button">ADD DRIVER</a><br><br><hr>
        
        <h3>Add Travel Details</h3>
        <a class="btn btn-success" href="#.jsp" role="button">ADD Travel Details</a><br><br><hr>
        
        <h2 align='center'>-- View All Drivers --</h2>
        <table id='cars' class='table-bordered' style='width:100%'>
            <thead>
                <th>Driver ID</th>
                <th>Driver Name</th>
                <th>Contact Number</th>
                <th>Branch</th>
                <th>UPDATE</th>
                <th>DELETE</th>
            </thead>
        <tbody>
            <% for(Driverr driver: driverrs){ %>
            <tr>
                <td><% out.print(driver.getId()); %></td>
                <td><% out.print(driver.getName()); %></td>
                <td><% out.print(driver.getTelno()); %></td>
                <td><% out.print(driver.getBranch()); %></td>
                <td>
                    <a href="editdriverr.jsp?id=<% out.print(driver.getId()); %>">UPDATE</a>
                </td>
                
                <td>
                    <a href="deletedriverr.jsp?id=<% out.print(driver.getId()); %>">DELETE</a>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
        
        
        <br><br><hr>
        <h2 align='center'>-- View All Car Travel Details --</h2>
        <table id='car' class='table-bordered' style='width:100%'>
            <thead>
                <th>Car ID</th>
                <th>Start City</th>
                <th>End City</th>
                <th>Destination</th>
                <th>Price (Rs. )</th>
                <th>UPDATE</th>
                <th>DELETE</th>
            </thead>
        <tbody>
            <% for(Car car: cars){ %>
            <tr>
                <td><% out.print(car.getCarid()); %></td>
                <td><% out.print(car.getStartcity()); %></td>
                <td><% out.print(car.getEndcity()); %></td>
                <td><% out.print(car.getDestination()); %></td>
                <td><% out.print(car.getPrice()); %></td>
                <td>
                    <a href="editcar.jsp?id=<% out.print(car.getCarid()); %>">UPDATE</a>
                </td>
                
                <td>
                    <a href="deletecar.jsp?id=<% out.print(car.getCarid()); %>">DELETE</a>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
        
        
        <br><br><hr>
        <h2 align='center'>-- View All Van Travel Details --</h2>
        <table id='van' class='table-bordered' style='width:100%'>
            <thead>
                <th>Van ID</th>
                <th>Start City</th>
                <th>End City</th>
                <th>Destination</th>
                <th>Price (Rs. )</th>
                <th>UPDATE</th>
                <th>DELETE</th>
            </thead>
        <tbody>
            <% for(Van van: vans){ %>
            <tr>
                <td><% out.print(van.getVanid()); %></td>
                <td><% out.print(van.getStartcity()); %></td>
                <td><% out.print(van.getEndcity()); %></td>
                <td><% out.print(van.getDestination()); %></td>
                <td><% out.print(van.getPrice()); %></td>
                <td>
                    <a href="editvan.jsp?id=<% out.print(van.getVanid()); %>">UPDATE</a>
                </td>
                
                <td>
                    <a href="deletevan.jsp?id=<% out.print(van.getVanid()); %>">DELETE</a>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
        
        
        </div>
        
        <script>
            $(document).ready(function () {
                $('#cars').DataTable();
             });
             
            $(document).ready(function () {
                $('#car').DataTable();
             });
             
             $(document).ready(function () {
                $('#van').DataTable();
             });
        </script>
    </body>
</html>


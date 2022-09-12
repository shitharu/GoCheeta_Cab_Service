<%-- 
    Document   : vansanddrivers
    Created on : Sep 7, 2022, 5:11:12 PM
    Author     : Tharushi Dhananjika
--%>
<%@page import="icbt.Van"%>
<%@page import="lk.icbt.ng.web.client.UIVan"%>
<%@page import="lk.icbt.ng.web.client.UIVan"%>
<%@page import="lk.icbt.ng.web.client.UIGoCheeta"%>
<%@page import="icbt.Driverr"%>
<%@page import="icbt.Car"%>
<%@page import="lk.icbt.ng.web.client.UICar"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vans and Drivers Page</title>
        
        <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>
        
        <style>
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
                
        </style>
        
    </head>
    <body>
        <%             
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();   
                       
        %>
        <h1 align="center">GOCHEETA VANS AND DRIVERS</h1>
        <hr>
        
        <h2 align="center">TRAVEL DETAILS  -   VANS</h2>
        <hr>
        
     
        <h3 align="center">VAN DETAILS</h3>
        <div id='result-section'>
            <table id='cars' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>Van ID</th>
                    <th>Start City</th>
                    <th>End City</th>
                    <th>Destination</th>
                    <th>Price (Rs. )</th>
                </tr>
            </thead>
            <tbody>
                <%       
                        if (request.getParameter("vanid") == null) {
                            for(Van van :  proxy.getVans()) {
                                UIVan.printVanRows(van, out);
                             }
                        } else {
                            UIVan.printVanRows(proxy.getVan(Integer.parseInt(request.getParameter("vanid"))), out);
                        }
                %>
            </tbody>
        </table>
        </div>
            <h3 align="center">DRIVER DETAILS</h3>
            <div id='result-section'>
            <table id='driverrs' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>Driver ID</th>
                    <th>Driver Name</th>
                    <th>Contact Number</th>
                    <th>Branch</th>
                </tr>
            </thead>
            <tbody>
                <%       
                    if (request.getParameter("id") == null) {
                        for(Driverr dvr :  proxy.getVansOnly()) {
                            UIGoCheeta.printDriverrRows(dvr, out);
                         }
                    } else {
                        //
                    }
                %>
            </tbody>
        </table>
        </div>
        
                <script>
                    $(document).ready(function () {
                        $('#cars').DataTable();
                     });
                </script>
    </body>
</html>

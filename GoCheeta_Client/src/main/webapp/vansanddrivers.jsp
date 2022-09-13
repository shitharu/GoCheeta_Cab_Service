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
.about-section {
  padding: 50px;
  text-align: center;
  background-color: #4d001f;
  color: white;
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

nav {
display: flex;
justify-content: space-around;
align-items: center;
min-height: 8vh;
background-color: #BF0060;
font-family: "Montserrat", sans-serif;
}

.heading {
color: white;
text-transform: uppercase;
letter-spacing: 5px;
font-size: 20px;
}

.nav-links {
display: flex;
justify-content: space-around;
width: 30%;
}

.nav-links li {
list-style: none;
}

.nav-links a {
color: white;
text-decoration: none;
letter-spacing: 3px;
font-weight: bold;
font-size: 14px;
padding: 14px 16px;
}

.nav-links a:hover:not(.active) {
background-color: #FF007F;
}

.nav-links li a.active {
background-color: #FF007F;
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
                
        </style>
        
    </head>
    <body style="background-color:#99c2ff;">
        <nav>

            <div class="heading">

                <a href="index.html"><i class="fa fa-home"></i></a>
                <h4>GoCheeta - VANS</h4>

            </div>

            <ul class="nav-links">

              <li><a href="index.html">Home</a></li>

              <li><a href="carsanddrivers.jsp">CAR</a></li>

              <li><a class="active" href="vansanddrivers.jsp">VAN</a></li>

            </ul>

          </nav>
        
        <%             
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();   
                       
        %>
        <h1 align="center">GOCHEETA VANS AND DRIVERS</h1>
    
        
        <h2 align="center">TRAVEL DETAILS  -   VANS</h2>
        <hr>
        <br><br>
     
        <h3 align="center">VAN DETAILS</h3>
        <div id='result-section'>
            <table id='vans' class='table table-striped table-bordered' style='width:100%'> 
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
            <br><br>
        </div>
            <h3 align="center">DRIVER DETAILS</h3>
            <br>
            <h5 id='msg-section'><b>WELCOME.. You can call any Van driver's mobile number, for your travel.
                    <br><br>They are register in one of their branches, but they are ready to come to any place for the tours you call.
                If they cannot be contacted at that moment, someone else will. Thank You ..</b></h5>
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
                        $('#vans').DataTable();
                     });
                </script>
                
                
        <div class="about-section">
          <h1>bbbbbbbbbbbbbbbbbbbbbbbb</h1>

          <p>aaaaaaaaaaaaaaaaaaaaa</p>
          <p>aaaaaaaaaaaaaaaaaaaaa</p>

          <h1>bbbbbbbbbbbbbbbbbbbbbb</h1>
        </div>
    </body>
</html>

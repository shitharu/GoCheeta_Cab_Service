<%-- 
    Document   : carsanddrivers
    Created on : Sep 7, 2022, 12:46:22 PM
    Author     : Tharushi Dhananjika
--%>

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
        <title>Cars and Drivers Page</title>
        
        <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>
        
        <link rel="stylesheet" href="service.css"/>
        
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
    <body style="background-color:pink;">
        <nav>
            
            <img src="gocheeta.png" alt="GoCheeta LOGO" width="80" height="80">

            <div class="heading">

                <a href="index.html"><i class="fa fa-home"></i></a>
                <h4>GoCheeta - CARS</h4>

            </div>

            <ul class="nav-links">

              <li><a href="index.html">Home</a></li>

              <li><a class="active" href="carsanddrivers.jsp">CAR</a></li>

              <li><a href="vansanddrivers.jsp">VAN</a></li>

            </ul>

          </nav>
        
        <%             
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();   
                       
        %>
        
        <div class="about-section">
            <h1>_ GOCHEETA CARS AND DRIVER DETAILS _</h1>

            <p>Hello We Are GoCheeta Cab Service.</p>
            <p>We'll Get You There. Best Cab Service in Sri Lanka.</p>

            <h1>WELCOME !!</h1>
        </div>
        
        
     <br><br>
        <h3 align="center">CAR DETAILS</h3>
        
        <div id='result-section'>
            <table id='cars' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>Car ID</th>
                    <th>Start City</th>
                    <th>End City</th>
                    <th>Destination</th>
                    <th>Price (Rs. )</th>
                </tr>
            </thead>
            <tbody>
                <%       
                        if (request.getParameter("id") == null) {
                            for(Car car :  proxy.getCars()) {
                                UICar.printCarRows(car, out);
                             }
                        } else {
                            UICar.printCarRows(proxy.getCar(Integer.parseInt(request.getParameter("carid"))), out);
                        }
                %>
            </tbody>
        </table>
            <br><br>
        </div>
            <h3 align="center">DRIVER DETAILS</h3>
            <br>
            <h5 id='msg-section'><b>You can call any Car driver's mobile number, for your travel.
                    <br><br> They are register in one of their branches, but they are ready to come to any place for the tours you call.
                If they cannot be contacted at that moment, someone else will.
                <br><br>Thank You ..</b></h5>
        
            
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
                        for(Driverr dvr :  proxy.getCarsOnly()) {
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
                
        <div class="about-section">
      
        <div id='table'> 
        <table>
          <tr>
            <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
            <td>
                <a href="index.html"><i class="fa-regular fa-hand" ></i></a> &nbsp Home<br>
                <a href="booking.html"><i class="fa-regular fa-hand" ></i></a> &nbsp Booking<br>
                <a href="about.html"><i class="fa-regular fa-hand" ></i></a> &nbsp About<br>
                <a href="services.html"><i class="fa-regular fa-hand" ></i></a> &nbsp Services<br>
                <a href="contact.jsp"><i class="fa-regular fa-hand" ></i></a> &nbsp Contact Us<br>
            </td>
            <td>
                <a href="login.jsp"><i class="fa-regular fa-hand" ></i></a> &nbsp Login<br>
                <a href="signup.jsp"><i class="fa-regular fa-hand" ></i></a> &nbsp Sign Up<br>
            </td>
            <td>Customer Service:<br>
                +94 76 000 0000<br><br>
                
                Email:<br>
                  gocheeta@gmail.com
            
            </td>
            <td>
                2022 GoCheeta<br>
                All Rights Reserved.<br>
            </td>
          </tr>
        </table>
        </div>
    </div>

    </body>
</html>

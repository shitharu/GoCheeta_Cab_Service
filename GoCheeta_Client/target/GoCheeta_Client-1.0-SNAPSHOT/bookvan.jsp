<%-- 
    Document   : bookvan
    Created on : Sep 18, 2022, 3:13:57 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="lk.icbt.ng.web.client.UIGoCheeta"%>
<%@page import="icbt.Driverr"%>
<%@page import="icbt.Van"%>
<%@page import="java.util.List"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BOOKING CAR</title>
        
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
<body>
    <%          
        
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();
            
            List<Van> vans = proxy.getVans();
            
        
%>  
   <nav>
            
            <img src="gocheeta.png" alt="GoCheeta LOGO" width="80" height="80">

            <div class="heading">

                <a href="index.html"><i class="fa fa-home"></i></a>
                <h4>GoCheeta - CARS</h4>

            </div>

            <ul class="nav-links">

              <li><a href="booking.html">BOOKING</a></li>

              <li><a  href="bookcar.jsp">CAR</a></li>

              <li><a class="active" href="bookvan.jsp">VAN</a></li>

            </ul>

          </nav>


          <div class="about-section">
            <h1>_ GOCHEETA VAN DETAILS _</h1>

            <p>Hello We Are GoCheeta Cab Service.</p>
            <p>We'll Get You There. Best Cab Service in Sri Lanka.</p>

            <h1>VAN BOOKING</h1>
        </div>
    
  
    
   

    <div class="container">
        <br>
        <h1 align="center">All Van Travels</h1>
            <table id='vans' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>Van ID</th>
                    <th>Start City</th>
                    <th>End City</th>
                    <th>Destination</th>
                    <th>Price</th>
                    <th>BOOKING</th>
                </tr>
            </thead>
            <tbody>
                
                <% for(Van car: vans){ %>
                    <tr>
                        <td><% out.print(car.getVanid()); %></td>
                        <td><% out.print(car.getStartcity()); %></td>
                        <td><% out.print(car.getEndcity()); %></td>
                        <td><% out.print(car.getDestination()); %></td>
                        <td><% out.print(car.getPrice()); %></td>
                        <td>
                            <a href="vanpayment.jsp?id=<% out.print(car.getVanid()); %>">BOOKING</a>
                        </td>
                        
                    </tr>
                    <% } %>
                    
                  
            </tbody>
        </table><br><br><br><br>
                  
        <h1 align="center">All Van Driver Travels</h1>
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
                    
                    $(document).ready(function () {
                        $('#drivers').DataTable();
                    });
                                             
                </script>
        
        
        <hr>

        
        <h3>Your Payment Will Be Processed According to the mentioned Above. In Addition to that;</h3><br>
              
        <h4><span class="fa fa-star checked">&nbsp; Waiting fee will calculate.</span></h4>
        <h4><span class="fa fa-star checked">&nbsp; Discount are given for special people and dates.</span></h4>
        <h4><span class="fa fa-star">&nbsp; Provide a comfortable destination.</span></h4>
        <h4><span class="fa fa-star">&nbsp; Don't be rude.</span></h4>
        <h4><span class="fa fa-star">&nbsp; Always be friendly with your driver.</span></h4>

      <hr>
      <h3 align="right">Thank You ..</h3>
      
      
      <h5 align="right">By creating an account you can feel our services from <a href="services.html">Services</a>.</h5>
      <hr>
      </div>
            
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
<%-- 
    Document   : bookcar
    Created on : Sep 14, 2022, 11:22:06 PM
    Author     : Tharushi Dhananjika
--%>



<%@page import="java.util.List"%>
<%@page import="icbt.Car"%>
<%@page import="lk.icbt.ng.web.client.UICar"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="icbt.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    
.about-section {
  padding: 50px;
  text-align: center;
  background-color: #1A5276;
  color: white;
}

p{
    font-family: Arial;
    font-size: 18px;
    color: #9FE2BF;
}

.btn-success{
    width: 100%;
}

.btn-danger{
    width: 100%;
}

#table {
    padding-top: 30px;
    padding-right: 20px;
    padding-bottom: 30px;
    padding-left: 75px;
} 

body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */



.h2{
   text-align: center;
} 



/* Add padding to container elements */
.container {
  padding: 20px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 80%; /* Full width */
  height: 80%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 90%; /* Could be more or less, depending on screen size */
}

.checked {
  color: orange;
}

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

</style>
</head>
<body>
    <%          
        
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();
            
            List<Car> cars = proxy.getCars();
            
        
%>  
                       
    %>
    
    <div class="about-section">
      
        <div id='table'> 
        <table>
          <tr>
            <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
            <td>
                <h1>_ CAR BOOKING _</h1>
      
                <p>We Are GoCheeta Cab Service</p>
                <p>We Provide You With a Very Comfortable Travel Experience. Best Cab Service in Sri Lanka.</p>

                <h1>BOOKING !!</h1>
            </td>
            <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
          </tr>
        </table>
        </div>
    </div>
    

    <div class="container">
  
        <h1>All Car Travels</h1>
            <table id='table' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>Car ID</th>
                    <th>Start City</th>
                    <th>End City</th>
                    <th>Destination</th>
                    <th>Price</th>
                </tr>
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
                            <a href="carpayment.jsp?id=<% out.print(car.getCarid()); %>">BOOKING</a>
                        </td>
                        
                    </tr>
                    <% } %>
                    
                  
            </tbody>
        </table>
        
                <script>
                    
                     $(document).ready(function () {
                        $('#cars').DataTable();
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
      <hr>
      
      <h5 align="right">By creating an account you can feel our services from <a href="services.html">Services</a>.</h5>
      <hr>
      
    
  </div>



</body>
</html>
<%-- 
    Document   : carpayment
    Created on : Sep 18, 2022, 12:54:48 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Car"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%  
    int carid = Integer.parseInt(request.getParameter("id"));
    
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort(); 
    
    Car car = proxy.getCarbyId(carid);
    
        
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
            <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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

input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

.h2{
   text-align: center;
} 

.container {
  padding: 20px;
}

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

.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 90%; /* Could be more or less, depending on screen size */
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

</style>
        
    </head>
    <body>
        <form class="modal-content" action="processcarpayment.jsp" method="post">
        <div class="container">
          <h1>Travel Payment Form,</h1>
          <hr>

            <label for="id">User ID</label><br>
            <input type="text" id="id" name="id" placeholder="Enter Your User ID" required><br>

            <label for="name">Name</label><br>
            <input type="text" id="name" name="name" placeholder="Enter Your Name"><br>
          
            <label for="startcity">Start City</label><br>
            <input type="text" id="startcity" name="startcity" placeholder="Enter Start City" value="<% out.print(car.getStartcity()); %>"><br>

            <label for="endcity">End City</label><br>
            <input type="text" id="endcity" name="endcity" placeholder="Enter End City" value="<% out.print(car.getEndcity()); %>"><br>

            <label for="price">Price</label><br>
            <input type="text" id="price" name="price" placeholder="Enter Price (Rs.)" value="<% out.print(car.getPrice()); %>"><br>
            
            <label for="destination">Destination</label><br>
            <input type="text" id="destination" name="destination" placeholder="Enter Destination" value="<% out.print(car.getDestination()); %>"><br>

            <label for="destination">Feedback Message</label><br>
            <textarea id="feedback" name="feedback" placeholder="Write your feedback in here.." style="height:200px; width: 100%" required></textarea>
            

            <br>
            <input type="hidden" name="car_id" value="<% out.print(car.getCarid()); %>"><br>
            <input type="submit" value="BOOK A CAR" class="btn btn-success">
            
           
            <a class="btn btn-danger" href="bookcar.jsp" role="button">BACK</a>
            
        </div>
        </form>
    </body>
</html>
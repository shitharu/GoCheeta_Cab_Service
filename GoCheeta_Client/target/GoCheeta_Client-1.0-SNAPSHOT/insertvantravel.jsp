<%-- 
    Document   : insertvantravel
    Created on : Sep 17, 2022, 1:42:09 PM
    Author     : Tharushi Dhananjika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
  display: none; 
  position: fixed; 
  z-index: 1; 
  left: 0;
  top: 0;
  width: 80%;
  height: 80%; 
  overflow: auto;
  background-color: #474e5d;
  padding-top: 50px;
}

.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; 
  border: 1px solid #888;
  width: 90%;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

</style>
        
    </head>
    <body>
        <form class="modal-content" action="processvan.jsp" method="post">
        <div class="container">
          <h1>Van Travel Registration Form,</h1>
          <h4>Please fill in this to register van travel details.</h4>
          <hr>
        
            <label for="vanid">Van ID</label><br>
            <input type="text" id="vanid" name="vanid" placeholder="Enter Van ID" required><br>
            
            <label for="startcity">Start City</label><br>
            <input type="text" id="startcity" name="startcity" placeholder="Enter Start City" required><br>

            <label for="endcity">End City</label><br>
            <input type="text" id="endcity" name="endcity" placeholder="Enter End City" required><br>

            <label for="destination">Destination</label><br>
            <input type="text" id="destination" name="destination" placeholder="Enter Destination" required><br>

            <label for="price">Price</label><br>
            <input type="text" id="price" name="price" placeholder="Enter Price (Rs.)" required><br>

            <br>
            <input type=submit value='SUBMIT' class="btn btn-success">
        
            <a class="btn btn-danger" href="driverr_details.jsp" role="button">CLOSE</a>
 
        </div>
        </form>
    </body>
</html>



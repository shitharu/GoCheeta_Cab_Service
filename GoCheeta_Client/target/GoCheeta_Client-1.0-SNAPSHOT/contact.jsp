<%-- 
    Document   : contact
    Created on : Sep 9, 2022, 12:42:57 PM
    Author     : Tharushi Dhananjika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>

<!DOCTYPE html>

<html lang="en">

  <head>

    <meta charset="UTF-8" />

    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link href="https://fonts.googleapis.com/css2?family=Montserrat&display=swap" rel="stylesheet"/>
    <link rel="stylesheet" href="navbar.css" />

    <title>Contact</title>
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"/>
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet"/>

    
    <style>
        
.about-section {
  padding: 50px;
  text-align: center;
  background-color: #1A5276;
  color: white;
}
       
input[type=text], select, textarea {
  width: 100%; /* Full width */
  padding: 12px; /* Some padding */ 
  border: 1px solid #ccc; /* Gray border */
  border-radius: 4px; /* Rounded borders */
  box-sizing: border-box; /* Make sure that padding and width stays in place */
  margin-top: 6px; /* Add a top margin */
  margin-bottom: 16px; /* Bottom margin */
  resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */
}

/* Style the submit button with a specific background color etc */
input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

/* When moving the mouse over the submit button, add a darker green color */
input[type=submit]:hover {
  background-color: #45a049;
}

/* Add a background color and some padding around the form */
.container {
  border-radius: 5px;
  background-color: #85C1E9;
  padding: 20px;
    
}
    </style>
    
  </head>

  <body style="background-color:#85C1E9;">
      <%             
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();   
                       
        %>

    <nav>

      <div class="heading">

          <a href="index.html"><i class="fa fa-home"></i></a>
          <h4>GoCheeta</h4>

      </div>

      <ul class="nav-links">

        <li><a href="index.html">Home</a></li>
        
        <li><a href="booking.html">Booking</a></li>

        <li><a href="about.html">About</a></li>

        <li><a href="services.html">Services</a></li>
        
        <li><a class="active" href="contact.html">Contact</a></li>

      </ul>

    </nav>
      <br><br>
      <h1 align="center">Contact Us</h1>
      <h2 align="center">If you want some details from us .. Here we are;</h2>
      <h2 align="center">Ask now ..</h2>
      <br><br>

    <div class="container">
      <form action="processcontact.jsp" method="post">

        ID
        <input type="text" id="id" name="id" placeholder="Your ID.."/>
          
        Name
        <input type="text" id="name" name="name" placeholder="Your name.."/>
        
        Mobile Number
        <input type="text" id="mobile" name="mobile" placeholder="Your mobile number.."/>
        
        Message
        <textarea id="message" name="message" placeholder="Write your message in here.." style="height:200px"></textarea>

        <input type="submit" value="SUBMIT">

      </form>
    </div>
      
    <div class="about-section">
      <h1>bbbbbbbbbbbbbbbbbbbbbbbb</h1>
      
      <p>aaaaaaaaaaaaaaaaaaaaa</p>
      <p>aaaaaaaaaaaaaaaaaaaaa</p>
      
      <h1>bbbbbbbbbbbbbbbbbbbbbb</h1>
    </div>
 

  </body>

</html>
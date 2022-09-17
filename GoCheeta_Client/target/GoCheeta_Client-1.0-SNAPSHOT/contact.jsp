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

    <link rel="stylesheet" href="service.css"/>
    
    <style>
        
.about-section {
  padding: 50px;
  text-align: center;
  background-color: #1A5276;
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
  background-color: #85C1E9;
  padding: 20px;
    
}
.btn-success{
    width: 100%;
    height: 70px;
}

    </style>
    
  </head>

  <body style="background-color:#85C1E9;">
      <%             
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();   
                       
        %>

    <nav>
        <img src="gocheeta.png" alt="GoCheeta LOGO" width="80" height="80">

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
        
    <div class="about-section">
      <h1>_ CONTACT US _</h1>
      
      <p>If you want some details from us .. Here we are;</p>
      <p>We'll Get You There. Best Cab Service in Sri Lanka.</p>
      
      <h2>Give Us Your Feedback</h2>
    </div>
        
    <div class="container">
      <form action="processcontact.jsp" method="post" class="modal-content">

        ID
        <input type="text" id="id" name="id" placeholder="Your ID.." required/>
          
        Name
        <input type="text" id="name" name="name" placeholder="Your name.." required/>
        
        Mobile Number
        <input type="text" id="mobile" name="mobile" placeholder="Your mobile number.." required/>
        
        Message
        <textarea id="message" name="message" placeholder="Write your Message in here.." style="height:200px" required></textarea>

        <input type="submit" class="btn btn-success" value="SUBMIT">

      </form>
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
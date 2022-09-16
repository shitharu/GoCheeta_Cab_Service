<%-- 
    Document   : index
    Created on : Aug 7, 2022, 9:41:14 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="lk.icbt.ng.web.client.UIGoCheeta"%>
<%@page import="java.util.List"%>
<%@page import="icbt.Driverr"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                
            #edit-section {
                padding-top: 30px;
                padding-right: 20px;
                padding-bottom: 30px;
                padding-left: 20px;
                }    
  
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

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

</style>
    </head>
    <body>
        
        <div class="about-section">
      
        <div id='table'> 
            <table>
              <tr>
                <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
                <td>
                    <h1>_ DRIVER REGISTRATION FORM _</h1>
                    <p>We Are GoCheeta Cab Service</p>
                    <p>We Provide You With a Very Comfortable Travel Experience. Best Cab Service in Sri Lanka.</p>
                    <h1>JOIN US !!</h1>
                </td>
                <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
              </tr>
            </table>
            </div>
        </div>
        
        
        <div>
        <div class="container">
          <form action="process_driverr.jsp" method="post">
            
              <h1>Driver Registration Here,</h1>
              <h4>Please fill in this form to create a new driver account.</h4>
              <hr>

              <b>ID</b>
              <input type="text" id="id" placeholder="id" name="id" required>

              <b>Name</b>
              <input type="text" id="name" placeholder="Your Name" name="name" required>

              <b>Telephone Number</b>
              <input type="text" id="telno" placeholder="Your Telephone Number" name="telno" required>

              <b>Branch</b>
              <input type="text" id="branch" placeholder="Enter Branch" name="branch" required>
              
              <label><b>Choose a Vehicle</b></label>
                <select name="vehicle" id="vehicle">
                  <option value="Car">Car</option>
                  <option value="Van">Van</option>
                </select><br><br><br>

              <b>Enter Email</b>
              <input type="text" id="email" placeholder="Enter Email" name="email" required>

              <b>Enter password</b>
              <input type="Password" id="password" placeholder="Enter password" name="password"  required>             

                <input type=submit value='SUBMIT' class="btn btn-success">
                
                
                <br><br>

            </form>
            <a class="btn btn-danger" href="index.html" role="button">CLOSE</a><br><br>
            
            <br><br>
            <h5 align="right">By creating an account you can feel our services from <a href="services.html">Services</a>.</h5>
            </div>
            
        </div>
    </body>
</html>

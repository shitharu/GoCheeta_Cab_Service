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
        <%             
            WebGoCheeta_Service service = new WebGoCheeta_Service();
            WebGoCheeta proxy = service.getWebGoCheetaPort();   
                       
        %>
        
        <div class="about-section">
      
        <div id='table'> 
            <table>
              <tr>
                <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
                <td>
                    <h1>_ DRIVER REGISTRATION FORM _</h1>
                    <p>We Are GoCheeta Cab Service</p>
                    <h1>JOIN US !!</h1>
                </td>
                <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
              </tr>
            </table>
            </div>
        </div>
        <hr>
        
        
        
        <div>
  
  <form class="modal-content" action="process_driverr.jsp" method="post">
    <div class="container">
      <h1>Register Here,</h1>
      <h4>Please fill in this form to create a new user account.</h4>
      <hr>
      
      <b>ID</b>
      <input type="text" placeholder="id" name="id" required>

      <b>Name</b>
      <input type="text" placeholder="Your Name" name="name" required>
      
      <b>Telephone Number</b>
      <input type="text" placeholder="Your Telephone Number" name="telno" required>
      
      <b>Branch</b>
      <input type="text" placeholder="Enter Branch" name="branch" required>
      
      <b>Enter Email</b>
      <input type="text" placeholder="Enter Email" name="email" required>

      <b>Mobile No</b>
      <input type="text" placeholder="mobile no" name="mobile" required>
      
      <label><b>Choose a Vehicle</b></label>
        <select name="vehicle" id="vehicle">
          <option value="Car">Car</option>
          <option value="Van">Van</option>
        </select><br><br><br>
      
      <b>Username</b>
      <input type="text" placeholder="Enter username" name="username" required>
      
      <b>Enter password</b>
      <input type="Password" placeholder="Enter password" name="password" required>

      
        <input type=submit value='SUBMIT' class="btn btn-success">
        
        <input type=button value='CLOSE' class="btn btn-danger">
        
        
      <h5>By creating an account you can feel our services from <a href="services.html">Services</a>.</h5>

    </div>
  </form>
</div>

        
        
        <h3>Search, Update and Delete Drivers</h3>
        <div id='control-section'>
            <form action="index.jsp" method="post">
                Driver ID : <input type="text" name="id"/>
                            
                <input type="submit" value="LOAD"> <br><br>
                Name : <input type="text" name="name"/>
                Tel_No : <input type="text" name="telno"/>
                Branch : <input type="text" name="branch"/>
                Vehicle : <input type="text" name="vehicle"/>
                   
                <input type="submit" value="UPDATE">
                <input type="submit" value="DELETE"> <br>
                
            </form>
        </div>
        <hr>
        
        <h3>All Drivers</h3>
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
                        for(Driverr dvr :  proxy.getDriverrs()) {
                            UIGoCheeta.printDriverrRows(dvr, out);
                         }
                    } else {
                        UIGoCheeta.printDriverrRows(proxy.getDriverr(Integer.parseInt(request.getParameter("id"))), out);
                    }
                %>
            </tbody>
        </table>
        </div>
        
                <script>
                    $(document).ready(function () {
                        $('#driverrs').DataTable();
                     });
                </script>
    </body>
</html>

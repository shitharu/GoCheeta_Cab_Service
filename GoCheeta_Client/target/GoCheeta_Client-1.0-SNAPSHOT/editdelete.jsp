<%-- 
    Document   : editdelete
    Created on : Aug 7, 2022, 9:41:14 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.Car"%>
<%@page import="lk.icbt.ng.web.client.UICar"%>
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
      
        <h3>Search, Update and Delete Drivers</h3>
        <div id='control-section'>
            <form action="editdelete.jsp" method="post">
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
        
        <h3>Car Details</h3>
        <div id='result-section'>
            <table id='driverrs' class='table table-striped table-bordered' style='width:100%'> 
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
                <%       
                        if (request.getParameter("id") == null) {
                            for(Car car :  proxy.getCars()) {
                                UICar.printCarRows(car, out);
                             }
                        } else {
                            UICar.printCarRows(proxy.getLocation(Integer.parseInt(request.getParameter("id"))), out);
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

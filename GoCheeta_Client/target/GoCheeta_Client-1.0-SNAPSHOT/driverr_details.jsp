<%-- 
    Document   : driverr_details
    Created on : Sep 6, 2022, 3:46:50 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="lk.icbt.ng.web.client.UIGoCheeta"%>
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
                
        </style>
    </head>
    <body>
        <%             
          //  WebGoCheeta_Service service = new WebGoCheeta_Service();
          //  WebGoCheeta proxy = //service.getWebGoCheetaPort();   
                       
        %>
        <h1 align="center">GoCheeta</h1>
        <hr>
        <hr>
        
        <h3>Add Drivers</h3>

        <div id='edit-section'>
                <form action="process_driverr.jsp" method="post">
                   ID : <input type="text" name="id"/>
                   Name : <input type="text" name="name"/>
                   Tel_No : <input type="text" name="telno"/>
                   Branch : <input type="text" name="branch"/>
                <input type="submit" value="Add">
            </form>
        </div>
        <hr>
        
        <h3>Search, Update and Delete Drivers</h3>
        <div id='control-section'>
            <form action="index.jsp" method="post">
                Driver ID : <input type="text" name="id"/>
                            
                <input type="submit" value="LOAD"> <br><br>
                Name : <input type="text" name="name"/>
                Tel_No : <input type="text" name="telno"/>
                Branch : <input type="text" name="branch"/>
                   
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
                    <th>ID</th>
                    <th>Name</th>
                    <th>Contact Number</th>
                    <th>Branch</th>
                </tr>
            </thead>
            <tbody>
                <%       
                       // if (request.getParameter("id") == null) {
                         //   for(Driverr dvr :  proxy.getDriverrs()) {
                         //       UIGoCheeta.printDriverrRows(dvr, out);
                          //   }
                       // } else {
                      //      UIGoCheeta.printDriverrRows(proxy.getDriverr(Integer.parseInt(request.getParameter("id"))), out);
                      //  }
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


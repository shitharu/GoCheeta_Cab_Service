<%-- 
    Document   : index
    Created on : Aug 22, 2022, 10:23:18 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="GoCheeta.UIGoCheeta"%>
<%@page import="gocheeta.Driver"%>
<%@page import="gocheeta.NewWebServiceGoCheeta"%>
<%@page import="gocheeta.NewWebServiceGoCheeta_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Page</title>
        
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
        <h1>Hello Go Cheeta Client!</h1>
        
        <div id='control-section'>
            <form action="index.jsp" method="post">
                Driver ID : <input type="text" name="id"/>
                <input type="submit" value="load">
            </form>
        </div>
        
        <div id='edit-section'>
                <form action="process_driver.jsp" method="post">
                   Driver ID : <input type="text" name="id"/>
                   Driver Name : <input type="text" name="name"/>
                   Driver Telephone Number : <input type="text" name="telno"/>
                   Driver Branch : <input type="text" name="branch"/>
                   Driver Vehicle : <input type="text" name="vehicle"/>
                <input type="submit" value="Add">
            </form>
        </div>
        
        <div id='result-section'>
            <table id='drivers' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Telephone Number</th>
                    <th>Branch</th>
                    <th>Vehicle</th>
                </tr>
            </thead>
            <tbody>
                <%
                        NewWebServiceGoCheeta_Service service = new NewWebServiceGoCheeta_Service();
                        NewWebServiceGoCheeta proxy = service.getNewWebServiceGoCheetaPort();
                        if (request.getParameter("id") == null) {
                            for(Driver dv : proxy.getDrivers()) {
                                UIGoCheeta.printDriverRows(dv, out);
                             }
                        }                    
                        else {
                                UIGoCheeta.printDriverRows(proxy.getDriver(Integer.parseInt(request.getParameter("id"))), out);
                        }
                %>
            </tbody>
        </table>
        </div>
        
                <script>
                    $(document).ready(function () {
                        $('#drivers').DataTable();
                     });
                </script>
                
    </body>
</html>

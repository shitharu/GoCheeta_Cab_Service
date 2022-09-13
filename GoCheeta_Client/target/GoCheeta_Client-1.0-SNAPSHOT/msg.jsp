<%-- 
    Document   : msg
    Created on : Sep 12, 2022, 11:44:44 AM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="icbt.Contact"%>
<%@page import="java.util.List"%>
<%@page import="lk.icbt.ng.web.client.UIGoCheeta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>messages Page</title>
        
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
             
        </style>
    </head>
    <body>
        <h3>All Messages</h3>
        <div id='result-section'>
            <table id='messages' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>No</th>
                    <th>Name</th>
                    <th>Mobile</th>
                    <th>Message</th>
                </tr>
            </thead>
            <tbody>
                <%       
                    WebGoCheeta_Service service = new WebGoCheeta_Service();
                    WebGoCheeta proxy = service.getWebGoCheetaPort();  
            
                    if (request.getParameter("id") == null) {
                        for(Contact cnt :  proxy.getMessages()) {
                            UIGoCheeta.printMessagesRows(cnt, out);
                         }
                    } else {
                       // UIGoCheeta.printDriverrRows(proxy.getDriverr(Integer.parseInt(request.getParameter("id"))), out);
                    }
                %>
            </tbody>
        </table>
        </div>
        
                <script>
                    $(document).ready(function () {
                        $('#messages').DataTable();
                     });
                </script>
    </body>
</html>

<%-- 
    Document   : newjsp
    Created on : Sep 4, 2022, 8:30:34 PM
    Author     : Tharushi Dhananjika
--%>

<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="lk.icbt.ng.web.client.UIUsers"%>
<%@page import="lk.icbt.ng.web.client.UIGoCheeta"%>
<%@page import="icbt.User"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All User Details Page</title>
        
        <script type="text/javascript" charset="utf8" src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">
        <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>
        
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
                
            #table {
                padding-top: 30px;
                padding-right: 20px;
                padding-bottom: 30px;
                padding-left: 75px;
} 
            #msg-section{
                padding-top: 5px;
                padding-right: 20px;
                padding-bottom: 5px;
                padding-left: 40px;
                outline-style: solid;
                }   

                .btn-info{
    width: 100%;
    height: 70px;
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
                    <h1>_ USER Details _</h1>

                    <p>We Are GoCheeta Cab Service</p>
                    <p>We Provide You With a Very Comfortable Travel Experience. Best Cab Service in Sri Lanka.</p>

                    <h1>welcome !!</h1>
                </td>
                <td><img src="gocheeta.png" alt="GoCheeta LOGO" width="150" height="150"></td>
              </tr>
            </table>
            </div>
        </div>
        
        <br>
            <h5 align= "center" id='msg-section'><b>  You Can Insert and Register User.
                    <br><br> You Can Delete Users.
                    <br><br> But, Sorry .. You Can't Update User Details Because of Some Security Issues. 
                    <br><br> Thank You ..</b>
            </h5>
        
        <a class="btn btn-info" href="userregistrastion.jsp" role="button"><br>USER REGISTRATION</a><br><br><hr>
        
        <div id='result-section'>
            <table id='users' class='table table-striped table-bordered' style='width:100%'> 
            <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>NIC</th>
                    <th>Address</th>
                    <th>Email</th>
                    <th>MObile</th>
                    <th>ID</th>
                    <th>Username</th>
                    <th>Password</th>
                </tr>
            </thead>
            <tbody>
                <%       
                        if (request.getParameter("id") == null) {
                            for(User user :  proxy.getUsers()) {
                                UIUsers.printUsersRows(user, out);
                             }
                        } else {
                            UIUsers.printUsersRows(proxy.getUser(Integer.parseInt(request.getParameter("id"))), out);
                        }
                %>
            </tbody>
        </table>
        </div>
            <script>
                    $(document).ready(function () {
                        $('#users').DataTable();
                     });
            </script>
    </body>
</html>

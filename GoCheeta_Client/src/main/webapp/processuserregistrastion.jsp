<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="icbt.User"%>
<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();
   
    User user = new User();
    
    user.setFirstname(request.getParameter("firstname"));
    user.setLastname(request.getParameter("lastname"));
    user.setNic(request.getParameter("nic"));
    user.setAddress(request.getParameter("address"));
    user.setEmail(request.getParameter("email"));
    user.setId(Integer.parseInt(request.getParameter("id")));
    user.setMobile(Integer.parseInt(request.getParameter("mobile")));
    user.setUsername(request.getParameter("username"));
    user.setPassword(request.getParameter("password"));
    
    proxy.addUser(user);
    response.sendRedirect("userregistrastion.jsp");
    

%>
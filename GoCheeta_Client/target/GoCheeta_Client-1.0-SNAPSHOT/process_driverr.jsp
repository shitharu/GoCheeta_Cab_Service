<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="icbt.Driverr"%>


<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();
   
    Driverr dvr = new Driverr();
    dvr.setId(Integer.parseInt(request.getParameter("id")));
    dvr.setName(request.getParameter("name"));
    dvr.setTelno(Integer.parseInt(request.getParameter("telno")));
    dvr.setBranch(request.getParameter("branch"));
    proxy.addDriverr(dvr);
    response.sendRedirect("index.jsp");
    

%>
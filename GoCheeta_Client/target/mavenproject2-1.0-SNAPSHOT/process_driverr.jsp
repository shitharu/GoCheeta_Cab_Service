<%@page import="icbt.Driverr"%>
<%@page import="icbt.NewWebServiceGoCheeta_Service"%>
<%@page import="icbt.NewWebServiceGoCheeta"%>

<%
    NewWebServiceGoCheeta_Service service = new NewWebServiceGoCheeta_Service();
    NewWebServiceGoCheeta proxy = service.getNewWebServiceGoCheetaPort();
   
    Driverr dvr = new Driverr();
    dvr.setId(Integer.parseInt(request.getParameter("id")));
    dvr.setName(request.getParameter("name"));
    dvr.setTelno(Integer.parseInt(request.getParameter("telno")));
    dvr.setBranch(request.getParameter("branch"));
    proxy.addDriverr(dvr);
    response.sendRedirect("index.jsp");
    

%>
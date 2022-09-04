<%@page import="gocheeta.Driver"%>
<%@page import="gocheeta.NewWebServiceGoCheeta_Service"%>
<%@page import="gocheeta.NewWebServiceGoCheeta"%>

<%
    NewWebServiceGoCheeta_Service service = new NewWebServiceGoCheeta_Service();
    NewWebServiceGoCheeta proxy = service.getNewWebServiceGoCheetaPort();
   
    Driver dv = new Driver();
    dv.setId(Integer.parseInt(request.getParameter("id")));
    dv.setName(request.getParameter("name"));
    dv.setTelno(Integer.parseInt(request.getParameter("telno")));
    dv.setBranch(request.getParameter("branch"));
    dv.setVehicle(request.getParameter("vehicle"));
    
    proxy.addDriver(dv);
    response.sendRedirect("index.jsp");

%>
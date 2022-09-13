<%@page import="icbt.WebGoCheeta"%>
<%@page import="icbt.WebGoCheeta_Service"%>
<%@page import="icbt.Contact"%>


<%
    WebGoCheeta_Service service = new WebGoCheeta_Service();
    WebGoCheeta proxy = service.getWebGoCheetaPort();
   
    Contact cnt = new Contact();
    cnt.setId(Integer.parseInt(request.getParameter("id")));
    cnt.setName(request.getParameter("name"));
    cnt.setMobile(Integer.parseInt(request.getParameter("mobile")));
    cnt.setMessage(request.getParameter("message"));
    proxy.addContactUs(cnt);
    response.sendRedirect("contact.jsp");
    
    out.print("send message");
%>
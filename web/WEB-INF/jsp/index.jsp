<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%--Commented initial content.
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC ToDoList project</title>
    </head>

    <body>
        <p><H1>Hello! This is the default welcome page for a Spring Web MVC ToDoList project. </H1></p>
        <p><i>To display a different welcome page for this project, modify index.jsp</i></p>
    </body>
</html>
--%>
<%--Adding content according to the guide --%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<c:redirect url="/hello.htm"/>

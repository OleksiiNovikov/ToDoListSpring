<%-- 
    Document   : resultViewTasks
    Created on : Jul 23, 2016, 3:15:16 PM
    Author     : onovikov
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h3>Hello. This is a View of ToDoListSPring Web Application</h3>

        <p>The list of tasks for today: <c:out value="${model.date}"/>
    </body>
</html>

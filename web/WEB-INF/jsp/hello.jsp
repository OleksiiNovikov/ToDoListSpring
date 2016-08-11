<%-- 
    Document   : hello
    Created on : Jun 13, 2016, 8:40:37 AM
    Author     : onovikov
--%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Hello. This is a View of ToDoListSPring Web Application</h3>
         <p>Greetings, today is <c:out value="${model.today}"/></p>
        <p>The list of tasks for today: <c:out value="${model.tasks}"/>
        <form action="resultViewTasks" method=“GET”>
        Date: <input type="text" name="date" size="20"/>
        <input type="submit" value="View Tasks"/>
         </form>
    </body>
</html>

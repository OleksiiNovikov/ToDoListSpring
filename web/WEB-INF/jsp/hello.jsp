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
         <p>The list of tasks for today: <c:out value="${model.daytasks}"/>
        <br><br>Please enter date for the Task: <input type="text" name="taskDate" size="20">
        <br><br>Please enter your task here:&nbsp&nbsp&nbsp&nbsp <input type="text" name="newTask" size="100">
        <br><br><input type="submit" value="Submit">
    </body>
</html>

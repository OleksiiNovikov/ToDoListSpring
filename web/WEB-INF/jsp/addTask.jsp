<%-- 
    Document   : addTask
    Created on : Jul 21, 2016, 9:53:06 PM
    Author     : onovikov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form:form method="POST" action="/ToDoListSpring/addTask">
   <table>
    <tr>
        <td><form:label path="date">Date</form:label></td>
        <td><form:input path="date" /></td>
    </tr>
    <tr>
        <td><form:label path="task">Task</form:label></td>
        <td><form:input path="task" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="addTask"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>

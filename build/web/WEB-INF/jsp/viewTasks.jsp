<%-- 
    Document   : viewTasks
    Created on : Jul 21, 2016, 9:56:45 PM
    Author     : onovikov
--%>
<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<form:form method="GET" action="/ToDoListSpring/resultViewTasks">
   <table>
    <tr>
        <td><form:label path="date">Date</form:label></td>
        <td><form:input path="date" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="View Tasks"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>

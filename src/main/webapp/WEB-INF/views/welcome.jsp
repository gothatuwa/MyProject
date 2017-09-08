<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title>Spring MVC Test</title>
</head>
<body>

<h2>Student Information</h2>
<form:form method="POST" action="TestController/addEmployee">
    <table>
        <tr>
            <td><form:label path="ID">ID</form:label></td>
        </tr>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input  type="text" path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="salary">Salary</form:label></td>
            <td><form:input type="text" path="salary" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
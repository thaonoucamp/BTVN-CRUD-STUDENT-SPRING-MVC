<%--
  Created by IntelliJ IDEA.
  User: thaodangxuan
  Date: 12/08/2021 sau CN
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    table {
        border: 1px solid #000;
    }

    th, td {
        border: 1px dotted #555;
    }
</style>
<table>
    <caption>Student List</caption>
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Address</th>
        <th>Phone number</th>
        <th>Email</th>
        <th>Address</th>
        <th>Class Room</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${list}">
        <tr>
            <td>
                <c:out value="${c.id}"/>
            </td>
            <td>
                <c:out value="${c.name}"/>
            </td>
            <td>
                <c:out value="${c.dateOfBirth}"/>
            </td>
            <td>
                <c:out value="${c.address}"/>
            </td>
            <td>
                <c:out value="${c.phoneNumber}"/>
            </td>
            <td>
                <c:out value="${c.email}"/>
            </td>
            <td>
                <c:out value="${c.classRoom}"/>
            </td>
            <td>
                <a href="/students/edit/" name="${c.id}">Edit</a>
            </td>
            <td>
                <a href="/students/delete/" name="${c.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

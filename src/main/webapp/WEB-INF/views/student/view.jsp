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
    <tbody>
        <tr>
            <th>Id</th>
            <td>
                <c:out value="${c.id}"/>
            </td>
            <th>Name</th>
            <td>
                <c:out value="${c.name}"/>
            </td>
            <th>Date Of Birth</th>
            <td>
            <c:out value="${c.dateOfBirth}"/>
            </td>
            <th>Address</th>
            <td>
                <c:out value="${c.address}"/>
            </td>
            <th>Phone number</th>
            <td>
                <c:out value="${c.phoneNumber}"/>
            </td>
            <th>Email</th>
            <td>
                <c:out value="${c.email}"/>
            </td>
            <th>Class Room</th>
            <td>
                <c:out value="${c.classRoom}"/>
            </td>
        </tr>
    </tbody>
</table>
</body>
</html>

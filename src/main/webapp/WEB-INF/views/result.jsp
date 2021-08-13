<%--
  Created by IntelliJ IDEA.
  User: thaodangxuan
  Date: 12/08/2021 sau CN
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/calculator">
        <input type="text" name="number1" placeholder="number1">
        <input type="text" name="number2" placeholder="number2">
        <input type="text" name="result" placeholder="result" value="${result}">
        <br>
        <input name="pt" type="submit" value="sum">
        <input name="pt" type="submit" value="sub">
        <input name="pt" type="submit" value="multi">
        <input name="pt" type="submit" value="div">
    </form>
</div>
</body>
</html>

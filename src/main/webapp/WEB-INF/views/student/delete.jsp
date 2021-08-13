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
    <div>
        <form action="/students/delete/{id}">
            <input type="text" name="id" placeholder="id">
            <br>
            <input type="text" name="name" placeholder="name">
            <br>
            <input type="text" name="name" placeholder="name">
            <br>
            <input type="text" name="address" placeholder="address">
            <br>
            <input type="text" name="phone" placeholder="phone">
            <br>
            <input type="text" name="email" placeholder="email">
            <br>
            <input type="text" name="classRoom" placeholder="classRoom">
            <br>
            <p>Bạn có chắc chắn muốn xoá không ?</p>
            <button><p>YES</p></button> | <button><p>NO</p></button>
        </form>
    </div>
</head>
<body>

</body>
</html>

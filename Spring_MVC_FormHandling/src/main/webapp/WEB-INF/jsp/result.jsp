<%--
  Created by IntelliJ IDEA.
  User: garyhu
  Date: 2017/11/17 0017
  Time: 下午 5:42
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>信息表格</title>
    </head>
    <body>
        <h2 align="center">提交的学生信息如下 - </h2>
        <table align="center">
            <tr>
                <td>名称：</td>
                <td>${name}</td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td>${age}</td>
            </tr>
            <tr>
                <td>编号：</td>
                <td>${id}</td>
            </tr>
        </table>
    </body>
</html>

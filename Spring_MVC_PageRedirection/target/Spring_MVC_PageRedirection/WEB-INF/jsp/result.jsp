<%--
  Created by IntelliJ IDEA.
  User: garyhu
  Date: 2017/11/20 0020
  Time: 下午 3:53
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>学生信息</title>
    </head>
    <body>
        <h2 align="center">学生信息展示</h2>
        <p align="center">编号：${id}</p>
        <p align="center">名称：${name}</p>
        <p align="center">年龄：${age}</p>
        <p align="center">是否订阅：${receivePaper}</p>
        <p align="center">性别：${gender}</p>
        <p align="center">喜欢的颜色：${color}</p>
        <p align="center">所在城市：${city}</p>
        <p align="center">技能：${tec}</p>
    </body>
</html>

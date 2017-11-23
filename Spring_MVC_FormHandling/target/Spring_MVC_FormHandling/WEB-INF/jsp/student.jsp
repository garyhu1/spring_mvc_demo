<%--
  Created by IntelliJ IDEA.
  User: garyhu
  Date: 2017/11/17 0017
  Time: 下午 5:37
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>学生信息</title>
    </head>
    <body>
        <h1 align="center">Student Information</h1>
        <form action="/addStudent" method="post" id="SpringWeb">
            <table align="center">
                <tr>
                    <td><label for="stName">名字：</label></td>
                    <td><input name="name" id="stName" /></td>
                </tr>
                <tr>
                    <td><label for="age">年龄：</label></td>
                    <td><input name="age" id="age" /></td>
                </tr>
                <tr>
                    <td><label for="id">编号：</label></td>
                    <td><input name="id" id="id"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="提交表单"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>

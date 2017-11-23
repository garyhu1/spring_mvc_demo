<%--
  Created by IntelliJ IDEA.
  User: garyhu
  Date: 2017/11/20 0020
  Time: 上午 10:30
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>首页</title>
    </head>
    <body>
        <h2>Spring MVC StaticPages</h2>
        <p>点击下方按钮将跳转到一个静态页面</p>
        <form method="get" action="/staticPages">
            <input type="submit" value="获取静态页面">
        </form>
    </body>
</html>

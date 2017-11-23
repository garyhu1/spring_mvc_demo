<%--
  Created by IntelliJ IDEA.
  User: garyhu
  Date: 2017/11/20 0020
  Time: 下午 6:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error {
            color: #ff0000;
        }

        .errorStyle {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
    <h2>添加学生</h2>
    <form action="/addStudent" method="post">
        <table align="center" cellspacing="0" border="1">
            <tr>
                <td>编号： </td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>名称： </td>
                <td><input type="text" name="name"></td>
                <td><input name="name"class="error"/></td>
            </tr>
            <tr>
                <td>年龄： </td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>是否订阅： </td>
                <td><input type="checkbox" name="receivePaper"></td>
            </tr>
            <tr>
                <td>性别： </td>
                <td>
                    <input type="radio" name="gender" value="男"> 男
                    <input type="radio" name="gender" value="女"> 女
                </td>
            </tr>
            <tr>
                <td>喜欢的颜色： </td>
                <td>
                    <input type="radio" name="color" value="赤"> 赤
                    <input type="radio" name="color" value="橙"> 橙
                    <input type="radio" name="color" value="黄"> 黄
                    <input type="radio" name="color" value="绿"> 绿
                    <input type="radio" name="color" value="青"> 青
                    <input type="radio" name="color" value="蓝"> 蓝
                    <input type="radio" name="color" value="紫"> 紫
                </td>
            </tr>
            <tr>
                <td>所在城市</td>
                <td>
                    <select name="city">
                        <option value="北京">北京</option>
                        <option value="上海">上海</option>
                        <option value="广州">广州</option>
                        <option value="天津">天津</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>技能</td>
                <td>
                    <select name="tec" multiple="multiple">
                        <option value="Vue.js">Vue.js</option>
                        <option value="JavaScript">JavaScript</option>
                        <option value="IOS">IOS</option>
                        <option value="Python">Python</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交信息"></td>
            </tr>
        </table>
    </form>
    <form:form method="POST" action="/ErrorHandling/addStudent"
               commandName="student">
        <form:errors path="*" cssClass="errorStyle" element="div" />
        <table>
            <tr>
                <td><form:label path="name">姓名：</form:label></td>
                <td><form:input path="name" /></td>
                <td><form:errors path="name" cssClass="error" /></td>
            </tr>
            <tr>
                <td><form:label path="age">年龄：</form:label></td>
                <td><form:input path="age" /></td>
            </tr>
            <tr>
                <td><form:label path="id">编号：</form:label></td>
                <td><form:input path="id" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交" /></td>
            </tr>
        </table>
    </form:form>
    </body>
</html>

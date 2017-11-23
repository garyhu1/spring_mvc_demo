<%--
  Created by IntelliJ IDEA.
  User: garyhu
  Date: 2017/11/20 0020
  Time: 下午 3:53
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>添加学生</title>
    </head>
    <body>
        <form action="/addStudent" method="post">
            <table align="center" cellspacing="0" border="1">
                <tr>
                    <td>编号： </td>
                    <td><input type="text" name="id"></td>
                </tr>
                <tr>
                    <td>名称： </td>
                    <td><input type="text" name="name"></td>
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
    </body>
</html>

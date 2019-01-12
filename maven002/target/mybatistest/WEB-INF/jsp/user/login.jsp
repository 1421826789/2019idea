<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/27
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录页面</title>
</head>
<body>
用户名：<input type="text" id="username" name="username" ><br>
密码：<input type="password" id="pwd" name="pwd" ><br>
<button id="sub">登录</button>

<script src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script>

    $("#sub").click(function () {
        var username = $("#username").val();
        var  pwd = $("#pwd").val();
        //发送ajax请求
        $.post("${pageContext.request.contextPath}/user/login",{"username":username,"pwd":pwd},function (data) {
            if(data == 0){
                location.href="${pageContext.request.contextPath}/elec/index";
            }else {
                alert("请重新登录")
                location.href="${pageContext.request.contextPath}/user/toLogin";
            }
        });
    })


</script>

</body>
</html>

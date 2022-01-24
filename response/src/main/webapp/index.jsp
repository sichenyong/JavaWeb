<html>
<body>
<h2>Hello World!</h2>

<%--${pageContext.request.getContextPath} 代表当前的项目--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    <div>
        <span>用户名：</span><input type="text" name="username">
    </div>

    <div>
        <span>密码：</span><input type="password" name="password">
    </div>

    <input type="submit" value="登录">
</form>
</body>
</html>

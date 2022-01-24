<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <h1>登录</h1>
    <div>
        <%--
        这里表单表示的方式，以post的方式提交表单到/login
        --%>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div>
                <span>用户名:</span> <input type="text" name="username">
            </div>
            <div>
                <span>密码:</span> <input type="password" name="password" maxlength="10">
            </div>

            <div>
                <span>爱好:</span>
                <input type="checkbox" name="hobby" value="1">唱歌
                <input type="checkbox" name="hobby" value="2">跳舞
                <input type="checkbox" name="hobby" value="3">玩游戏
            </div>

            <input type="submit" value="登录">
        </form>
    </div>
</body>
</html>

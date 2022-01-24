<%--
  Created by IntelliJ IDEA.
  User: 48272
  Date: 2022/1/21
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        System.out.println(request.getSession().getId());
        request.getSession().setAttribute("name","scy");
    %>
</body>
</html>

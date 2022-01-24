<%--
  Created by IntelliJ IDEA.
  User: 48272
  Date: 2022/1/22
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--取参数--%>
    <span>名字：</span><%=request.getParameter("name")%></br>
    <span>年龄：</span><%=request.getParameter("age")%>
</body>
</html>

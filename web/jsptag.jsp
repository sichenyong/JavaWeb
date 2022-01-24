<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%--<jsp:include page=""--%>
  <%--转发的时候可以携带参数--%>
    <jsp:forward page="/jsptag2.jsp">
        <jsp:param name="name" value="sichenyong"/>
        <jsp:param name="age" value="21"/>
    </jsp:forward>
</body>
</html>

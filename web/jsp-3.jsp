<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ include file="common/header.jsp"%>
    <h1>网页主题</h1>
    <%@ include file="common/footer.jsp"%>

    <%--jsp标签
     common要前要加/
    --%>
    <jsp:include page="/common/header.jsp"/>
    <h1>网页主题</h1>
    <jsp:include page="/common/footer.jsp"/>
</body>
</html>

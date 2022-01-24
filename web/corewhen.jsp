<%--引入JSTL核心标签库 我们才能使用--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--定义了一个成绩 87--%>
    <c:set var = "score" value="87"/>

    <%--相当于 Switch--%>
    <c:choose>
        <c:when test="${score >= 90}">
            优秀
        </c:when>
        <c:when test="${score >= 80 && score < 90}">
            良好
        </c:when>
        <c:when test="${score >= 60 && score < 80}">
            及格
        </c:when>
    </c:choose>

</body>
</html>

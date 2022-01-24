<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        ArrayList<String> people = new ArrayList<>();
        people.add(0,"张三a");
        people.add(1,"张三");
        people.add(2,"李四");
        people.add(3,"王五");
        people.add(4,"赵六");
        people.add(5,"田七");
        request.setAttribute("list",people);
    %>

    <%--
    var 每次遍历出来的变量
    items 待遍历的数组
    --%>
    <c:forEach var="people" items="${list}">
        <c:out value="${people}"/> <br>
    </c:forEach>

    <%--
    var 每次遍历出来的变量
    items 待遍历的数组
    begin 开始下标
    end 结束下标
    step 步长
    --%>
    <c:forEach var="people" items="${list}" begin="1" end="3" step="2">
        <c:out value="${people}"/> <br>
    </c:forEach>
</body>
</html>

<%@ page import="com.si.pojo.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <jsp:useBean id="people" class="com.si.pojo.People" scope="page"/>

    <jsp:setProperty name="people" property="name" value="司称勇"/>
    <jsp:setProperty name="people" property="id" value="1"/>
    <jsp:setProperty name="people" property="age" value="12"/>

    姓名：<jsp:getProperty name="people" property="name"/>

<%--等价于下面的写法--%>
<%--<%
    People people1 = new People();
    people1.setAge();
    people1.getAge();
%>--%>
</body>
</html>

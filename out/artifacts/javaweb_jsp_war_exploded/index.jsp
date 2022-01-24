<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--JSP表达式
  用来将程序的输出 输出到客户端
  <%= 变量或者表达式%>
  --%>
  <%= new Date()%>

  <%--JSP脚本片段--%>
  <hr>
  <%
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum += i;
    }
    out.println("<h1>sum = " + sum + "</h1>");
  %>
  <hr>

  <%
    int x = 10;
    out.print(x);
  %>
  <p>这是一个JSP文档</p>
  <%
    int y = 1;
    out.print(y);
  %>
  <hr>

  <%--在代码中嵌入HTML元素--%>
  <%
    for (int i = 0; i < 5; i++) {

  %>
    <h1>Hello world! <%= i%></h1>
  <%
    }
  %>
  <hr>

  </body>
</html>

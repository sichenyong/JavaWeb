
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    /*通过pageContext取 我们通过寻找的方法找
     * 从底层到高层(作用域)找 page > request > session > application (低到高)
     * JVM 双亲委派机制：先从导入包找，再去类加载器找，再去ext.jar包中找
     * */
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5"); //不存在的数据
%>

<%--使用EL表达式输出 ${}--%>
<h1>取出的值为: ${name1}</h1>
<h1>取出的值为: ${name2}</h1>
<h1>取出的值为: ${name3}</h1>
<h1>取出的值为: ${name4}</h1>
<h1>取出的值为: ${name5}</h1>
</body>
</html>

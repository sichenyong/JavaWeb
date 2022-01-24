<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--内置对象--%>
    <%
        pageContext.setAttribute("name1","司称勇1"); //保存的页面 只在一个页面中有效
        request.setAttribute("name2","司称勇2"); //保存的数据只在一次请求中有效
        session.setAttribute("name3","司称勇3"); //保存的数据在一次会话中有效 (从打开浏览器到关闭浏览器 或session到期)
        application.setAttribute("name4","司称勇4"); //保存的数据在服务器中有效，从打开服务器到关闭服务器
    %>
    <%--脚本片段中的代码，会被原封不动的生成_jsp.java
        要求这里的代码必须保证Java语法的正确性
    --%>
    <%
        /*通过pageContext取 我们通过寻找的方法找
        * 从底层到高层(作用域)找
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

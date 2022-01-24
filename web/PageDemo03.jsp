<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
 public void setAttribute (String name,
			    Object attribute,
			    int scope)
  {
    switch (scope) {
    case PAGE_SCOPE: 1
      mPage.put (name, attribute);
      break;
    case REQUEST_SCOPE: 2
      mRequest.put (name, attribute);
      break;
    case SESSION_SCOPE: 2
      mSession.put (name, attribute);
      break;
    case APPLICATION_SCOPE: 3
      mApp.put (name, attribute);
      break;
    default:
      throw new IllegalArgumentException  ("Bad scope " + scope);
    }
  }
--%>

<%

    pageContext.setAttribute("hello","hello",PageContext.SESSION_SCOPE);
    // 等价于 session.setAttribute
%>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: NewOrin Zhang
  Date: 2016/7/5
  Email: NewOrinZhang@Gmail.com
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>结果页面</title>
</head>
<body>
<%--User表:--%>
<%--<c:forEach items="${userList}" var="user">--%>
<%--姓名:${user.uname}--%>
<%--密码:${user.upwd}<br>--%>
<%--</c:forEach>--%>
<%--<h2>Role表</h2>--%>
<%--<c:forEach items="${roleList}" var="role">--%>
<%--id:${role.rid}--%>
<%--name:${role.rname}<br>--%>
<%--</c:forEach>--%>

<h2>Certi表</h2>
<c:forEach items="${certiList}" var="certi">
    id:${certi.cid}
    cnum:${certi.cnum}
    address:${certi.address}<br>
</c:forEach>
</body>
</html>

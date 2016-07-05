<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<body>
<h3><a href="/user/findAll">查询User表数据</a></h3>
<h3><a href="/role/findAll">查询Role表数据</a></h3>
<h3><a href="/certi/findAll">查询Certi表数据</a></h3>
</body>
</html>

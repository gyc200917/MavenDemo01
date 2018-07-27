<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="add.jsp">添加</a>
<table border="1" align="center" width="1000" cellspacing="0">
<tr>
<td>开发商名称</td>
<td>公司地址</td>
<td>法人代表</td>
<td>公司联系方式</td>
<td>公司创建时间</td>
</tr>
<c:forEach items="${allDeveloperCompany }" var="a">
<tr>
<td>${a.companyname}</td>
<td>${a.companyaddress}</td>
<td>${a.corporation}</td>
<td>${a.companytel}</td>
<td>${a.createddate}</td>
</tr>
<tr>
<td colspan="5">
<table border="1" align="center" width="1000" cellspacing="0">
<tr>
<td>工程名称</td>
<td>工程地址</td>
<td>工程开始时间</td>
<td>工程结束时间</td>
<td>项目负责人</td>
<td>验收标志</td>
</tr>
<c:forEach items="${a.projects}" var="p">
<tr>
<td>${p.proname }</td>
<td>${p.proaddress }</td>
<td>${p.begindate }</td>
<td>${p.enddate }</td>
<td>${p.principal }</td>
<td>${p.ischeck }</td>
</tr>
</c:forEach>
</table>
</td>
</tr>
</c:forEach>
</table>


</body>
</html>
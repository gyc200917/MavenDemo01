<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addCompany.gyc" method="post">
	<table align="center" border="1">
	<tr><Td>添加开发商基本信息</Td></tr>
	<tr><td>开发商名:<input type="text" name="companyname"></td></tr>
	<tr><td> 公司地址:<input type="text" name="companyaddress"></td></tr>
	<tr><td> 法人代表 :<input type="text" name="corporation"></td></tr>
	<tr><td> 公司电话 :<input type="text" name="companytel"></td></tr>
	<tr><td> 公司时间 :<input type="text" name="createddate"></td></tr>
	<tr><Td>添加工程基本信息</Td></tr>
	<tr><td> 工程名称:<input type="text" name="proname"></td></tr>
	<tr><td>工程地址:<input type="text" name="proaddress"></td></tr>
	<tr><td>开始时间:<input type="text" name="begindate"></td></tr>
	<tr><td>结束时间:<input type="text" name="enddate"></td></tr>
	<tr><td>项目负责人:<input type="text" name="principal"></td></tr>
	<tr><td>验收标志:<select name="ischeck">
		  		<option value="验收通过">验收通过</option>
		  		<option value="等待验收">等待验收</option>
		  </select></td></tr>
	<tr><td><input type="submit" value="提交"></td></tr>
	</table>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!--  
	<form method="post" action="${pageContext.request.contextPath }/users/doAddUsers.action">
		编号：<input type="text" name="users.id" value="${users.id }"/><br />
		姓名：<input type="text" name="users.uname" value="${users.uname }"/><br />
		密码：<input type="text" name="users.upass"/><br />
		年龄：<input type="text" name="users.uage"/><br />
		性别：<input type="text" name="users.usex"/><br />
		生日：<input type="text" name="users.ubirth"/><br />
		商品：<input type="text" name="goods.uname"/><br />
		<input type="submit"> 
	</form>
	-->
	
	
	
	<form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath }/users/doAddUsers.action">
		编号：<input type="text" name="id" value="${users.id }"/><br />
		姓名：<input type="text" name="uname" value="${users.uname }"/><br />
		密码：<input type="text" name="upass"/><br />
		年龄：<input type="text" name="uage"/><br />
		性别：<input type="text" name="usex"/><br />
		生日：<input type="text" name="ubirth"/><br />
		头像：<input type="file" name="imgFile"/><br />
		<input type="submit"> 
	</form>
</body>
</html>
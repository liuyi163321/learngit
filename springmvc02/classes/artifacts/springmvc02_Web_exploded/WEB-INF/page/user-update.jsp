<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/users/doUpdateUsers.action" method="post">
		编号：<input type="text" value="${u.id }" name="id"/><br />
		姓名：<input type="text" value="${u.uname }" name="uname"/><br />
		<input type="submit" />
	</form>
</body>
</html>
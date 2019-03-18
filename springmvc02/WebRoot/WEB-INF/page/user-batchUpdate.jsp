<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/users/doBatchUpdateUsers.action" method="post">
	<table>
		<tr>
		  <th>编号</th>
   	 	  <th>姓名</th>
   	 	  <th>密码</th>
   	 	  <th>生日</th>
		</tr>kkk
		<c:forEach items="${list }" var="u" varStatus="i">
			<tr>
				<td><input type="text" name="userList[${i.index }].id" value="${u.id }"  readonly="readonly"></td>
				<td><input type="text" name="userList[${i.index }].uname" value="${u.uname }" ></td>
				<td><input type="text" name="userList[${i.index }].upass" value="${u.upass }" ></td>
				<td><input type="text" name="userList[${i.index }].ubirth" value="<fmt:formatDate value='${u.ubirth }' pattern='yyyy-MM-dd'/>" ></td>
			</tr>
			
		</c:forEach>
		<tr>
			<td colspan="4"><input type="submit" /></td>
		</tr>
	</table>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onBatchDelete(){
		if(confirm("确定删除吗?")){
			var myform = document.getElementById("myform");
			myform.action = "${pageContext.request.contextPath }/users/doBatchDeleteUsers.action";
			myform.submit();
		}
	}
	
	function onBatchUpdate(){
		var myform = document.getElementById("myform");
		myform.action = "${pageContext.request.contextPath }/users/toBatchUpdateUsers.action";
		myform.submit();
		
	}
</script>
</head>
<body>

   <a href="${pageContext.request.contextPath }/users/toAddUsers.action">增加</a><br />
   <a href="javascript:void(0)" onclick="onBatchDelete()" >批量删除</a>
   <a href="javascript:void(0)" onclick="onBatchUpdate()" >批量修改</a>
   <br />
   
   <form id="myform" action="${pageContext.request.contextPath }/users/findAllUsers.action" method="post">
   <table border="1">
   	 <tr> 
   	    <th><input type="checkbox"></th>
   	 	<th>编号</th>
   	 	<th>姓名</th>
   	 	<th>密码</th>
   	 	<th>性别</th>
   	 	<th>年龄</th>
   	 	<th>生日</th>
   	 	<th>操作</th>
   	 </tr>
   	 <c:forEach items="${list }" var="u">
   	   <tr>
   	   	 <td><input type="checkbox" name="ids" value="${u.id }"/></td>
   	   	 <td>${u.id }</td>
   	   	 <td>${u.uname }</td>
   	   	 <td>${u.upass }</td>
   	   	 <td>${u.usex }</td>
   	   	 <td>${u.uage }</td>
   	   	 <td><fmt:formatDate value="${u.ubirth }" pattern="yyyy-MM-dd"/></td>
   	   	 <td><a href="${pageContext.request.contextPath }/users/toUpdateUsers.action?id=${u.id}">修改</a></td>
   	   </tr>
    </c:forEach>
   </table>
   
   </form>
</body>
</html>
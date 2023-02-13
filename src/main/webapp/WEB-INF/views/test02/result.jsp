<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과</h2>
	<h2>${result}</h2>
	<h2>${cPage}</h2>
	<h2>
		<c:forEach var="k" items="${hobby}">
			<li>${k}</li>
		</c:forEach>
	</h2>
	<hr>
	<h2>그림보기</h2>
	<img src="/resources/images/푸린.png" style="width: 100px;"><br>
	<img src="resources/images/푸린.png" style="width: 100px;"><br>
	<img src='<c:url value="/resources/images/푸린.png"/>' style="width: 100px;"><br>
	<img src='<c:url value="resources/images/푸린.png"/>' style="width: 100px;"><br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과 보기</h2>
	<h3>
		<ul>
			<li>올린사람 : ${name}</li>
			<li>파일 저장 이름 : ${f_name}</li>
			<li>파일 원본 이름 : ${f_name2}</li>
			<li>파일 타입 : ${file_type}</li>
			<li>파일 크기 : <fmt:formatNumber type="number" pattern="#,###" value="${size}" />KB
			</li>
			<li>마지막 수정 날짜 : ${lastday}</li>
			<li>다운로드 : <a href="down.do?f_name=${f_name}"><img src="resources/images/${f_name}"></a></li>
		</ul>
	</h3>
</body>
</html>
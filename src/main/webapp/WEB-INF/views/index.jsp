<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send_go(f) {
		f.action="test02/calc.do";
		f.submit();
	}
	
	function f_up(f) {
		f.action="f_up.do";
		f.submit();
	}
</script>
</head>
<body>
	<a href="test01/hello.do">인사박기</a>
	<hr>
	<form action="test02/calc.do" method="post">
		<fieldset style="width:295px">
			<legend>초간단 개쩌는 계산기1</legend>
				숫자1 : <input type="number" name="s1" required autofocus/><br>
				숫자2 : <input type="number" name="s2" required /><br>
				연산자 : <input type="radio" name="op" value="+" checked> +
				<input type="radio" name="op" value="-" > -
				<input type="radio" name="op" value="*"> *
				<input type="radio" name="op" value="/"> /<br><br>
				<p>
					취미 : <input type="checkbox" name="hobby" value="축구"> 축구
					<input type="checkbox" name="hobby" value="야구"> 야구
					<input type="checkbox" name="hobby" value="농구"> 농구
					<input type="checkbox" name="hobby" value="배구"> 배구
				</p>
				<button type="submit"><span>결과</span></button>
		</fieldset>	
	</form>
	<hr>
	<form method="post">
		<fieldset style="width:295px">
			<legend>초간단 개쩌는 계산기2</legend>
				숫자1 : <input type="number" name="s1" required autofocus/><br>
				숫자2 : <input type="number" name="s2" required /><br>
				연산자 : <input type="radio" name="op" value="+" checked> +
				<input type="radio" name="op" value="-" > -
				<input type="radio" name="op" value="*"> *
				<input type="radio" name="op" value="/"> /<br><br>
				<p>
					취미 : <input type="checkbox" name="hobby" value="축구"> 축구
					<input type="checkbox" name="hobby" value="야구"> 야구
					<input type="checkbox" name="hobby" value="농구"> 농구
					<input type="checkbox" name="hobby" value="배구"> 배구
				</p>
				<input type="hidden" name="cPage" value="2">
				<input type="button" value="결과보기" onclick="send_go(this.form)">
		</fieldset>	
	</form>
	<hr>
	<h2>그림보기</h2>
	<img src="/resources/images/푸린.png" style="width: 100px;"><br>
	<img src="resources/images/푸린.png" style="width: 100px;"><br>
	<img src='<c:url value="/resources/images/푸린.png"/>' style="width: 100px;"><br>
	<img src='<c:url value="resources/images/푸린.png"/>' style="width: 100px;"><br>
	<hr>
	<form action="f_up.do" method="post" enctype="multipart/form-data">
		<p> 올린사람 : <input type="text" name="name"></p>
		<p> 파일 : <input type="file" name="f_name"></p>
		<p><input type="submit" value="업로드">
	</form>
	<hr>
	<form method="post" enctype="multipart/form-data">
		<p> 올린사람 : <input type="text" name="name"></p>
		<p> 파일 : <input type="file" name="f_name"></p>
		<p><input type="button" value="업로드" onclick="f_up(this.form)">
	</form>
</body>
</html>
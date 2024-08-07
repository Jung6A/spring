<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>도서 정보 입력</h2>
	<form method="get" action="/detail">
		<label>제목</label>
		<input type="text" name="title">
		<br>
		<label>저자</label>
		<input type="text" name="author">
		<br>
		<label>출판사</label>
		<input type="text" name="publishing">
		<br>
		<button>입력</button>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>잔액 입력</h2>
	<div>
		<form method="post" action="/result">
			은행명: <input type="text" name="bankName"><br>
			잔액: <input type="number" name="bankBalance"><br>
			<button>입력</button>
		</form>
	</div>
</body>
</html>
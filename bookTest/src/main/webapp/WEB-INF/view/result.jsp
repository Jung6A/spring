<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>잔액 확인</h2>
	<div>
		<div>${bank.getBankName}</div>
		<div>잔액: ${bank.getBankBalance()}원</div>
	</div>
</body>
</html>
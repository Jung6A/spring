<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 열람</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="/css/info.css">
<script src="/javascript/info.js"></script>
<script>
	inputType=["text","text","text","number","number"];
	inputName=["bookTitle","bookAuthor","publisher","bookPage","bookPrice"];
</script>
</head>
<body>
	<form id="fm" method="get" action="/book/delete">
		<input type="hidden" name="id" value="${book.bookId}">
		<div id="wrap">
			<div id="aWrap">
				<a href="/">HOME</a>
			</div>
			<table id="viewBox">
				<tr>
					<td class="fieldName">책 제목</td>
					<td class="value">${book.bookTitle}</td>
				</tr>
				<tr>
					<td class="fieldName">저자</td>
					<td class="value">${book.bookAuthor}</td>
				</tr>
				<tr>
					<td class="fieldName">출판사</td>
					<td class="value">${book.publisher}</td>
				</tr>
				<tr>
					<td class="fieldName">페이지</td>
					<td class="value">
						<fmt:formatNumber value="${book.bookPage}" pattern="#,###"/>
					</td>
				</tr>
				<tr>
					<td class="fieldName noborder">가격</td>
					<td class="value noborder">
						<fmt:formatNumber value="${book.bookPrice}" type="currency"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="button" id="modify">수정</button>
						<button type="button" id="del">삭제</button>
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>
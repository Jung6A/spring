<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 관리</title>
<link rel="stylesheet" href="/css/default.css">
</head>
<body>
	<div id="wrap">
		<h2>도서 관리 프로그램</h2>
		<div id="mainTitle">
			<h3>등록 도서 목록</h3>
			<a href="/bookWrite" id="enroll">도서 등록</a>
		</div>
		<div id="bookListWarp">
			<ul id="bookList">
				<c:forEach var="row" items="${list}">
					<li class="blist">
						<span class="title"><a href="/book/view?id=${row.bookId}">${row.bookTitle}</a></span>
						<span class="auth">${row.bookAuthor}</span>
						<span class="bookCode">${row.bookId}</span>
						<span class="category">${row.publisher}</span>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페 관리</title>
<link rel="stylesheet" href="/css/default.css">
</head>
<body>
	<div id="wrap">
		<h2>카페 메뉴 관리 프로그램</h2>
		<div id="mainTitle">
			<h3>등록 메뉴 목록</h3>
			<a href="/coffeeReg" id="enroll">메뉴 등록</a>
		</div>
		<div id="bookListWarp">
			<ul id="bookList">
				<c:forEach var="row" items="${list}">
					<li class="blist">
						<span class="name">${row.itemName}</span>
						<span class="price">${row.price}원</span>
						<span class="decaffein">
							${row.decaffein ? '디카페인 있음' : '디카페인 없음'}
						</span>
					</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</body>
</html>
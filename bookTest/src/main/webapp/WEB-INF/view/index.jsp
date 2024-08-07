<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<li class="blist">
					<span class="title">자바의 기초</span>
					<span class="auth">홍길동</span>
					<span class="bookCode">ㅈc03홍20934</span>
					<span class="category">컴퓨터 프로그램 언어</span>
				</li>
				<li class="blist">
					<span class="title">안드로이드 SDK</span>
					<span class="auth">김유신</span>
					<span class="bookCode">ㅇs03김23181</span>
					<span class="category">컴퓨터 운영체제</span>
				</li>
				<li class="blist">
					<span class="title">C언어 도장깨기</span>
					<span class="auth">좌청룡</span>
					<span class="bookCode">ㅆd03좌16262</span>
					<span class="category">컴퓨터 프로그램 언어</span>
				</li>
				<li class="blist">
					<span class="title">나는 누구인가</span>
					<span class="auth">일연</span>
					<span class="bookCode">ㄴn01일22345</span>
					<span class="category">철학</span>
				</li>
				<li class="blist">
					<span class="title">카카오는 왜 노란색인가</span>
					<span class="auth">카카오안티</span>
					<span class="bookCode">ㅋk06카77223</span>
					<span class="category">미술</span>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보 작성</title>
<link rel="stylesheet" href="/css/write.css">
</head>
<body>
	<div id="wrap">
		<div id="home"><a href="/">HOME</a></div>
		<h3 id="enrollCount">${count}권 등록 완료</h3>
		<form method="post" action="/enroll">
			<div id="formWrap">
				<div class="inputField">
					<label for="bookTitle">책 제목</label>
					<input type="text" name="bookTitle" id="bookTitle">
				</div>
				<div class="inputField">
					<label for="bookAuthor">저자</label>
					<input type="text" name="bookAuthor" id="bookAuthor">
				</div>
				<div class="inputField">
					<label for="bookPrice">가격</label>
					<input type="number" name="bookPrice" id="bookPrice">
				</div>
				<div class="inputField">
					<label for="bookPage">페이지</label>
					<input type="number" name="bookPage" id="bookPage">
				</div>
				<div class="inputField">
					<label for="publisher">출판사</label>
					<input type="text" name="publisher" id="publisher">
				</div>
				<button id="bt">등록</button>
			</div>
		</form>
	</div>
</body>
</html>
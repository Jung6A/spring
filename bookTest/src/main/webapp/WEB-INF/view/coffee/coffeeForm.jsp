<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴 정보 작성</title>
<link rel="stylesheet" href="/css/coffee.css">
</head>
<body>
	<div id="wrap">
		<div id="home"><a href="/coffee">HOME</a></div>
		<form method="post" action="/coffeeInsert">
			<div id="formWrap">
				<div class="inputField">
					<label for="itemName">메뉴 이름</label>
					<input type="text" name="itemName" id="itemName">
				</div>
				<div class="inputField">
					<label for="price">가격</label>
					<input type="number" name="price" id="price">
				</div>
				<div class="inputField2">
					<div id="decaffLabel">디카페인 여부</div>
					<div id="radioSelect">
						<div>
							<input type="radio" name="decaffein" id="decaffeinT" value="true"> <label for="decaffeinT">디카페인</label>
						</div>
						<div>
							<input type="radio" name="decaffein" id="decaffeinF" value="false"> <label for="decaffeinF">해당 없음</label>
						</div>
					</div>
				</div>
				<button id="bt">등록</button>
			</div>
		</form>
	</div>
</body>
</html>
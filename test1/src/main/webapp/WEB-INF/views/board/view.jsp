<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 열람</title>
</head>
<body>
	
	<a href="/board">목록으로</a>
	<h2>게시글 열람</h2>
	<div>
		<div>
			<span>제목: ${data.getTitle()}</span>
			<span>작성자: ${data.getWriter()}</span>
		</div>
		<div>
			${data.getContent()}
		</div>
	</div>
	
	<!-- 
	동작 내용
	글쓰기를 클릭하여 게시글 작성 페이지로 이동하고 작성 버튼을 클릭하면 게시글보기 페이지로 이동하여 작성한 내용 출력
	
	각 페이지 이동하기 위한 매핑과 뷰 페이지에 데이터 출력 방법을 작성하여 정상적으로 동작할 수 있게 하기
	 -->
	
</body>
</html>
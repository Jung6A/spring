/**
 * 
 */
let inputType=[];
let inputName=[];

$(function() { //window.onload
	$("#del").on("click", function() {
		var isOk=confirm("정말로 삭제하시겠습니까?");
		if(isOk) {
			$("#fm").submit();
		}
	});
	
	$("#modify").on("click", function() {
		$.each($(".value"), function(i,v) { //i: index  v: index-value
			var text=$(v).text().trim();
			if(inputType[i]==="number") {
				text=text.replace(/[^0-9]/g,""); //천 단위 , 표시 제거
			}
			$(v).html("<input type='"+inputType[i]+"' name='"+inputName[i]+"' value='"+text+"'>");
			
		}); //클래스명이 value인 td 내부 설정
		
		$(this).attr("id","mod");
		var url=$("#fm").attr("action"); //form 태그 action값 가져오기
		url=url.replace("delete","update") //주소 변경
		//주소 :/book/update 혹은 /coffee/update로 변경
		$("#fm").attr("action",url);
		
		$(this).off("click");
		$("#mod").on("click", function() { $("#fm").submit(); });
	});
	
	
});
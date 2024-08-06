package com.example.test1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test1.DTO.LoginDTO;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController {

//JSP MVC 패턴 주소 맵핑 
//주소 패턴과 서블릿 클래스 연결(web.xml)
//주소 패턴이 다양하면 서블렛 클래스 갯수도 늘어남
//주소 요청을 처리할 메서드 지정을 위해 Map, properties 같은 주소와 메서드를 1:1 지정하여 처리하기 위한 객체 또는 파일이 필요
//어떤 주소 요청인지 파악하기 위한 코드와 실행 코드도 작성
	
//스프링에서의 주소 맵핑(요청주소와 처리내용을 연결하는 작 )
//@Controller 클래스에 지정 
//요청방식에 따른 주소 맵핑  -> @GetMapping("/")
//요청 주소를 처리할 메서드 정의와 반환값으로 보여줄 페이지 이름
	
	@GetMapping("/")
	public ModelAndView home() {
		String title="이번 여름 바다는 다녀오셨습니까?";
		ModelAndView mv=new ModelAndView("index"); //ModelAndView의 객체를 생성하며 뷰 페이지 입력
		
		mv.addObject("pageTitle", title);
		return mv;
	}
	
	@GetMapping("/test")
	public String testFirst() {
		return "test";
	}
	
	@GetMapping("/aaa.g")
	public String testTwo() {
		return "login";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "member/signup";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute LoginDTO logindto) {
		System.out.println(logindto.getId());
		
		return "loginResult";
	}
	
	//form 데이터 받아오기 실습
	//내용: 로그인을 위해 로그인 페이지에서 아이디와 비밀번호 입력하고 로그인 버튼 클릭
	//DTO 클래스: LoginDTO
	//뷰 페이지: login.jsp- 로그인 form 페이지
	//		   loginResult.jsp- 로그인 후 보여줄 페이지
	//		loginResult.jsp에 <a href="/test">페이지 이동</a> 넣기
	//요청 주소 및 방식: 로그인 페이지- GET 방식, /login
	//				 로그인 처리- POST 방식, /login
	
	
//	//form 데이터 받아오는 방법 3
//	//범용성이 있지만 데이터베이스 저장은 번거로움
//	@PostMapping("/signup")
//	public String signupSave(@RequestParam Map<String, String> pm) {
//		
//		System.out.println("세 번째 방법: "+pm.get("id"));
//		
//		return "member/signup";
//	}
	
	
//	//form 데이터 받아오는 방법 2
//	//범용성이 적지만 데이터베이스 저장이 가장 간단함
//	@PostMapping("/signup")
//	public String signupSave(@ModelAttribute MemberDTO memberdto) {
//
//		System.out.println("두 번째 방법: "+memberdto.getId());
//		
//		return "member/signup";
//	}
	
	
//  //form 데이터 받아오는 방법 1	
//	@PostMapping("/signup")
//	public String signUpSave(@RequestParam("id") String id,
//			@RequestParam("pw") String pw, @RequestParam("tel") String tel,
//			@RequestParam("birth") String birth) {
//		
//		System.out.println(id);
//		
//		return "member/signUp";
//	}
	
	
	
	
	//주소 요청: /signUp 
	//뷰 페이지: member/signUp.jsp
	//뷰 페이지 내용: 아이디, 비밀번호, 연락처, 생년월일 입력	
}

//자바 빈: 1. 클래스의 인스턴스 변수는 input의 name과 일치 
//		 2. 클래스의 기본 생성자 메서드 필요
//		 3. 인스턴스 변수의 get, set 메서드 필요
//		 4. 인스턴스 변수의 제어자는 private
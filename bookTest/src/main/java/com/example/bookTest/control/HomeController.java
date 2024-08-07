package com.example.bookTest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.BankDTO;
import com.example.bookTest.DTO.BookInfoDTO;
import com.example.bookTest.DTO.InfoDTO;

@Controller
public class HomeController {
	
	//요청 주소와 메서드를 매핑(연결) 시켜줌
	@GetMapping("/home")
	public String homeView() { //뷰 페이지만 제공하는 경우에는 페이지 이름만 넘김
		return "home";
	}
	
	@GetMapping("/infoInput")
	public ModelAndView info(@ModelAttribute InfoDTO infodto) {
//		System.out.println(infodto.getUName());
		//ModelAndView는 사용자에게 제공할 페이지의 데이터를 저장할 수 있는 클래스
		//사용자에게 제공할 페이지는 객체 생성시 입력하거나 setViewName 메서드로 입력
		ModelAndView mv=new ModelAndView("info");
		//mv.setViewName("info")  메서드로 제공 페이지 입력
		
		String byear=infodto.getUBirth().substring(0,4);
		int age=2024-(Integer.parseInt(byear));
		mv.addObject("ageData",age); //뷰 페이지에 전달할 데이터 설정
		return mv;
	}
	
	@GetMapping("/write")
	public String WriteView() {
		return "bookWrite";
	}
	
	@GetMapping("/detail")
	public ModelAndView DetailView(@ModelAttribute BookInfoDTO bookinfodto) {
		ModelAndView mv=new ModelAndView("bookDetail");
		
		mv.addObject("book",bookinfodto);
		
		return mv;
	}
	
	@GetMapping("/input")
	public String BankView() {
		return "bank";
	}
	
	@PostMapping("/result")
	public ModelAndView resultView(@ModelAttribute BankDTO bankdto) {
		ModelAndView mv=new ModelAndView("result");
		
		mv.addObject("bank",bankdto);
		
		return mv;
	}
	
}

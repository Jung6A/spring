package com.example.bookTest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.BookDTO;
import com.example.bookTest.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("index");
		
		List<BookDTO> list=bookService.selectAll();
		mv.addObject("list",list);
		
		return mv;
	}
	
	@GetMapping("/bookWrite")
	public ModelAndView write() {
		ModelAndView mv=new ModelAndView("book/bookForm");
		mv.addObject("count", 5);
		return mv;
	}
	
	@PostMapping("/enroll")
	public String write(@ModelAttribute BookDTO bookdto) {
		//form 태그 안에 입력한 값은 BookDTO 클래스의 객체에 저장되어 있음
		//데이터베이스에 저장하려면 BookDTO객체를 DAO에 넘겨서 저장
		//control → service → DAO
		bookService.bookSave(bookdto);
		
		return "redirect:/";
	}

}

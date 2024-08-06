package com.example.test1.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.test1.DTO.BoardDTO;

@Controller
public class BoardController {
	
	@GetMapping("/board")
	public ModelAndView boardHome() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("board/boardList");
		
		return mav;
	}
	
	@GetMapping("/boardWrite")
	public String write() {
		return("board/write");
	}
	
	@PostMapping("/write")
	public ModelAndView boardWrite(@ModelAttribute BoardDTO boarddto) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("board/view");
		
		mav.addObject("data",boarddto);
		return mav;
	}
	
}

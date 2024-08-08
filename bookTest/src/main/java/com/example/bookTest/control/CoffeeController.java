package com.example.bookTest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.CoffeeDTO;
import com.example.bookTest.service.CoffeeService;

@Controller
public class CoffeeController {
	@Autowired
	private CoffeeService coffeeService;
	
	@GetMapping("/coffee")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("/coffee/index");
		
		List<CoffeeDTO> list=coffeeService.selectAll();
		mv.addObject("list",list);
		
		return mv;
		
	}
	
	@GetMapping("/coffeeReg")
	public String coffeeReg() {
		return "coffee/coffeeForm";
	}
	
	@PostMapping("/coffeeInsert")
	public String write(@ModelAttribute CoffeeDTO coffeedto) {
		coffeeService.coffeeSave(coffeedto);
		
		return "redirect:/coffee";
	}
}

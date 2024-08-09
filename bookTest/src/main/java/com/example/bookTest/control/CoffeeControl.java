package com.example.bookTest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.bookTest.DTO.CoffeeDTO;
import com.example.bookTest.service.CoffeeService;

@Controller
public class CoffeeControl {
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
	
	@GetMapping("/coffeeView")
	public ModelAndView view(@RequestParam(value="id", required=false, defaultValue="0") int id) {
		CoffeeDTO data=coffeeService.getCoffee(id);
		
		if(data==null) {
			data=new CoffeeDTO();
		}
		return new ModelAndView("coffee/view").addObject("coffee", data);
	}
	
	@GetMapping("coffee/delete")
	public String coffeeRemove(@RequestParam("id") int cid) {
		coffeeService.remove(cid);
		
		return "redirect:/coffee";
	}
	
	@GetMapping("coffee/update")
	public String coffeeUpdate(@ModelAttribute CoffeeDTO coffeedto, @RequestParam("id") int id) {
		coffeedto.setCoffeeId(id);
		coffeeService.update(coffeedto);
		
		return "redirect:/coffee/view?id="+id;
	}
}

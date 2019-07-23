package com.dipen.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView homepage(@RequestParam("name") String userName) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", userName);
		mv.setViewName("home");
		
		return mv;
	}
	
	
	@RequestMapping("profile")
	public ModelAndView profilePage(Student st) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", st);
		mv.setViewName("profile");
		return mv;
	}
}
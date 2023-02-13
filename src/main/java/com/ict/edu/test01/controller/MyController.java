package com.ict.edu.test01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.edu.test01.model.MyService;

@Controller
public class MyController {
	@Autowired
	private MyService myService;

	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
	@GetMapping("test01/hello.do")
	public ModelAndView getService() {
		ModelAndView mv = new ModelAndView("test01/result");
		String msg = myService.getGreeting();
		mv.addObject("msg", msg);
		
		return mv;
	}
}

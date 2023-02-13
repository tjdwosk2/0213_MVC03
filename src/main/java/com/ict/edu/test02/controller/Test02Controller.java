package com.ict.edu.test02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.edu.test02.model.Test02Model;
import com.ict.edu.test02.vo.VO;

@Controller
public class Test02Controller {
	@Autowired
	private Test02Model test02Model;

	public void setTest02Model(Test02Model test02Model) {
		this.test02Model = test02Model;
	}
	
//	@PostMapping("test02/calc.do")
//	public ModelAndView getS(HttpServletRequest request) {
//		ModelAndView mv = new ModelAndView("test02/result");
//		String cPage = request.getParameter("cPage");
//		String[] hobby = request.getParameterValues("hobby");
//		
//		int result = test02Model.getCalc(request);
//		
//		mv.addObject("result", result);
//		mv.addObject("cPage", cPage);
//		mv.addObject("hobby", hobby);
//		
//		return mv;
//	}
	
//	@PostMapping("test02/calc.do")
//	public ModelAndView getS(VO vo) {
//		ModelAndView mv = new ModelAndView("test02/result");
//		String cPage = vo.getcPage();
//		String[] hobby = vo.getHobby();
//		
//		int result = test02Model.getCalc(vo);
//		
//		mv.addObject("result", result);
//		mv.addObject("cPage", cPage);
//		mv.addObject("hobby", hobby);
//		
//		return mv;
//	}
	
	// @ModelAttribute("vo")VO vo -> modelAttribute("vo", vo)
	@PostMapping("test02/calc.do")
	public ModelAndView getS(@ModelAttribute("vo")VO vo) {
		ModelAndView mv = new ModelAndView("test02/result");
		String cPage = vo.getcPage();
		String[] hobby = vo.getHobby();
		
		int result = test02Model.getCalc(vo);
		
		mv.addObject("result", result);
		mv.addObject("cPage", cPage);
		mv.addObject("hobby", hobby);
		
		return mv;
	}
}

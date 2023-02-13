package com.ict.edu.test02.model;

import org.springframework.stereotype.Service;

import com.ict.edu.test02.vo.VO;

@Service
public class Test02Model {
	
//	public int getCalc(HttpServletRequest request) {
//		String op = request.getParameter("op");;
//		int s1 = Integer.parseInt(request.getParameter("s1"));
//		int s2 = Integer.parseInt(request.getParameter("s2"));
//		int result = 0;
//		
//		switch (op) {
//		case "+": result = s1 + s2; break;
//		case "-": result = s1 - s2; break;
//		case "*": result = s1 * s2; break;
//		case "/": result = s1 / s2; break;
//		}
//		return result;
//	}
	
	public int getCalc(VO vo) {
		String op = vo.getOp();
		int s1 = Integer.parseInt(vo.getS1());
		int s2 = Integer.parseInt(vo.getS2());
		int result = 0;
		
		switch (op) {
		case "+": result = s1 + s2; break;
		case "-": result = s1 - s2; break;
		case "*": result = s1 * s2; break;
		case "/": result = s1 / s2; break;
		}
		return result;
	}
}

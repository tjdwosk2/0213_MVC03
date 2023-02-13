package com.ict.edu.test01.model;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	public MyService() {
		System.out.println("MyService 생성자");
	}
	
	// 실행하고자 하는 메서드
	// 현재 시간 구하기
	public String getGreeting() {
		String str = "";
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >= 7 && hour <= 8 ) {
			str = "좋은 아침";
		}else if(hour >= 12 && hour <= 14 ) {
			str = "좋은 점심";
		}else if(hour >= 22 && hour <= 24 ) {
			str = "좋은 저녁";
		}
		return str;
	}
}

package com.ict.edu.test01.model;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	public MyService() {
		System.out.println("MyService ������");
	}
	
	// �����ϰ��� �ϴ� �޼���
	// ���� �ð� ���ϱ�
	public String getGreeting() {
		String str = "";
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour >= 7 && hour <= 8 ) {
			str = "���� ��ħ";
		}else if(hour >= 12 && hour <= 14 ) {
			str = "���� ����";
		}else if(hour >= 22 && hour <= 24 ) {
			str = "���� ����";
		}
		return str;
	}
}

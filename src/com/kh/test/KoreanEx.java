package com.kh.test;

public class KoreanEx {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("김자바" ,"920806-2222222");
		System.out.println("이름 : " + k1.name);
		System.out.println("주민등록번호 : " + k1.ssn);
		
		Korean k2 = new Korean("박자바", "930000-2222222");
		System.out.println("이름 : " + k2.name);
		System.out.println("주민등록번호 : " + k2.ssn);
	}

}

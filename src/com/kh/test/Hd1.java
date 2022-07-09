package com.kh.test;

public class Hd1 {
	public static void main(String[] args) {
		
		HD car = new HD();
		
		System.out.println("회사 : " + car.company);
		System.out.println();
		
		HD car1 = new HD("자가용");
		System.out.println("모델 : " + car1.model);
		System.out.println();
		
		HD car2 = new HD("자가용", "빨강");
		System.out.println("모델 : " + car2.model);
		System.out.println("컬러 : " + car2.color);
		System.out.println();
		
		HD car3 = new HD("자가용", "검정", 300);
		System.out.println("모델 : " + car3.model);
		System.out.println("컬러 : " + car3.color);
		System.out.println("컬러 : " + car3.maxSpeed);
		
		
	}
	
}

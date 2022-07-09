package com.kh.test;

public class CalculatorEx {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result1 = cal.plus(6, 5);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		cal.powerOff();
	}
}
package com.kh.test;

public class Calculator {

	void powerOn() { // 리턴값을 반환할 게 없는 메소드
		System.out.println("전원을 켭니다");

	}

	int plus( int x, int y) { // 리턴값이 있는 메소드
		int result = x + y;
		return result;
	}

	double divide(int x , int y) {
		double result = (double)x / (double)y;
		return result;
	}

	void powerOff() {
		System.out.println("전원을 끕니다");
	}

}




package com.kh.test;

public class Calculator {

	void powerOn() { // ���ϰ��� ��ȯ�� �� ���� �޼ҵ�
		System.out.println("������ �մϴ�");

	}

	int plus( int x, int y) { // ���ϰ��� �ִ� �޼ҵ�
		int result = x + y;
		return result;
	}

	double divide(int x , int y) {
		double result = (double)x / (double)y;
		return result;
	}

	void powerOff() {
		System.out.println("������ ���ϴ�");
	}

}




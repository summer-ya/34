package com.kh.test;

public class Hd1 {
	public static void main(String[] args) {
		
		HD car = new HD();
		
		System.out.println("ȸ�� : " + car.company);
		System.out.println();
		
		HD car1 = new HD("�ڰ���");
		System.out.println("�� : " + car1.model);
		System.out.println();
		
		HD car2 = new HD("�ڰ���", "����");
		System.out.println("�� : " + car2.model);
		System.out.println("�÷� : " + car2.color);
		System.out.println();
		
		HD car3 = new HD("�ڰ���", "����", 300);
		System.out.println("�� : " + car3.model);
		System.out.println("�÷� : " + car3.color);
		System.out.println("�÷� : " + car3.maxSpeed);
		
		
	}
	
}

package com.kh.test;

public class Car4Ex {
	public static void main(String[] args) {
		
		Car4 mycar = new Car4();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
			
		}
		else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}

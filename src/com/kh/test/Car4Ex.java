package com.kh.test;

public class Car4Ex {
	public static void main(String[] args) {
		
		Car4 mycar = new Car4();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
			
		}
		else {
			System.out.println("gas를 주입하세요.");
		}
	}

}

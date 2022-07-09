package com.kh.test;

public class Char2 {
	public static void main(String[] args) {
		
		Char myCar = new Char();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도 : " + speed + "km/h");
	}

}

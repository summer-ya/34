package com.kh.test;

public class Hyun1 {
	public static void main(String[] args) {
		
		Hyun dae = new Hyun("그랜저", "블랙" , 200);
		System.out.println("모델 : " + dae.model);
		System.out.println("색상 : " + dae.color);
		System.out.println("최고속력 : " + dae.maxSpeed);
		
		System.out.println();
		
		Hyun dae1 = new Hyun("아반떼", "화이트", 190);
		System.out.println("모델 : " + dae1.model);
		System.out.println("색상 : " + dae1.color);
		System.out.println("최고속력 : " + dae1.maxSpeed);
		
	}

}

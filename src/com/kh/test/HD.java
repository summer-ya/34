package com.kh.test;

public class HD {

	String company = "����";
	String model;
	String color;
	int maxSpeed;

	HD() {}

	HD(String model) {
		this(model, "����", 250);

	}



	HD(String model, String color) {

		this.model = model;
		this.color = color;
	}

	HD(String model, String color, int maxSpeed) {

		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
		
	}
	


}

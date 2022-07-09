package com.kh.test;

public class A11 {
	
	int gas; // 필드
	
	// 생성자
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");      /// retrun값이 boolean인 메소드로 gas 필드값이 0이면 false, 0이 아니면 true를 리턴
		}
		System.out.println("gas가 있습니다");
		return true; // true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas 잔량 :" + gas+")");    //리턴값이 없는 메소드로 gas필드값이 0이면 return문으로 메소드를 강제종료
				gas -= 1;
				
			}
			else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				return;
			}
		}
	}

	}
	
	


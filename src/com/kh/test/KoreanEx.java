package com.kh.test;

public class KoreanEx {
	public static void main(String[] args) {
		
		Korean k1 = new Korean("���ڹ�" ,"920806-2222222");
		System.out.println("�̸� : " + k1.name);
		System.out.println("�ֹε�Ϲ�ȣ : " + k1.ssn);
		
		Korean k2 = new Korean("���ڹ�", "930000-2222222");
		System.out.println("�̸� : " + k2.name);
		System.out.println("�ֹε�Ϲ�ȣ : " + k2.ssn);
	}

}

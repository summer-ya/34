package com.kh.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("���ڿ��� �Է����ּ��� : ");
			String str = sc.nextLine();

			if(str.equals("exit")) {
				break;
			} else {
				System.out.println(str.length() + " �����Դϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");

	}
}


package com.kh.test;

public class MemberServiceEx {
	public static void main(String[] args) {
		
		MemberService member = new MemberService();
		boolean result = member.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			member.logout("hong");
			
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
	}

}

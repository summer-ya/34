package com.kh.test;

public class A11 {
	
	int gas; // �ʵ�
	
	// ������
	
	// �޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�");      /// retrun���� boolean�� �޼ҵ�� gas �ʵ尪�� 0�̸� false, 0�� �ƴϸ� true�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�");
		return true; // true�� ����
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas �ܷ� :" + gas+")");    //���ϰ��� ���� �޼ҵ�� gas�ʵ尪�� 0�̸� return������ �޼ҵ带 ��������
				gas -= 1;
				
			}
			else {
				System.out.println("����ϴ�. (gas �ܷ� : " + gas + ")");
				return;
			}
		}
	}

	}
	
	


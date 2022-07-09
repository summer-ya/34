package study122;

import java.util.Scanner;

public class StudentService {
	private Student stu;
	private Scanner input;

	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
	}

		public void insertInfo() {

			this.calcSum(); //���� ����ϱ�
			
			System.out.print("input name >> ");
			stu.setName(input.nextLine());
			System.out.print("input age >> ");
			stu.setAge(input.nextInt());
		}
		public void insertScore() {
			System.out.print("Input Korean : ");
			stu.setKor( input.nextInt() );
			
			System.out.print("Input English : ");
			stu.setEng( input.nextInt() );
			
			System.out.print("Input Mathematics : ");
			stu.setMath( input.nextInt() );
			
			

			
			this.calcAvg(); //��� ����ϱ�
			this.calcSum();
			
		}
		
		
		//���� ����Ѵ�
		private void calcSum() {
			stu.setSum( stu.getKor() + stu.getEng() + stu.getMath() );
		}
		
		//��� ����Ѵ�
		private void calcAvg() {
			stu.setAvg( stu.getSum() / (double)3 );
		}
		
		//�л��� ��� ���� ����Ѵ�
		public void printStu() {
			System.out.println();
			
			System.out.println("--- �л� ���� ---");
			System.out.println("�̸�\t����\t����\t����\t����\t����\t���");

			System.out.print( stu.getName() + "\t" );
			System.out.print( stu.getAge() + "\t" );

			System.out.print( stu.getKor() + "\t" );
			System.out.print( stu.getEng() + "\t" );
			System.out.print( stu.getMath() + "\t" );

			System.out.print( stu.getSum() + "\t" );
			System.out.printf( "%.2f\n", stu.getAvg() );
			
		}
		
	}









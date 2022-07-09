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

			this.calcSum(); //총점 계산하기
			
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
			
			

			
			this.calcAvg(); //평균 계산하기
			this.calcSum();
			
		}
		
		
		//총점 계산한다
		private void calcSum() {
			stu.setSum( stu.getKor() + stu.getEng() + stu.getMath() );
		}
		
		//평균 계산한다
		private void calcAvg() {
			stu.setAvg( stu.getSum() / (double)3 );
		}
		
		//학생의 모든 정보 출력한다
		public void printStu() {
			System.out.println();
			
			System.out.println("--- 학생 정보 ---");
			System.out.println("이름\t나이\t국어\t영어\t수학\t총점\t평균");

			System.out.print( stu.getName() + "\t" );
			System.out.print( stu.getAge() + "\t" );

			System.out.print( stu.getKor() + "\t" );
			System.out.print( stu.getEng() + "\t" );
			System.out.print( stu.getMath() + "\t" );

			System.out.print( stu.getSum() + "\t" );
			System.out.printf( "%.2f\n", stu.getAvg() );
			
		}
		
	}









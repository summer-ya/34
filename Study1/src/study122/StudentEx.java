package study122;

public class StudentEx {
	public static void main(String[] args) {
		
		//학생 관리 객체
		StudentService ss = new StudentService();
		
		
		//이름과 나이를 입력한다
		ss.insertInfo();
		
		//국영수 점수를 입력한다
		ss.insertScore();
		
		//학생의 정보를 출력한다
		ss.printStu();
		
	}
}
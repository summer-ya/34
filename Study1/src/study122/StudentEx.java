package study122;

public class StudentEx {
	public static void main(String[] args) {
		
		//�л� ���� ��ü
		StudentService ss = new StudentService();
		
		
		//�̸��� ���̸� �Է��Ѵ�
		ss.insertInfo();
		
		//������ ������ �Է��Ѵ�
		ss.insertScore();
		
		//�л��� ������ ����Ѵ�
		ss.printStu();
		
	}
}
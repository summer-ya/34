package study122;

public class Student {
	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	public String getName() {
		return name;
	}
	
	
	public Student() { }
	
	public Student(String name, int age, int kor, int eng, int math, int sum, double avg) {
		super();
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = sum;
		this.avg = avg;
	}



	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

}

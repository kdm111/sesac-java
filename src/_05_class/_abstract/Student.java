package _05_class._abstract;

public abstract class Student {
	String name;
	String school;
	int age;
	int studentId;
	
	public Student(String name, String school, int age, int studentId) {
		this.name = name;
		this.school = school;
		this.age = age;
		this.studentId = studentId;
	}
	void displayStudentInfo() {
		System.out.println("=== " + this.name + " 학생의 정보 " + " ===");
		System.out.println("학교 : " + this.school);
		System.out.println("나이 : " + this.age);
		System.out.println("학번 : " + this.studentId);
		todo();
		System.out.println();
	}
	abstract void todo();
}

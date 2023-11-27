package _05_class;

// 클래스
// - 클래스를 통해 인스턴스를 생성

public class Student { // 공개 클래스 선언

	// 1. 클래스의 필드
	private String name;
	private int studentId;
	private int grade;
	private static int totalStudents = 0;
	// 2-1 생성자 메소드
	// this == 클래스의 현재 인스턴스를 가리킨다.
	public Student(String name, int studentId, int grade) {
//		 1.
//		 필드의 이름과 매개변수의 이름이 동일하므로 this 키워드를 통해 구분
//		this.name = name;
//		this.grade = grade;
//		 2. 현재 인스턴스를 메소드의 인자로 전달 가능
//		 3. 현재 인스턴스에서 다른 생성자를 호출 가능. 생성자 오버로딩시 
		
		setName(name);
		setStudentId(studentId);
		setGrade(grade);
		totalStudents += 1;
	}
//	// this를 사용하지 않는 생성자
//	// 명확한 구분을 위해 this 키워드를 사용하는 것이 바람직하다.
//	public Student(String n, int g) {
//		name = n;
//		grade = g;
//	}
	// 2-2 일반 메소드 
	public void goToSchool() {
		System.out.println("go to School");
	}
	// 2-2 인자는 있지만 반환값은 없는 메소드
	public void study(String subject) {
		// 동적 생성 문자열이므로 string pool에 속하지 않음
		// 형식 지정자 format specifier
		System.out.printf("%s 과목 공부 중\n", subject); // 자동 개행 없음 
	}
	// 2-3 반환값이 있는 메소드 
//	public int getGrade() {
//		return this.grade;
//	}
	// 2-4
	public String getTestResult(int score) {
		return this.name + "학생의 점수는 " + score + "입니다.";
	}
	public String getName() {
		return this.name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return this.studentId;
	}
	private void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getGrade() {
		return this.grade;
	}
	private void setGrade(int grade) {
		this.grade = grade;
	}
	public static int getTotalStudents() {
		return totalStudents;
	}
	public void displayInfo() {
		System.out.printf("==== 학생 정보 ====\n");
		System.out.printf("이름 : %s\n", getName());
		System.out.printf("학번 : %d\n", getStudentId());
		System.out.printf("학년 : %d\n", getGrade());
	
	}
	@Override
	public String toString() {
		return this.name + " " + this.grade;
	}

	

}

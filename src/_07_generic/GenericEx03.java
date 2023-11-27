package _07_generic;

// import 

class Person {
	
}
class Teacher extends Person {
	
}
class Student extends Person {
	
}
class WebStudent extends Student {
	
}
class MobileStudent extends Student {
	
}
// 등록 객체
// 특정 종류 (T)의 등록을 나타내는 클래스
class Applicant<T> {
	private T kind;
	public Applicant(T kind)  {
		setKind(kind);
	}
	private void setKind(T kind) {
		this.kind = kind;
	}
	
}
// getClass - 클래스 정보를 반환
// getSimpleName - 클래스의 간단한 이름을 반환한다.
class Course {
	// ? 모든 클래스가 올 수 있음
	public static void registerCourseA(Applicant<?> applicant) {
		System.out.println(applicant.getClass().getSimpleName() + "A 등록 하였음.");
	}
	// Teacher 이상의 클래스만 올 수 있음
	public static void registerCourseB(Applicant<? super Teacher> applicant) {
		System.out.println(applicant.getClass().getSimpleName() + "B 등록 하였음.");
	}
	// Student 만 등록 가능
	public static void registerCourseC(Applicant<? extends Student> applicant) {
		System.out.println(applicant.getClass().getSimpleName() + "C 등록 하였음.");
	}
	
}

public class GenericEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Course course = new Course();
		
		// Course A
	    Course.registerCourseA(new Applicant<Person>(new Person()));
	    Course.registerCourseA(new Applicant<Teacher>(new Teacher()));
	    Course.registerCourseA(new Applicant<Student>(new Student()));
	    Course.registerCourseA(new Applicant<WebStudent>(new WebStudent()));
	    Course.registerCourseA(new Applicant<MobileStudent>(new MobileStudent()));
		System.out.println();
	    
	    Course.registerCourseB(new Applicant<Person>(new Person()));
	    Course.registerCourseB(new Applicant<Teacher>(new Teacher()));
	    // Teacher Super이기 때문에 안됨.
//	    Course.registerCourseB(new Applicant<Student>(new Student()));
//	    Course.registerCourseB(new Applicant<WebStudent>(new WebStudent()));
//	    Course.registerCourseB(new Applicant<MobileStudent>(new MobileStudent()));
		System.out.println();
		
		// extends student 이하만 등록 가능
//	    Course.registerCourseC(new Applicant<Person>(new Person()));
//	    Course.registerCourseC(new Applicant<Teacher>(new Teacher()));
	    Course.registerCourseC(new Applicant<Student>(new Student()));
	    Course.registerCourseC(new Applicant<WebStudent>(new WebStudent()));
	    Course.registerCourseC(new Applicant<MobileStudent>(new MobileStudent()));
		System.out.println();
	}

}

package _05_class._inheritance;
import _05_class._inheritance.Person;

public class Student extends Person {
	private String campus;
	
	public Student(String name, int age) {
		// 부모 생성자를 호출 
		// super() 아무 매개변수가 필요없다면 이렇게 작성해도 되지만 매개 변수가 필요하다면 값을 넘겨 주어야 함.
		super(name, age);
	}
	
	public void setCampus(String campus) {
		this.campus = campus;
	}
	
	@Override
	public String toString() {
		if (this.campus != null) {
			return super.toString() + " 캠퍼스는 " + this.campus;
		} else {
			return super.toString();
		}
		
	}
}	

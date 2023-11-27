package _05_class._inheritance;

// 상속 
// 다중 상속 미지원
// 부모 클래스 - 슈퍼 클래스 
// 자식 클래스 - 서브 클래스 

public class Person {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		System.out.println("부모 생성자 실행 완료!");
		setName(name);
		setAge(age);
	}
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void say() {
		System.out.println("hello");
	}
	public void eat(String food) {
		System.out.printf("%s munch munch\n", food);
	}
	@Override
	public String toString() {
		return "이름은 " + this.name + " 나이는 " + this.age;
	}
}

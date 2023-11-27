package _05_class._access_modifier._pack05;

public class Person {
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름은 " + this.name + " 나이는 " + this.age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if (age <= 0) {
			this.age = 0;
		} else {
			this.age = age;			
		}
	}
}

package _05_class._access_modifier._pack05;

public class PersonEx {
	
	public static void main(String args[]) {
		Person p1 = new Person("jhon");
//		Person p2 = new Person("alex");

//		p1.age = 5; // private field
		p1.setAge(5);
		System.out.println(p1);
	
		
	}
}

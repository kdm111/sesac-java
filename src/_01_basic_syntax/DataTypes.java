package _01_basic_syntax;


public class DataTypes {
	public static void main(String[] args) {
		System.out.println("===== primitive type =====");
		// DataTypes

//		// primitive
//		// 비 객체 타입으로 null 값을 가질 수 없다. 
//		// boolean
//		boolean bln = false;
//		System.out.println(bln);
//		// char
//		char c = 'a'; // 문자형은 unicode 하나를 저장하는 자료형
//		System.out.println(c); // 97 mapping
//		char ko = '가';
//		System.out.println(ko); // 44635 mapping
//		// byte
//		byte b = 1;
//		System.out.println(b);
//		// short
//		short s = 123;
//		System.out.println(s);
//		// int
//		int i = 15;
//		System.out.println(i);
//		// long
//		long l = 1000000012415124150L; // l or L needed
//		System.out.println(l);
//		// float
//		float f = 1.2333F; // f or F needed
//		System.out.println(f);
//		// double
//		double d = 1233.1245;
//		System.out.println(d);
		
		
		// reference
		// java.lang.Object를 상속 받는다.
//		// 객체의 참조 메모를 저장한다.
		// 기본형이 아니라면 참조형으로 인식된다.
		// array
		int[] numArr = {1, 2, 3};
		System.out.println(numArr);
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		// class
		String HelloWorld = new String("Hello World");
		String HelloWorld2 = new String("Hello World");
		String HelloWorld3 = "Hello World";
		String HelloWorld4 = "Hello World";
		// 기본 자료형은 = 으로 비교하지만
		// String은 .equals()를 사용하여 비교
		System.out.println(HelloWorld);
		System.out.println(HelloWorld.equals(HelloWorld2)); // true
		System.out.println(HelloWorld == HelloWorld3); // false
		System.out.println(HelloWorld3 == HelloWorld4); // true
		
		Person jsp = new Person("jsp", 123);
		System.out.println(jsp); // 주
		System.out.println(jsp.getName()); // "jsp"
		System.out.println(jsp.getAge()); // 123

		// interface
		
		
	}

}

class Person {
	// field
	private String name;
	private int age;
	
	// generator
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}

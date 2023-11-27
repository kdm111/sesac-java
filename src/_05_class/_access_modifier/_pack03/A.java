package _05_class._access_modifier._pack03;

// 필드와 메소드의 접근 제한자

public class A {

	public int field1; // public
	int field2; // default
	private int field3; // private
	
	public A () {
		// 클래스 내부에서는 접근 제한자 영향을 받지 않으므로 값을 다 부를 수 있음.
		field1 = 1;
		field2 = 2;
		field3 = 3;
		method1();
		method2();
		method3();
	}
	public void method1() {
		System.out.println("method1");
	}
	void method2 () {
		System.out.println("method2");
	}
	private void method3() {
		System.out.println("method3");
	}

}

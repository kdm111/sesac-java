package _05_class._access_modifier._pack03;

public class B {

	public void method() {
		A a = new A();
		a.field1 = 11; // public
		a.field2 = 22; // default
//		a.field3 = 33; // private field 값은 같은 패키지 안이여도 접근 불가 
		System.out.println("B method");
		
		a.method1(); // public
		a.method2(); // default
// 		a.method3(); // private method는 접근 불가 
	}
}

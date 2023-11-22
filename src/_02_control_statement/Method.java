package _02_control_statement;

// 메소드
// 객체가 가지고 있는 동작

// 접근제한자 static 리턴타입 동작 () {
// return ;
// }

// 접근 제한자 accessModifier
// 

public class Method {

	public static void main(String[] args) {
//		hello();
//		System.out.println(add(1, 2));
//		System.out.println(add2(2,3));
		
		int[] numbers = {10,20};
		int[] numbers2 = {10,20,30,40,50};
		System.out.println(mul2(numbers));
		
	}
	// 반환 값이 없는 메소드
	public static void hello() {
		System.out.println("hello");
	}
	// 반환 값이 있는 보이드
	// 리턴 타입과 일치하는 타입을 반환해야 한다.
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static String add2(double a, double b) {
		return "두 수의 합은 : " + (a + b);
	}
	// call by value
	public static int mul1(int a, int b) {
		return a * b;
	}
	public static int mul2(int[] arr) {
		int total = 1;
		for (int num : arr) {
			total = mul1(total, num);
		}
		return total;
	}
}

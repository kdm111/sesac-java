package _06_wrapper;

// Wrapper 객체
// primitive type 값을 갖는 객체를 생성하는 것

public class BoxingUnboxingEx {

	public static void main(String[] args) {
		// Boxing
		// 기본 타입 -> 포장 객체
		// 포장 클래스 변수에 값이 대입될 때 일어남
		Integer obj1 = 120;
		Double obj2 = 2.2;
		System.out.println(obj1.intValue()); // int 형 값 반환
		System.out.println(obj2.doubleValue()); // double 형 값 반환
		
		// Unboxing
		// 포장 객체 -> 기본 타입
		// 기본 타입 변수에 포장 대입이 일어날 때 사용
		int val1 = obj1;
		double val2 = obj2;
		System.out.println(val1); 
		System.out.println(val2);
		
		int result = obj1 + 200;
		System.out.println(result);
		
	}

}



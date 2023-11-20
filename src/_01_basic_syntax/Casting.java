package _01_basic_syntax;

public class Casting {

	public static void main(String[] args) {
		// 데이터의 타입을 변환하는 행위
		// (type) var : (타입형) 변수
		
		// wider conversion
		// 작은 타입에서 큰 타입으로 형변환 할 경우에만 가능하다.
		int number = 10; 
		double dNumber = number;
		System.out.println(number + " "  + dNumber); // 10 10.0
		
		// narrow conversion
		double aNumber = 20.2;
		int aaNumber = (int) aNumber;
		
		System.out.println(aNumber + " "  + aaNumber); // 20.2 20
		
		
	}

}

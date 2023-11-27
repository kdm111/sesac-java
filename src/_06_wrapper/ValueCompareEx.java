package _06_wrapper;

// 포장값 비교하기
// 래퍼는 참조형이기 때문에 객체 내부 값을 비교할 때  == != 는 부적합
// equals()로 비교해야 함.
// 단 boolean, char, byte, short, int  내의 값을 같는 경우는 참조값을 비교함.

public class ValueCompareEx {

	public static void main(String[] args) {
		

		
		Double obj1 = 1.0;
		Double obj2 = 1.0;
		System.out.println(obj1 == obj2); // false
		System.out.println(obj1.equals(obj2)); // true
		
		Integer obj3 = 1;
		Integer obj4 = 1;
		System.out.println(obj3 == obj4); // true
		System.out.println(obj3.equals(obj4)); // true
		
		Character obj5 = 'A';
		Character obj6 = 'A';
		System.out.println(obj5 == obj6); // true
		System.out.println(obj5.equals(obj6)); // true
		
		Character obj7 = '\u1001';
		Character obj8 = '\u1001';
		System.out.println(obj7 == obj8); // false
		System.out.println(obj7.equals(obj8)); // true
		
	}

}

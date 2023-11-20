//메인 클래스 시작 클래스 정의 
// 메인 클래스는 오직 한 개만 존재할 수 있으며 진입점 역할을 하게 된다.

public class Main { // 클래스 이름은 항상 대문자로 시작한다.파일명과 클래스이름은 동일해야 한다.
	//	 주석은 1. //한 줄 2. /* 여러 줄 */ 3. /** 문서 주석 */
	
	// main 메소드는자바 응용프로그램의 시작점
	// 최소 하나의 main 진입점이 필요하며/
	// jvm은 오직 하나의 ;을 사용한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello world");
//		for (int i = 1; i <= 5; i++ ) {
//			System.out.println("i is " + i);
//		}
		// print
		System.out.print("Java print"); // 개행 처리 불가
		// printf
		System.out.printf("Java printf"); // 개행 처리 불가 
		// println
		System.out.println("Java println"); // 개행 처리 가능
		
	}

	
}

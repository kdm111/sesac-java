package _02_control_statement;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// if ~ else
//		int num = 10;
//		if (num % 2 == 1) {
//			System.out.println("홀수입니다.");
//		} else {
//			System.out.println("짝수입니다.");
//		}
		
		// 
//		System.out.println("이름을 입력해주세요! : ");
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println(name);
//		
////		// String의 값이 같은 지 확인 
//		if (name.equals("김새싹")) {
//			System.out.println(name + "환영!");
//		} else {
//			System.out.println("김새싹이 아니여도 환영!");
//		}
//		
//		// 같은 참조를 가리키는 지 확인
		
		//switch case
		int day = 1;
		switch(day) {
			case 1:
				System.out.println("일요일");
				break ;
			case 2:
				System.out.println("월요일");
				break ;
			case 3:
				System.out.println("화요일");
				break ;
			case 4:
				System.out.println("수요일");
				break ;
			case 5:
				System.out.println("목요일");
				break ;
			case 6:
				System.out.println("금요일");
				break ;
			default:
				System.out.println("토요일");
				break ;
		}
		
	}

}

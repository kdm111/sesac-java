package _01_basic_syntax;
import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		while (true) {
			System.out.println("이름을 입력하세요");
			name = sc.next();
			System.out.println("나이를 입력하세요");
			age = sc.nextInt();
			sc.nextLine();
			System.out.println(String.format("안녕하세요 %s님(%d)", name, age));
		}
		
	}

}

package _01_basic_syntax;
import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("공백으로 구분해 이름 나 키 결혼여부를 넣어주세요!");
		String name = sc.next(); // 공백 이전까지 문자열을 읽음
		
		int age = sc.nextInt(); // 공백 이전까지 정수형을 읽음
		double d = sc.nextDouble();// 공백 이전까지 실수를 읽음;
		boolean b = sc.nextBoolean(); // 공백 이전까지 boolean 값을 읽음
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + d); 
		System.out.println("결혼 여부 : " + b);
		
		sc.close(); // 스캐너 닫기 
	}
	
}

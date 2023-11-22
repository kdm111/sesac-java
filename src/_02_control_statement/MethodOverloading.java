package _02_control_statement;
import java.util.Scanner;
import java.util.ArrayList;

public class MethodOverloading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 두 개를 입력하세요");
		String inp = sc.nextLine();
		String[] numbers = inp.split(" ");
		int a = Integer.parseInt(numbers[0]);
		int b = Integer.parseInt(numbers[1]);
		
		System.out.println("덧셈 결과 : " + (a + b));
		System.out.println("뺄셈 결과 : " + (a - b));
		System.out.println("나눗셈 결과 : " +((double)a / (double)b));
		System.out.println("곱셈 결과 : " + (a * b));
//		MethodOverloading a = new MethodOverloading();
//		System.out.println("with static keyword, " + add(1,2));
//		System.out.println(add(1.1, 2.2, 3.3, 4.4));
//		System.out.println("without static keyword, " + a.add2(1,2));

	}
	public static void getParams() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String input = sc.nextLine();
		String[] temp = input.split(" ");
		ArrayList<Integer> numbers = new ArrayList<>();
		for (String num : temp) {
			numbers.add(Integer.parseInt(num));
		}
		int a = numbers.get(0);
		if (numbers.size() == 1) {
			System.out.println(String.format("반지름이 %d인 원의 넓이", a, (double)a * (double)a * 3.14));
		} else {
			int b = numbers.get(1);
		}
		
		
	}
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;	
	}
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	public static double add(double... numbers) {
		double total = 0;
		for (double number : numbers) {
			total += number;
		}
		return total;
	}
	public static double getArea(int r) {
		return 3.14 * r * r;
	}
	
	// static 키워드가 없으므로 인스턴스를 생성한 뒤 사용 가능하다.
	public int add2(int a, int b) {
		return a + b;
	}

}




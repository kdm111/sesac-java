package _05_class;
import java.util.Scanner;

public class CircleEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요 : ");
		System.out.print("원의 반지름 : ");
		double r = sc.nextDouble();
		Circle c = new Circle(r);
		
		// c.radius = 10;
		System.out.printf("원의 넓이 : %f\n", c.calculateArea());
	}

}

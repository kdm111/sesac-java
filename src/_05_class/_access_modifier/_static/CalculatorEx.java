package _05_class._access_modifier._static;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 2;
		int r = 10;
		double circleArea = Calculator.pi * Math.pow(r, 2);
		System.out.printf("%f\n", circleArea);
		System.out.printf("%d", Calculator.plus(num1, num2));
	}

}

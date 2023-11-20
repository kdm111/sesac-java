package _01_basic_syntax;

public class Operator {

	public static void main(String[] args) {
		int x, y;
		double a, b;

		x = 20;
		y = 6;
		a = 5.0;
		b = 10.0;
		
		// arithmetic operator		
		System.out.println(x + y); // 26 // addition
		System.out.println(x - y); // 14 // subtraction
		System.out.println(x * y); // 120 // multiplication
		System.out.println(x / y); // 3 // division
		System.out.println(x % y); // 2 // modulus
		
		// increment operator
		System.out.println(x++); // 21
		System.out.println(++x); // 22
		// decrement operator
		System.out.println(--x);
		System.out.println(x--);
		
		// compound assignment operator 
		// += -= *= /= %=
		
		// comparison operator
		// > < >= <= == !=
		
		// logical operator
		// && || !
		
		// ternary operator
		// condition ? expression1 : expression2
		
	}

}

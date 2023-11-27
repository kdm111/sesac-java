package _07_generic;

class Calculator<T extends Number> {
	private T num1;
	private T num2;
	
	public Calculator(T num1, T num2) {
		setNum1(num1);
		setNum2(num2);
	}
	private void setNum1(T num1) {
		this.num1 = num1;
	}
	private void setNum2(T num2) {
		this.num2 = num2;
	}
	public double add () {
		return this.num1.doubleValue() + this.num2.doubleValue();
	}
	
}
public class Ex2 {

	public static void main(String[] args) {
		Calculator<Integer> InCal = new Calculator(10,5);
		Calculator<Double> DbCal = new Calculator(2.8200000000001, 2.82000000000000001);
		System.out.println("Integer Sum : " + InCal.add());
		System.out.println("Double Sum : " + DbCal.add());

	}

}

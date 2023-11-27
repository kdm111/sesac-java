package _05_class;

public class Circle {
	public final double radius;
	private static final double PI = Math.PI;
	public Circle (double radius) {
		this.radius = radius;
	}
	public double calculateArea() {
		return PI * Math.pow(this.radius, 2);
	}
}

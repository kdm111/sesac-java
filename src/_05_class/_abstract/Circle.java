package _05_class._abstract;
import _05_class._abstract.Shape;

// 구체적인 클래스 원을 나타냄
public class Circle extends Shape {
	int radius;
	
	public Circle(String color, int radius) {
		super(color, "원");
		this.radius = radius;
	}
//	void draw() {
//		System.out.println("원 그리기");
//	}
	double calculateArea () {
		return radius * radius * Math.PI;
	}
	String getColor() {
		return this.color;
	}
}

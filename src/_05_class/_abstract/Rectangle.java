package _05_class._abstract;
import _05_class._abstract.Shape;

// 구체적인 클래스 사각형을 나타
public class Rectangle extends Shape{
	int width;
	int height;
	
	public Rectangle(String color, int width, int height) {
		super(color, "사각형");
		this.width = width;
		this.height = height;
	}
//	void draw() {
//		System.out.println("사각형 그리기");
//	}
	double calculateArea() {
		return width * height;
	}
	String getColor() {
		return this.color;
	}
}

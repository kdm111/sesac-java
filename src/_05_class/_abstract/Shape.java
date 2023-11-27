package _05_class._abstract;

public abstract class Shape {
	// 필드 선언
	String color;
	String type;
	// 생성자 선언
	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	// 추상 메서드 선언
	// abstract 
	// 선언 만하고 구현은 안하는 메소드
	// 중괄호 없음
	// 메소드 구현이 자 클래스마다 다른 경우에 사용
//	abstract void draw();
	abstract double calculateArea();
	abstract String getColor();
	
//	void start() {
//		System.out.println("도형 그리기");
//	}
//	public String getColor() {
//		return this.color;
//	}

}

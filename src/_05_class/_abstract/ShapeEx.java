package _05_class._abstract;
import _05_class._abstract.Circle;
import _05_class._abstract.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeEx {

	public static void main(String[] args) {
		Circle c = new Circle("Red", 5);
		Rectangle r = new Rectangle("Blue", 6, 4);
		
		List<Shape> Shapes = new ArrayList<>();
		Shapes.add(c);
		Shapes.add(r);
		
		for (Shape s : Shapes) {
			System.out.println("=== " + s.getClass().getSimpleName() +  " 도형의 정보 ===");
			System.out.println("도형의 색상 : " + s.getColor());
			System.out.println("도형의 넓이 : " + s.calculateArea());
			System.out.println();
		}
//		c.start();
//		c.draw();
//		s.start();
//		s.draw();
//		System.out.println(c.getColor());
//		System.out.println(s.getColor());
	}

}

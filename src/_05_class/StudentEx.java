package _05_class;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentEx {

	// main 
	// java app의 진입점을 명시한다.
	
	public static void main(String[] args) {
//		Student std1 = new Student("jhon", 1);
//		System.out.println(std1);
//		System.out.println(std1.name + " " + std1.grade);
//		std1.study("java");
//		System.out.println(std1.getGrade());
//		List<Rectangle> rects = new ArrayList<>();
//		try (Scanner sc = new Scanner(System.in);){
//			while (true) {
//				System.out.println("사각형의 가로 세로 길이를 알려주세요 ");
//				String temp = sc.nextLine();
//				Rectangle rect = Rectangle.createRectangle(temp);
//				if (rect != null) {					
//					rects.add(rect);
//				} else {
//					break ;
//				}
//			} 
//		} catch (NumberFormatException e) {
//			System.out.println("올바르지 않은 숫자입니다.");
//		} catch (IllegalArgumentException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			for (Rectangle rect : rects) {
//				System.out.print("===============\n");
//				System.out.println("가로의 길이는 " + rect.getWidth());
//				System.out.println("세로의 길이는 " + rect.getHeight());
//				System.out.println("넓이는 " + rect.getArea());
//				System.out.print("===============\n");
//			}
//			System.out.println("개수는 " + Rectangle.getSize() + "개 입니다.");
//		}
		
		Student std1 = new Student("김새싹", 20231000, 1);
		Student std2 = new Student("박지은", 20231001, 2);
		Student std3 = new Student("이은지", 20231002, 3);
		List<Student> students = new ArrayList<>(Arrays.asList(std1, std2, std3));
		for (Student std : students) {
			std.displayInfo();
		}
		System.out.printf("총 학생수는 %d입니다.", Student.getTotalStudents());
		
	}

}

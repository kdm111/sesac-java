package _03_array;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


// collection framework
// 객체를 효율적으로 활용하기 위한 인터페이스와 클래스의 모음집

public class ArrayListEx {
	
	public static void main(String[] args) {
//		// ArrayList 클래스 정수 저장 예제
//		//primitive를 받지 않으므로 객체를 받아주어야 한다.
//		// int -> Integer
//		List<Integer> numbers = new ArrayList<>();
//		
//		numbers.add(10);
//		numbers.add(20);
//		numbers.add(30);
//		numbers.add(40);
//		numbers.add(50);
//		System.out.println(numbers.get(1));
//		
//		// 수정
//		// set
//		numbers.set(1, 77);
//		System.out.println(numbers.get(1));
//		
//		// 삽입
//		// add
//		numbers.add(99);
//		System.out.println(numbers);
//
//		// list끼리 연결
//		// addAll
//		List<Integer> numbers2 = new ArrayList<>(Arrays.asList(10,20,30));
//		numbers.addAll(numbers2);
//		System.out.println(numbers);
//		
//		// indexOf
//		// 처음 만나는 인덱스 리턴
//		System.out.println(numbers.indexOf(10));
//		System.out.println(numbers.indexOf(2));
//		
//		// remove
//		// index위치에 있는 요소 삭제
//		numbers.remove(2);
//		System.out.println(numbers);
//		
//		// size
//		System.out.println(numbers.size());
//		
//		// forEach
//		for (Integer n : numbers) {
//			System.out.print(n + " ");
//		}
//		
//		// clear
//		// 배열 비우기
//		numbers.clear();
//		System.out.println("\n" + numbers);
		
//		// Student Array 생성
//		List<Student> students = new ArrayList<Student>();
//		students.add(new Student("a", 1));
//		students.add(new Student("b", 2));
//		students.add(new Student("c", 3));
//		
//		Student std1 = students.get(0);
////		System.out.println(std1);
////		System.out.println(std1.name); //private 이므로 접근이 불가능하다.
//		
//		for (Student std : students) {
//			System.out.println(std);
//		}
		
		
//		List<String> inputs = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("문자를 입력해 주세요 : ");
//			String input = sc.nextLine();
//			if (!input.equals("exit")) {
//				inputs.add(input);
//			} else {
//				sc.close();
//				break ;
//			}
//		}
//		for (String inp : inputs)  {
//			System.out.println(inp);
//		}
		
		// 
	}

}

class Student {
	
	private String name; // private is 외부에서 접근할 수가 없어서 수정 및 조회가 불가능하다.
	private int age; // 
	public int getAge () {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("학생의 이름은 %s이고, 나이는 %d입니다.", this.name, this.age);
	}
	
}

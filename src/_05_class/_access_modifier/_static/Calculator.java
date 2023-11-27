package _05_class._access_modifier._static;

// static 멤버
// 객체를 생성할 필요 없이 클래스를 사용하여 바로 접근 가능
// 클래스가 메모리에 로딩되면 정적 멤버는 바로 사용 가능
// 클래스 이름 .(dot)으로 접근 가능
// 객체 자신의 참조인 this 사용 불가능

public class Calculator {
	static double pi = 3.1415926534;
	
	static int plus (int x, int y) {
		return x + y;
	}
	
	static int minus (int x, int y) {
		return x - y;
	}
	
}

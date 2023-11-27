package _05_class._access_modifier._pack05;

// Singleton 패턴
// 단 하나의 객체임을 보장
// private 접근자를 이용해 새로운 new 생성자 호출을 막음
// 외부에서 객체 생성은 불가능하므로 정적 메서드를 사용하여 간접적으로 객체를 얻을 수 있게 
public class Singleton {
	// private  접근 권한을 갖는 정적 필드 선언, 초기화
	private static Singleton singleton = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		//  위에서 생성된 오직 하나의 인스턴스를 호출함.
		return singleton;
	}
}

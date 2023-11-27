package _05_class._access_modifier._pack07;
import _05_class._access_modifier._pack06.A;

// D클래스는 다른 패키지에 존재하지만 A를 상속 받는다면 
public class D  extends A{
	public D () {
		super();
		System.out.println(this.field1);  // 다른 클래스 멤버 임에도 상속 받는 경우에는 접근이 가능하다.
		
	}
}

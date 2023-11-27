package _05_class._interface;
import _05_class._interface.Monitor;

public class InterfaceEx03 {

	public static void main(String[] args) {
		// interface 역시 참조타입이므로 null값이 포함될 수 있다.
		// 따라서 변수 타입 설정이 가능하다.
		RemoteControl rc;
		rc = new Monitor();
		rc.setVolume(13);
		
		// 인터페이스에 정의된 상수는 객체와 무관하므로 바로 접근이 가능하다.
		
		System.out.println(rc.MAX_VOLUME);
	}

}

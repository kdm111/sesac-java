package _05_class._interface;

public interface RemoteControl {
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// 인터페이스의 모든 필드는 public static final을 가짐
	// 즉 셋이 되면 바뀌지 않는 항상 상수를 말함.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
}

package _05_class._interface;
import _05_class._interface.RemoteControl;

public class Speaker implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("스피커 켜기");
	}
	@Override
	public void turnOff() {
		System.out.println("스피커 기");
	}
	
	@Override
	public void setVolume(int volume) {
		
		if (this.volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (this.volume < RemoteControl.MIN_VOLUME) {			
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(this.volume);
	}
	
}

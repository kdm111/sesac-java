package _05_class._interface;
import _05_class._interface.RemoteControl;

public class Monitor implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("monitor 켜기");
	}
	
	@Override
	public void turnOff() {
		System.out.println("monitor 기");
	}
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		if (this.volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (this.volume < RemoteControl.MIN_VOLUME) {			
			this.volume = RemoteControl.MIN_VOLUME;
		} 
		System.out.println(this.volume);
	}
	
}

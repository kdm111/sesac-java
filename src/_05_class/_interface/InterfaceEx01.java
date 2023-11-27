package _05_class._interface;

interface Controller {
	void powerOn();
	void powerOff();
	
}
class Tv implements Controller {
	@Override 
	public void powerOn() {
		System.out.println("TV power on");
	}
	@Override 
	public void powerOff() {
		System.out.println("TV power off");
	}
}

class Computer implements Controller {
	@Override 
	public void powerOn() {
		System.out.println("Computer power on");
	}
	@Override 
	public void powerOff() {
		System.out.println("Computer power off");
	}
}

public class InterfaceEx01 {
	public void main(String args[]) {
		Tv tv = new Tv();
		Computer computer = new Computer();
		tv.powerOn();
		tv.powerOff();
		
		computer.powerOn();
		computer.powerOff();
	}
}

package _05_class.Ex;

public class Airplane extends Vehicle implements Flyable {
	
	public Airplane(String name, int maxSpeed) {
		super(name, maxSpeed);
	}
	@Override 
	public void move() {
		System.out.println(this.name + " 하늘을 날아 가는 중");
	}
	@Override
	public void fly() {
		System.out.println(this.name + " 고도 10,000피트에서 비행 중");
	}
}

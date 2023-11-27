package _05_class.Ex;

public abstract class Vehicle {
	protected String name;
	protected int maxSpeed;
	
	public Vehicle (String name, int maxSpeed) {
		setName(name);
		setMaxSpeed(maxSpeed);
	}
	
	public String getName() {
		return this.name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	private void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public abstract void move();
}

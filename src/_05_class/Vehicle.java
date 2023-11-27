package _05_class;

public class Vehicle {
	public String name;
	public int age;
    public Vehicle(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
    	return "이름 : " + this.name + " 연식 : " + this.age; 
    }

}

class Car extends Vehicle {
    public Car(String name, int age) {
        super(name, age); 
    }
}

class Bus extends Vehicle {
	public int capacity; 
    public Bus(String name, int age, int capacity) {
        super(name, age); 
        this.capacity = capacity;
    }
    @Override
    public String toString() {
    	return super.toString() + String.format(" 버스는 %d인승입니다.", this.capacity);
    }
}
class MotoCycle extends Vehicle {
	public boolean danger;
	public MotoCycle(String name, int age, boolean danger) {
		super(name, age);
		this.danger = danger;
	}
    @Override
    public String toString() {
    	return super.toString() + String.format(" 오토바이는 위험한가? " + this.danger);
    }
}


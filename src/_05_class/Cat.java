package _05_class;
import _05_class.Animal;

public class Cat extends Animal {	
	public Cat(String name, int age) {
		super("Cat", name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("냐옹!");
	}
	
}

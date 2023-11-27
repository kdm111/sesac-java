package _05_class;
import _05_class.Animal;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super("Dog", name, age);
	}
	@Override
	public void makeSound() {
		System.out.println("왈왈!");
	}
}

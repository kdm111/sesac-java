package _05_class;

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("강아지", 1);
		Cat c = new Cat("고양이", 2);
		
		d.makeSound();
		c.makeSound();
		d.getAnimalInfo();
		
	}

}

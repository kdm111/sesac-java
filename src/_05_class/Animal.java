package _05_class;

public class Animal {
	private String species;
	private String name;
	private int age;
	
	public Animal(String species, String name, int age) {
		setSpecies(species);
		setName(name);
		setAge(age);
	}
	public String getSpecies()  {
		return this.species;
	}
	private void setSpecies(String species) {
		this.species = species;
	}
	public String getName()  {
		return this.name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getAge()  {
		return this.age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	protected void makeSound() {
		System.out.println("동물은 소리를 낸다.");
	}
	protected void getAnimalInfo() {
		System.out.printf("이름은 %s이고 나이는 %d입니다.", getName(), getAge());
	}
}

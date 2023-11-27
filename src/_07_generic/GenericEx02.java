package _07_generic;
// Number
// 자바에서 모든 숫자를 포함하는 형식의 부모 클래

// 제네릭 제한
// Box 클래스는 제네릭 타입 T를 받지만 제한을 두어서 Number를 상속한 클래스만 허용
// 아이템을 선언하고 반환하는 메서드를 가짐

// 숫자형만을 포함하는 박스 선언
class Box <T extends Number> {
	private T item;
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return this.item;
	}
}
interface Movable {
	void move();
	
}
class Car implements Movable {
	@Override 
	public void move() {
		System.out.println("car moves");
	}
}

class Container <T extends Movable> {
	private T item;
	public Container(T item) {
		this.item = item;
	}
	public void itemMove() {
		this.item.move();
	}
	
}
public class GenericEx02 {

	public static void main(String[] args) {
//		Box<String>; // 에러 발생
		Box b = new Box<Double>();
		b.setItem(3.11);
		System.out.println(b.getItem());

		Box ib = new Box<Integer>();
		System.out.println(ib.getItem());
		// 정수 리터럴의 기본값은 int
		Box sb = new Box<Short>();
		sb.setItem((short) 23); //  명시적 형 변환을 사용하여 바꾼다.
		System.out.println(sb.getItem());
		
		Container<Car> container = new Container<>(new Car());
		container.itemMove();
		
	}

}

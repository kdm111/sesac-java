package _05_class;
import _05_class.Vehicle;

public class VehicleEx {

	public static void main(String[] args) {
		Car c = new Car("car", 123);
		System.out.println(c);
		Bus b = new Bus("bus", 123, 100);
		System.out.println(b);
		MotoCycle m = new MotoCycle("moto", 19, true);
		System.out.println(m);
	}

}

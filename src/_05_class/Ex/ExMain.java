package _05_class.Ex;
import _05_class.Ex.Car;
import _05_class.Ex.Airplane;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ExMain {

	public static void main(String[] args) {
		
		Car c = new Car("car", 100);
		Airplane a = new Airplane("plane", 10000);
		
		List<Vehicle>Vehicle = new ArrayList<Vehicle>(Arrays.asList(c, a));
		for (Vehicle v : Vehicle) {
			v.move();
			if (v instanceof Airplane) {
				((Airplane) v).fly();
			}
		}
	}

}

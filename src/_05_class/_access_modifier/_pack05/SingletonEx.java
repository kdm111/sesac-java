package _05_class._access_modifier._pack05;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s2 == s3); // true
		
	}

}

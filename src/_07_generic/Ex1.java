package _07_generic;



class Pair <T, U> {
	private T K;
	private U V;

	public Pair (T K, U V) {
		setK(K);
		setV(V);
	}
	public T getK() {
		return this.K;
	}
	private void setK(T K) {
		this.K = K;
	}
	
	public U getV() {
		return this.V;
	}
	private void setV(U V) {
		this.V = V;
	}
	public void display() {
		System.out.println("Key : " + getK() + ", Value: " + getV());
	}
}

public class Ex1 {

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("One", 1);
		Pair<Integer, String> p2 = new Pair<>(2, "Two");
		
		p1.display();
		p2.display();
	}

}

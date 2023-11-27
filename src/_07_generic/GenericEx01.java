package _07_generic;
import java.util.ArrayList;

class CustomList {
	
	ArrayList<String> list = new ArrayList<>();
	
	public void addElement(String element) {
		list.add(element);
	}
	public void removeElement(String element) {
		list.remove(element);
	}
	public String getElement(int idx) {
		return list.get(idx);
	}
	@Override
	public String toString() {
		return "Custom List " + list; 
	}
}

class GenericList<T> {
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element) {
		list.add(element);
	}
	public void removeElement(T element) {
		list.remove(element);
	}
	public T getElement(int idx) {
		return list.get(idx);
	}
	@Override
	public String toString() {
		return "Custom List " + list; 
	}
}

public class GenericEx01 {

	public static void main(String[] args) {
		CustomList li = new CustomList();
		li.addElement("1");
		li.addElement("2");
		li.addElement("3");
		System.out.println(li);

		li.removeElement("2");
		System.out.println(li);
		
		GenericList g = new GenericList<Integer>();
		g.addElement(4);
		g.addElement(5);
		g.addElement(6);
		System.out.println(g);
		
		g.removeElement(6);
		System.out.println(g);
	}
}






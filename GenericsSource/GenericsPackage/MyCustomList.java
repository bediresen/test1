package GenericsPackage;

import java.util.ArrayList;

public class MyCustomList<T extends Number> {
	
	ArrayList <T>list = new ArrayList<>();

	
	public void addElement(T str) {
		list.add(str);
	}
	
	public void removeElement(T elemetn) {
		list.remove(elemetn);
	}
	
	public String toString() {
		return list.toString();
	}
	
	public T get(int element) {
		return list.get(element);
	}
}

package GenericsPackage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GenericsRunner {
	
	static <X> X doubleValue(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
	list.addAll(list);	
	}
	
	static double sumOfNumberList(List<? extends Number> numbers) {
		double value = 0.0;
		for(Number number : numbers) {
			value += number.doubleValue();
		}
		return value;
		
	}
	public static void main(String[] args) {
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4)));
		System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1)));
		
		String str2 = doubleValue(new String());
		Integer num = doubleValue(Integer.valueOf(5));
		ArrayList list3 = doubleValue(new ArrayList());
		
		LinkedList<Integer> number = new LinkedList<>(List.of(1,2,3));
		duplicate(number);
		System.out.println(number);
		
 		
		
		MyCustomList<Long> list = new MyCustomList<>();
		
		list.addElement(5l);
		list.addElement(7l);
		Long value = list.get(0);
		System.out.println(value);
		MyCustomList <Integer>list2 = new MyCustomList<>();
		
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(7));
		System.out.println(list2.get(0));
		
	}

}

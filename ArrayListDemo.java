package week22_arrayList_problems;
import java.util.*;
public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(5);
		a1.add(7);
		a1.add(12);
		
		ArrayList<Integer> a3 = new ArrayList<Integer>(a1);
		a3.add(17);
		
		ArrayList<String> a2 = new ArrayList<String>(10);
		a2.add("Lorem ipsum dolor sit amet");
		a2.add(0, "consectetur adipiscing elit.");
		
		System.out.println("a1 = " + a1.toString());	
		System.out.println("a3 = " + a3.toString());
		System.out.println("a2 = " + a2.toString());
		
		System.out.println("size of a1: " + a1.size());
		System.out.println("is empty a2: " + a2.isEmpty());
		
		ArrayList<Integer> a4 = (ArrayList<Integer>) a1.clone();
		System.out.println("a4 = " + a4.toString());
		System.out.println("a1 == a4 ? " + (a1 == a4));
		a4.set(1, 777);
		System.out.println("a4 after set(1, 777): " + a4.toString());
		
		System.out.println("a4.get(0): " + a4.get(0));
		System.out.println("a4.contains(12): " + a4.contains(12));
		System.out.println("a4.indexOf(1234): " + a4.indexOf(1234));
		System.out.println("a4.lastIndexOf(777): " + a4.lastIndexOf(777));
		
		a4.add(777);
		System.out.println("a4.lastIndexOf(777): " + a4.lastIndexOf(777));
		
		a4.removeAll(a1);
		System.out.println("a4 after a4.removeAll(a1): " + a4.toString());
		
		a1.add(1);
		a1.add(5);
		System.out.println("Before sort: " + a1.toString());	
		Collections.sort(a1);
		System.out.println("After sorting ascending: " + a1.toString());
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("After sorting descending: " + a1.toString());	
	}
}

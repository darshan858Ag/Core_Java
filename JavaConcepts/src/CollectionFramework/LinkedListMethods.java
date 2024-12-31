package CollectionFramework;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add(12.87);
		list.add(true);
		list.add(45);
		list.add(null);
		list.add(12);
		list.add("abc");
		System.out.println(list);
		
		System.out.println(list.size());
		System.out.println(list.contains(12));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("abc"));
		System.out.println(list.lastIndexOf(12));
		
		
	}
}

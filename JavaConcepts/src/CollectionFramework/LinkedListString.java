package CollectionFramework;

import java.util.LinkedList;

public class LinkedListString {
public static void main(String[] args) {
	
	LinkedList<String> list=new LinkedList<String>();
	list.add("Apple");
	list.add("Mango");
	list.add("guava");
	list.add("Orange");
	list.add("Peach");
	
	System.out.println(list.contains("Pineapple"));
	System.out.println("elements at given index no is"+list.get(3));
	
	list.set(2, "Watermelon");
	list.remove(4);
	list.add("Peach");
	System.out.println("The index no of Mango is"+list.indexOf("Mango"));
	
	for(String s:list)
	{
		System.out.println(s);
	}
}
}

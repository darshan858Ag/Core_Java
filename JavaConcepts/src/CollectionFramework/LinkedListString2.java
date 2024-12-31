package CollectionFramework;

import java.util.LinkedList;


public class LinkedListString2 {
public static void main(String[] args) {
		LinkedList<String> a1=new LinkedList<String>();
		a1.add("Java");
		a1.add("By");
		a1.add("Kiran");
		a1.add("Kiran");
		a1.add(1,"By");
		a1.addLast("ram");
		System.out.println(a1.size());
		a1.set(0, "Rohan");
		System.out.println(a1.get(5));
		System.out.println(a1.indexOf("Kiran"));
		for(String s:a1)
		System.out.println(s);
	}
}


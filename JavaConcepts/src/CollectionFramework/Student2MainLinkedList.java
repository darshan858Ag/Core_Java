package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class Student2MainLinkedList {
public static void main(String[] args) {
	
	LinkedList<Student2> list=new LinkedList<Student2>();
	list.add(new Student2("Akash",101));
	list.add(new Student2("vidya",202));
	list.add(new Student2("Darshan",303));
	
	System.out.println(list);
	
	Iterator<Student2> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	LinkedList<Student2> list1=new LinkedList<Student2>();
	list1.add(new Student2("Nagin",404));
	list1.add(new Student2("Jiraf",505));
	
	list.addAll(list1);
	System.out.println(list);
	
}
}

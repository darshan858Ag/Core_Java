package CollectionFramework;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(40.22);
	a1.add(null);
	a1.add("Darsh");
	System.out.println(a1);
	
	System.out.println(a1.size());
	System.out.println(a1.contains("Darsh"));
	
	ArrayList a2=new ArrayList();
	a2.add(109);
	a2.add(204);
	a2.add(309);
	a2.addAll(a1);
	System.out.println(a2);
	
	Object o[]=new Object[a1.size()];
	a1.toArray(o);
	for(Object object:o)
	{
		System.out.println(object);
	}
	
	System.out.println(a1.get(3));
	System.out.println(a1.isEmpty());
	System.out.println(a1.indexOf(40.22));
	System.out.println(a1.lastIndexOf(40.22));
	System.out.println(a1.remove(2));
	a1.set(2,999);
	System.out.println(a1);
	a1.clear();
	System.out.println(a1);
}
}

package CollectionFramework;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetMethods {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	hs.add(100);
	hs.add("neetu");
	hs.add('q');
	hs.add(10.11);
	hs.add(null);
    hs.add(100);
	System.out.println(hs);
	System.out.println();
	
	HashSet<Integer> hs1=new HashSet<Integer>();
	hs1.add(101);
	hs1.add(333);
	hs1.add(987);
	hs.addAll(hs1);
	System.out.println(hs);
	
	hs.retainAll(hs1);
	System.out.println(hs);
	
	System.out.println(hs.size());
	System.out.println(hs.remove("neetu"));
	System.out.println(hs);
	
	
	System.out.println(hs.contains(333));
	System.out.println(hs.containsAll(hs1));
	
	//System.out.println(hs.removeAll(hs1));
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	
	Iterator itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	hs.clear();
	
	
}
}

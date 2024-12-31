package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingFor {
public static void main(String[] args) {
	
	ArrayList<String> list=new ArrayList<String>();
	list.add("Mango");
	list.add("Pineapple");
	list.add("Watermelon");
	list.add("Kukumber");
	
	// using for loop
	System.out.println("Technique 1 --> traversing elements with the help of for loop");
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	
	System.out.println("Technique 2 --> traversing elements with the help of each for loop");
	// using each for loop
	for(String s:list)
	{
		System.out.println(s);
	}
	
	System.out.println("Technique 3 --> traversing elements with the help of  iterator");
	// using iterator 
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}

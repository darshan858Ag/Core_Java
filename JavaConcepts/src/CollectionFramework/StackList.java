package CollectionFramework;

import java.util.Stack;

public class StackList {
public static void main(String[] args) {
	
	Stack st=new Stack();
	st.add(100);
	st.add(45.00);
	st.add("abc");
	st.add(null);
	System.out.println(st);
	
	st.push(66);
	st.push(77);
	System.out.println(st);
	
	st.pop();
	System.out.println(st);
	
	System.out.println(st.peek());
	
}
}

package strings;

public class StringBuffer2 {
public static void main(String[] args) {
	
	StringBuffer str1=new StringBuffer("hii");
	StringBuilder str2=new StringBuilder("hello");
	
	String str3=new String("Welcome");
	String str4=new String("everyone");
	
	System.out.println(str1.append(str2));
	System.out.println(str1.append(str3));
	
	System.out.println(str1.insert(1,"&&"));
	System.out.println(str1.insert(3,"&&"));
	
	System.out.println(str1.reverse());
	System.out.println(str2.reverse());
	
	System.out.println(str1.replace(1,2,"&&&"));
	System.out.println(str2.replace(1,3,"&&&"));
	
	System.out.println(str1.delete(1,2));
	System.out.println(str2.delete(1,3));
}
}

package strings;

public class StringBuffer1 {
public static void main(String[] args) {
	
	String s1="Darshan";
	
	StringBuffer s2=new StringBuffer("Shinde");
	System.out.println(s2);
	
	StringBuffer s3=new StringBuffer();
	System.out.println(s3.capacity());
	System.out.println(s3.length());
	
	s3.append("abc");
	System.out.println(s3.capacity());
	System.out.println(s3.length());
	
	s3.append("The Kiran Academy");
	System.out.println(s3.capacity());
	System.out.println(s3.length());
	
	s3.append("J");
	System.out.println(s3.capacity());
	System.out.println(s3.length());
	
	System.out.println(s3.charAt(3));
    System.out.println(s3.equals(s1));
    System.out.println(s3==s2);
    System.out.println(s3.isEmpty());
	System.out.println(s3.isEmpty());
	System.out.println(s3.indexOf("K"));
	System.out.println(s3);
	System.out.println(s3.substring(4));
	System.out.println(s3.substring(3,6));
	
}
}

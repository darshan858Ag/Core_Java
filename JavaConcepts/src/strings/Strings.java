package strings;

public class Strings {
public static void main(String[] args) {
	String str1="hello", str2="WORLD";
	System.out.println("concatenation using addition operator: "+(str1+str2));
	System.out.println("Concatenation using concat(): "+(str1.concat(str2)));
	System.out.println("UpperCase of :"+str1.toUpperCase());
	System.out.println("LowerCase of :"+str2+" is "+str2.toLowerCase());
	System.out.println(str1.length());
	System.out.println(str2.length());
	System.out.println(str1.charAt(3));
	System.out.println(str2.charAt(0));
}
}

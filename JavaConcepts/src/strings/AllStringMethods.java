package strings;

public class AllStringMethods {
public static void main(String[] args) {
	
	String str1="hello",str2="WORLD",str3="Hello everyone how are you";
	System.out.println("Concatination using addition operator: "+(str1+str2));
	System.out.println("Concatination using concat() "+(str1.concat(str2)));
	System.out.println("Uppercase of "+str1+" is "+str1.toUpperCase());
	System.out.println("Lowercase of "+str2+" is "+str2.toLowerCase());
	System.out.println(str1.length());
	System.out.println(str2.length());
	System.out.println(str1.charAt(3));
	System.out.println(str1.charAt(0));
	System.out.println(str1.indexOf("h"));
	System.out.println(str2.contains("hello"));
	System.out.println(str2.endsWith("D"));
	System.out.println(str2.startsWith("W"));
	System.out.println(str2.substring(0,3));
	System.out.println();
	String words[]=str3.split("\\s"); // each word in seperate line
	System.out.println("Each word in str3 is as follows: ");
	for(String w:words)
	{
		System.out.println(w);
	}
	System.out.println();
	System.out.println(str3.replace("Hello","Hii"));
	System.out.println(str1.isEmpty());
	System.out.println(str1.length());
	System.out.println(str3.replaceFirst("l","z"));
	System.out.println(str3.replaceFirst("o","z"));
	System.out.println(str3.trim());
	
}
}

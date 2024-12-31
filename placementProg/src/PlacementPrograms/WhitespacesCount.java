package PlacementPrograms;

import java.util.Scanner;

public class WhitespacesCount {
public static void main(String[] args) {
	
	String str;
	System.out.println("Enter a String");
	Scanner s=new Scanner(System.in);
	str=s.nextLine();
	int count=0;
	System.out.println("The Count of whitespaces is as follows");
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
		{
			count++;
		}
	}
	System.out.println(count);
	System.out.println("Before removing whitespaces");
	System.out.println(str);
	str=str.replaceAll(" ", "");
	System.out.println("After removing whitespace");
	System.out.println(str);
}
}

package Array;

import java.util.Scanner;

public class CheckVowels {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.err.println("Enter the size of array");
	int n=sc.nextInt();
	
	char ch[]=new char[n];
	System.out.println("Enter the elements of an array");
	for(int i=0;i<ch.length;i++)
	{
		ch[i]=sc.next().charAt(0);
	}
	
	System.out.println("Vowels in given Array is:");
	for(int i=0;i<ch.length;i++)
	{

		if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
		{
			System.out.println(ch[i]);
		}
	}
	System.out.println("Conaonents in given Array is:");
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i'&& ch[i]!='o'&& ch[i]!='u')
		{
			System.out.println(ch[i]);
		}
	}
}
}

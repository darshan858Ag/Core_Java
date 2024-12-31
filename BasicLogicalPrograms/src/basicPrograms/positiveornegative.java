package basicPrograms;

import java.util.Scanner;

public class positiveornegative {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of your choice");
	int n=s.nextInt();
	
	if(n>0)
	{
		System.out.println("number is positive");
	}
	else if(n==0)
	{
		System.out.println("The given number is zero");
	}
	else
	{
		System.out.println("The number is negative");
	}
}
}

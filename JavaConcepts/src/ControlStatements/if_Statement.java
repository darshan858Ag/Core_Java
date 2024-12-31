package ControlStatements;

import java.util.Scanner;

public class if_Statement {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number of your choice :");
	int num=s.nextInt();
	
	if(num%2==0)
	{
		System.out.println("The number is Even number :");
	}
	
	if(num%2!=0)
	{
		System.out.println("The number is Odd number :");
	}
}
}

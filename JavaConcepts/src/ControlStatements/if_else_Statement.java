package ControlStatements;

import java.util.Scanner;

public class if_else_Statement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first number :");
	int num1=s.nextInt();
	
	System.out.println("Enter Second number :");
	int num2=s.nextInt();
	
	System.out.println("Enter Third number :");
	int num3=s.nextInt();
	
	if(num1>num2)
		if(num1>num3)
		{
			System.out.println("First number is Greater :");
		}
		else
		{
			System.out.println("Third number is Grater");
		}
	else
	{
		if(num2>num3)
		{
			System.out.println("Second number is Greater");
		}
		else
		{
			System.out.println("Third number is Greater");
		}
	}
}
}

package conditionalstatements;

import java.util.Scanner;

public class ifelse1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of your choice:");
		int num1=sc.nextInt();
		
		if(num1%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}

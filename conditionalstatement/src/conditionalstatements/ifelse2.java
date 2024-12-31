package conditionalstatements;

import java.util.Scanner;

public class ifelse2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of your choice:");
		int num1=sc.nextInt();
		
		System.out.println("Enter number of your choice:");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("Num 1 is greater");
		}
		else
		{
			System.out.println("Num 2 is greater");
		}
	}
}

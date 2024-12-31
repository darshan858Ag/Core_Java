package conditionalstatements;

import java.util.Scanner;

public class elseif {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of your choice:");
		int num1=sc.nextInt();
		
		if(num1==0)
		{
			System.out.println("You have pressed zero");
		}
		
		else if(num1==1)
		{
			System.out.println("You have pressed one");
		}
		
		else if(num1==2)
		{
			System.out.println("You have pressed two");
		}
		
		else if(num1==3)
		{
			System.out.println("You have pressed three");
		}
		
		else if(num1==4)
		{
			System.out.println("You have pressed four");
		}
		
		else if(num1==5)
		{
			System.out.println("You have pressed five");
		}
		
		else if(num1==6)
		{
			System.out.println("You have pressed six");
		}
		
		else if(num1==7)
		{
			System.out.println("You have pressed seven");
		}
		
		else if(num1==8)
		{
			System.out.println("You have pressed eight");
		}
		
		else if(num1==9)
		{
			System.out.println("You have pressed nine");
		}
		
		else if(num1==10)
		{
			System.out.println("You have pressed ten");
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}

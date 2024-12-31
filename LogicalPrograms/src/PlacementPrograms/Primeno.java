package PlacementPrograms;

import java.util.Scanner;

public class Primeno {
public static void main(String[] args) {
	
Scanner s=new Scanner(System.in);
	
	System.out.println("Enter a number of your choice:");
	int n=s.nextInt();
	
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
		if(count==2)
		{
			System.out.println("No is prime no");
		}
		else
		{
			System.out.println("No is not prime no");
		}
	}
}


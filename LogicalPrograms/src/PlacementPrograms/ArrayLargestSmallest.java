package PlacementPrograms;

import java.util.Scanner;

public class ArrayLargestSmallest {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

int x[]=new int[10];
System.out.println("Enter 10 numbers");
for(int i=0;i<10;i++)
{
	x[i]=s.nextInt();
}
int large=x[0],small=x[0];
for(int i=1;i<x.length;i++)
{
	if(x[i]>large)
	
		large=x[i];
		if(x[i]<small);
		small=x[i];
}
	System.out.println("Largest is"+large);
	System.out.println("Smallest is"+small);
}
}


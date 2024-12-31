package Array;

import java.util.Scanner;

public class Arraysum {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter size of the array:");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
	
	System.out.println("The sum of all elements in an array is"+sum);
	System.out.println("Display the elements of an array");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}

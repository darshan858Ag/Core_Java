package Array;

import java.util.Scanner;

public class ArrayGreatest {
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter size of the array:");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("Enter elements of the array:");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int max=0;
	
	//largest element of array
	for(int i=0;i<a.length;i++)
	{
	    if(a[i]>max)
	    {
	    	max=a[i];
	    }
	}
	
	System.out.println("The largest of all elements in an array is :"+max);
	System.out.println("Display the elements of an array");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}


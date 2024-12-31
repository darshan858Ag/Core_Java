package Array;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of the array :");
		int size=sc.nextInt();
		
		int a[]=new int[size];
        System.out.println("Enter elements of an array:");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
        System.out.println("Display the elements of an array:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
	}
}

package Array;

import java.util.Scanner;

public class SumofAllElements {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row size");
	int rowsize=sc.nextInt();
	
	System.out.println("Enter col size");
	int colsize=sc.nextInt();
	
	int a[][]=new int[rowsize][colsize];
	System.out.println("Enter elements");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}	
		int sum=0;
		for( int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				sum=sum+a[i][j];
			}
		}
		
		
		System.out.println("sum of all elements is :"+sum);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		
	}
}
}



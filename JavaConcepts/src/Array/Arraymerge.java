package Array;

import java.util.Scanner;


public class Arraymerge {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//1st Array
		System.out.println("Enter the size of first array");
		int size1=sc.nextInt();
        int firstArray[]=new int [size1];
		System.out.println("Enter elements in first array");
		for(int i=0;i<firstArray.length;i++) 
		{
			firstArray[i]=sc.nextInt();
		}
		
		//2nd Array
				System.out.println("Enter the size of second array");
				int size2=sc.nextInt();
		        int secondArray[]=new int [size2];
				System.out.println("Enter elements in second array");
				for(int i=0;i<secondArray.length;i++) 
				{
					secondArray[i]=sc.nextInt();
				}
		
		//for merging 3rd array
				int thirdArray[]=new int[size1+size2];
				int index=0;
				
		//first array elements into third
				for(int i=0;i<firstArray.length;i++)
				{
					thirdArray[index++]=firstArray[i];
				}
		//second array elements into third
				for(int i=0;i<secondArray.length;i++)
				{
					thirdArray[index++]=secondArray[i];
				}	
				
				for(int i=0;i<thirdArray.length;i++)
				{
		         System.out.println(i+" "+thirdArray[i]);
				}
	}

		
		
		
	}


package basicPrograms;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		int arr[]= {1,56,75,87,20};
		System.out.println("Unsorted elements of an array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println();
		System.out.println("Sorted elements of an array in ascending order :");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Sorted elements of an array in descending order :");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int len=arr.length;
		System.out.println("Largest element of an array is:"+arr[len-1]);
		System.out.println("Second largest element of an array is:"+arr[len-2]);
		System.out.println("Smallest element of an array is:"+arr[0]);
	}

}

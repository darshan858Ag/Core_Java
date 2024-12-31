package Array;
import java.util.Scanner;
public class ArraySmallest {
		public static void main(String[] args) {
			
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of the array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter elements of an array:");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int min=a[0];
		
		//smallest element of array
		for(int i=0;i<a.length;i++)
		{
		    if(a[i]<min)
		    {
		    	min=a[i];
		    }
		}
		
		System.out.println("The smallest of all elements in an array is :"+min);
		System.out.println("Display the elements of an array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	}



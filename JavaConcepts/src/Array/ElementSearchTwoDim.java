package Array;

import java.util.Scanner;

public class ElementSearchTwoDim {

public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	int a[]= {1,2,3,4};
	
	System.out.println("Enter element to search");
	int search=s.nextInt();
	
	int i;
	for(i=0;i<a.length;i++)
	{
		if(a[i]==search)
		{
			System.out.println(search+" is present at index :"+(i+1));
			break;
		}
		
	}
	if(i==a.length)
	{
		System.out.println(search+" is not present at the list");
	}
	
	}
}

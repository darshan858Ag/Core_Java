package Array;

import java.util.Scanner;

public class ElementSearchScanner {
public static void main(String[] args) 
{
  Scanner s=new Scanner(System.in);
  
  System.out.println("Enter row size");
	int rowsize=s.nextInt();
	
	System.out.println("Enter col size");
	int colsize=s.nextInt();
  
  int a[][]=new int[rowsize][colsize];
  System.out.println("Enter elements");
  for(int i=0;i<a.length;i++)
  {
	  for(int j=0;j<a.length;j++)
	  {
		  a[i][j]=s.nextInt();
	  }
  }  
	  boolean found=false;
	  System.out.println("Elements to search");
	  int search=s.nextInt();
	  
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a.length;j++)
		  {
			 if(a[i][j]==search)
			 {
				 System.out.println(search+" :is present at index"+ i + "row&" + j+ "col");
				 found=true;
				 break;
			 }
		  }
		  
	  }
	  if(!found)
	  {
		  System.out.println(search+"is not present in the list");
	  }
  }
}



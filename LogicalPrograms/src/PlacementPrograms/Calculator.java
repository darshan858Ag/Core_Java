package PlacementPrograms;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number first to calculate Addition");
	int a=sc.nextInt();
	System.out.println("Enter number second to calculate Addition");
	int b=sc.nextInt();
	
     int result= a+b;
     System.out.println("Addition is :"+result);
     
     System.out.println("Enter number first to calculate substraction");
 	int a1=sc.nextInt();
 	System.out.println("Enter number second to calculate substraction");
 	int b1=sc.nextInt();
 	
      int result2= a1-b1;
      System.out.println("Substraction is :"+result2);
      
      System.out.println("Enter number first to calculate Multiplication");
  	int a2=sc.nextInt();
  	System.out.println("Enter number second to calculate Multiplication");
  	int b2=sc.nextInt();
  	
       int result3= a2*b2;
       System.out.println("Multiplication is :"+result3);
       
       System.out.println("Enter number first to calculate Division");
     	int a3=sc.nextInt();
     	System.out.println("Enter number second to calculate Division");
     	int b3=sc.nextInt();
     	
          int result4= a3/b3;
          System.out.println("Division is :"+result3);
       
       
     
     
}
}


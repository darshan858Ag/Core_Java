package basicPrograms;

import java.util.Scanner;

public class SumofDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	
	int sum=0,digit;
	while(n>0)
	{
		digit=n%10;
		sum=sum+digit;
		n=n/10;
	}
	System.out.println("Sum of digits is :"+sum);
}
}

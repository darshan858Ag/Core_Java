package basicPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	
	int rev=0,digit,temp;
	temp=n;
	while(n>0)
	{
		digit=n%10;
		rev=rev*10+digit;
		n=n/10;
	}
	if(temp==rev)
	{
	System.out.println("Number is a palindrome");
}
	else
	{
		System.out.println("Number is not a palindrome");
	}
}
}

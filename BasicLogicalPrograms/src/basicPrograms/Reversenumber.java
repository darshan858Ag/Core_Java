package basicPrograms;

import java.util.Scanner;

public class Reversenumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	
	int rev=0,digit;
	while(n>0)
	{
		digit=n%10;
		rev=rev*10+digit;
		n=n/10;
	}
	System.out.println("Reverse of the number is :"+rev);
}
}


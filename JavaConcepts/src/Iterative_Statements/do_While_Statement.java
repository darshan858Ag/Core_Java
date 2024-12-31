package Iterative_Statements;

import java.util.Scanner;

public class do_While_Statement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number of your choice :");
		int n=s.nextInt();
		int i=1;
		do
		{
			System.out.println(+n+"*"+i+"="+(n*i));
			i++;
		}
		while(i<=10);
	}
	}


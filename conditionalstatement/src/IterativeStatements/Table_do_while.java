package IterativeStatements;

import java.util.Scanner;

public class Table_do_while {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of your choice:");
		int num=sc.nextInt();
		int i=1;
		do
		{
			System.out.println(num+"x"+i+"="+(num*i));
			i++;
		}
		while(i<=10);
	}
}

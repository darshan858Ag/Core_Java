package Iterative_Statements;

import java.util.Scanner;

public class For_loop {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of your Choice");
		int n=s.nextInt();
   for(int i=1;i<=10;i++)
  {
	System.out.println(+n+"*"+i+"="+(n*i) );
   }
}
}

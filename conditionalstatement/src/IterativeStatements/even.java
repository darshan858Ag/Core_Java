package IterativeStatements;

public class even {
public static void main(String[] args) {
	System.out.println("even series:");
	for(int i=200;i<=300;i++)
	{
		if(i%2==0)
		{
			System.out.print(i+" ");
		}
	}
	
	System.out.println();
	System.out.println("odd series:");
	for(int i=200;i<=300;i++)
	{
		if(i%2!=0)
		{
			System.out.print(i+" ");
		}
	}
}
}

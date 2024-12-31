package basicPrograms;

public class MathpoW{
public static void main(String[] args)
{
	int n=10;
	int square1=n*n;
	System.out.println("Square of n is: "+square1);
	
	double square2=Math.pow(n, 2);
	System.out.println("Square of n is: "+square2+"By using math class");
	
	double cube=Math.pow(n, 3);
	System.out.println("Cube of n is: "+cube+"By using Math class");
	
}
}

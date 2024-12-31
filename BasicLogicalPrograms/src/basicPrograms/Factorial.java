package basicPrograms;

public class Factorial {
public static void main(String[] args) {
	
	int n=5,i,fact=1;
	 
	for(i=n;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println("The factorial of 5 is:"+fact);
}
}

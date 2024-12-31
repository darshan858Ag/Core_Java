package Methods;

public class assign1main {
public static void main(String[] args)
{
	assign1 a=new assign1();  // assign 1
	a.greetUser("Darshan");
	
	int sum=a.calculateSum(10,20); // assign 2
	System.out.println("The addition of n1 & n2 is:"+sum);
	
	int sub=a.calculateSub(58,20); // assign 3
	System.out.println("The substraction of n1 & n2 is:"+sub);
	
	int mul=a.calculateMultiply(5,2); // assign 4
	System.out.println("The multiplication of n1 & n2 is:"+mul);
	
	int Divide=a.calculateDivide(10,5); // assign 5
	System.out.println("The division of n1 & n2 is:"+Divide);
	
	int Mod=a.calculateMod(10,5); // assign 6
	System.out.println("The mod of n1 & n2 is:"+Mod);
	
	
	
}
}

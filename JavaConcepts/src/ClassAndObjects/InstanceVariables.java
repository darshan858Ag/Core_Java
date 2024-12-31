package ClassAndObjects;

public class InstanceVariables {
//Elements of a class
	//variables ->>instance variables / Global variables
	
	int num1=12;
	int num2=67;
	float num3=12.44f;
	double num4=78.44;
	char ch='q';
	boolean b=false;
	
	// statements is not allowed here
	
	public static void main(String[] args) {
		
		// creating object of InstanceVariable class
		InstanceVariables I=new InstanceVariables();
		System.out.println("The value of int variable is:"+I.num1);
		System.out.println("The value of int variable is:"+I.num2);
		System.out.println("The value of float variable is:"+I.num3);
		System.out.println("The value of double variable is;"+I.num4);
		System.out.println("The value of character is:"+I.ch);
		System.out.println("The value of a boolean variable is:"+I.b);
		
	}
}

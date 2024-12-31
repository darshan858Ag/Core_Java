package MethodOverloading;

public class Test {
//Method Overloading
	void add()
	{
		int num1=23;
		int num2=45;
		int res=num1+num2;
		System.out.println("The addition of 23 and 10 is:"+res);
	}
	void add(int num1)
	{
		int num2=10;
		int res=num1+num2;
		System.out.println("The addition of 10 and "+ num1 +"is:"+res);
	}
	
	void add(int num1,int num2)
	{
		int res=num1+num2;
		System.out.println("The addition of "+num1+ "and" +num2+"is:"+res);
	}
	
}

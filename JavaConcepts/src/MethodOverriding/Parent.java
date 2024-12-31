package MethodOverriding;

public class Parent {

	String name="Rahul";
	
	
	Parent()
	{
		System.out.println("Parent Class Constructor");
	}
	
	
	void operation(int num1,int num2)
	{
		System.out.println("Performing Addition:" + (num1+num2));
	}
	
	
}

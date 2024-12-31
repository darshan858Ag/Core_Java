package Superkeyword;

public class Parent {

	String text="Hello";
	int num=10;
	float number=12.44f;
	
	Parent()
	{
		System.out.println("Parent class constructor...");
	}
	
	void displayData()
	{
		System.out.println("Instance variables:" +text+" "+num+" "+number);
	}
}

package MethodOverriding;

public class Child extends Parent {
	
	String name="teena";
	
	void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	
	Child()
	{
		System.out.println("Child class Constructor");
	}
	
void operation(int num1,int num2) {
	System.out.println("Performing Multiplication: "+(num1*num2));
}
}

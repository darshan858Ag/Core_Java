package Inheritance;

public class ClassB extends ClassA {
	public void methodB()
	{
		System.out.println("Child clas method");
		
	}
	public static void main(String[] args) {
		ClassB obj=new ClassB();
		obj.methodA();
		obj.methodB();
	}

}

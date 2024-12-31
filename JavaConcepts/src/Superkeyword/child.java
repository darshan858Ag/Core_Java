package Superkeyword;

public class child extends Parent{

	child()
	{
		super();
		System.out.println("Child class constructor...");
	}
	
	void displayData(String text,int num,float number)//local
	{
		super.displayData();
		System.out.println("Local variables:" +text+" "+num+" "+number);
	}
	
}

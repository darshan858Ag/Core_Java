package InheritanceImpEx;

public class Parent extends GrandParent {

	int num1 = 10;
	float num2 = 15.55f;
	
	void display()
	{
		System.out.println("Hello display method...");
	}
	
	public Parent() {
		System.out.println("In Parent class constructor..");
	}
	
}

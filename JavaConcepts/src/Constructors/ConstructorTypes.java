package Constructors;

public class ConstructorTypes {
int roll;
String name;
int marks;

ConstructorTypes() //Default Non-parameterized Constructor
{
	System.out.println("Default Constructor called");
}

ConstructorTypes(int x, String y, int z)  //Parameterized Constructor
{
	System.out.println("Parameterized Constructor called");
	this.roll=x;
	this.name=y;
	this.marks=z;
	
}
void display()
{
	System.out.println("Student rollno is:"+roll);
	System.out.println("Student name is:"+name);
	System.out.println("Student mark is:"+marks);
}

public static void main(String[] args) {
	ConstructorTypes c1=new ConstructorTypes();
	c1.display();
	System.out.println("-------------------------------");
	ConstructorTypes c2=new ConstructorTypes(101,"Darshan",01);
	c2.display();
}


}

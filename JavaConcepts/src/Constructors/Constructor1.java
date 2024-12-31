package Constructors;

public class Constructor1 {

	String name;
	int id;
	
	Constructor1()
	{
		name=null;
		id=0;
		System.out.println("Default Constructor:"+name);
		System.out.println("Default Constructor:"+id);
	}
	
	Constructor1(String n,int i)
	{
		name=n;
		id=i;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
	}
}

package Constructors;

public class ConstructorOverloading {
	String name;
	int id;
	
	ConstructorOverloading()
{
		System.out.println("Zero parameterized Constructor....");
	name=null;
	id=0;
}
	
ConstructorOverloading(String name){
	System.out.println("One Parameterized Constructor....");
	this.name=name;
	
}

ConstructorOverloading(String name,int id)
{
	System.out.println("Two Parameterized Constructor");
	this.name=name;
	this.id=id;
}

@Override
public String toString() {
	return "ConstructorOverloading [name=" + name + ", id=" + id + "]";
}

public static void main(String[] args) {
	ConstructorOverloading c=new ConstructorOverloading();
	ConstructorOverloading c1=new ConstructorOverloading("Darshan");
	ConstructorOverloading c2=new ConstructorOverloading("Vidya",102);
	
	System.out.println(c1);
	System.out.println(c2);
}
}

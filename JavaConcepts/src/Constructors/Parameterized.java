package Constructors;

public class Parameterized {

	String name;
    int salary;
    int id;
	Parameterized(String s,int sal,int i )
	{
		name=s;
		salary=sal;
		id=i;
	}
	void display()
	{
		System.out.println("Name is :"+name);
		System.out.println("Salary is :"+salary);
		System.out.println("id is :"+id);
	}
	public static void main(String[] args) {
		Parameterized p=new Parameterized("Vidya",500000,001);
		p.display();
		Parameterized p2=new Parameterized("Darshan",500000,002);
		p2.display();
	}
}

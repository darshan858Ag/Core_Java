package Constructors;

public class Student {

	int rollno;
	String name;
	int marks;
	
	Student(int x, String y,int z)
	{
		System.out.println("Constructor Called");
		this.rollno=x;
		this.name=y;
		this.marks=z;
	}
	
	void display()
	{
		System.out.println("Student rollno is:"+rollno);
		System.out.println("Student name is:"+name);
		System.out.println("Student marks is:"+marks);
	}
	public static void main(String[] args) {
		
		Student s=new Student(101,"Shalaka",95);
		s.display();
	}
}

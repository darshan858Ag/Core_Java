package Constructors;

public class DefaultPara {

	String name;
	float salary;
	int id;
	
	public DefaultPara()//Default Constructor
	{
		System.out.println("Default Constructor Called.....");
	}
	
	DefaultPara(String s,float f,int i)//Parameterized Constructor
	{
		name=s;
		salary=f;
		id=i;
	}

	@Override
	public String toString() {
		return "DefaultPara [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	
	public static void main(String[] args)
	{
		DefaultPara d=new DefaultPara();
		DefaultPara d1=new DefaultPara("Darshan",10000,1);
		System.out.println(d1);
	}
}


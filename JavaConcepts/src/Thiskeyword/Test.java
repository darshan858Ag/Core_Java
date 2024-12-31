package Thiskeyword;

public class Test {

	String name="Priya";
	int i=10;
	
	Test()
	{
		System.out.println("Zero-args");
	}
	
	Test(int i)
	{
		System.out.println("one args");
		System.out.println(i);
	}
	
	void show()
	{
		System.out.println(name);
		System.out.println(i);
	}
	
	void show(String name,int i)
	{
		this.show();
		System.out.println(name);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		Test t1=new Test(2);
		t.show("Akash",20);
	}
}

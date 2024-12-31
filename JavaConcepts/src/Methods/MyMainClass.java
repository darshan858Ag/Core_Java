package Methods;

public class MyMainClass {
public static void main(String[] args) 
{
	
	MyClass1 obj=new MyClass1();
	obj.addition();
	obj.addition(2,6);
	int add=obj.addition(2, 2, 2);
	System.out.println("Addition of n1,n2 & n3 is:"+add);
	System.out.println(obj.substraction());
	System.out.println(MyClass1.multiplication(2,4));
}
}

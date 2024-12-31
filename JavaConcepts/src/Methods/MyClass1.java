package Methods;

public class MyClass1 {
	
	
	void addition()
	{
		//Type-1
		//methods with no return type
		int n1=12;
		int n2=24;
		
		int result=n1+n2;
		System.out.println("Addition is:"+result);
	}
	
	//Type-2
	//methods with no return type but with args
	void addition(int n1,int n2)
	{
		int result=n1+n2;
		System.out.println("Addition of n1&n2 is:"+result);
	}
	
	//Type-3
	//method with return type and with args
	int addition(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	
	//Type-4
	//method with return type but no args
	int substraction()
	{
		int n1=12;
		int n2=3;
		return n1-n2;
	}
	
	//Type-5
	//non instance methods / static methods
	
	static int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
}




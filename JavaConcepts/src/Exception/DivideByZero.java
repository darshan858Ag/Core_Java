package Exception;

public class DivideByZero {
	
	void division(int n1,int n2)
	{
		int result = n1/n2;
		
    
		try
		{
			System.out.println(result);
			throw new DivideByZeroException();
		}catch(DivideByZeroException e){
			System.out.println("Divide By Zero Exception Caught...");
	}
   
}
}


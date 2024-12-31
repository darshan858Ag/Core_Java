package Exception;

public class OutOfBounds {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5};
	
	try {
		System.out.println(a[2]);
		System.out.println(a[3]);
	}catch(ArithmeticException e) {
		System.out.println("Infinite...");
	}catch(IndexOutOfBoundsException e)
	{
		System.out.println("Index Out Of bounds....");
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		System.out.println("Program execute Successfully...");
	}
}
}

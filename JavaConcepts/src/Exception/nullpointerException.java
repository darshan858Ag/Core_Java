package Exception;

public class nullpointerException {
public static void main(String[] args) {
	
	String name=null;
	try
	{
		System.out.println(name.length());
	}catch(NullPointerException e)
	{
		System.out.println("String cannot be null");
	}
	
    }
}


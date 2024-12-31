package basicPrograms;
import java.util.Scanner;
public class AreaofCircle {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter radius of circle");
	float radius=s.nextFloat();
	

	float area=(float)Math.PI*radius*radius;
	System.out.println("Area is:"+area);
	
	float perimeter=(float)(2*(Math.PI)*radius);
	System.out.println("Perimeter of circle is:"+perimeter);
	
	}

}

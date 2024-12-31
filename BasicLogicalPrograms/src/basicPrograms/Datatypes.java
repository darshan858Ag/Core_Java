package basicPrograms;
import java.util.*;
public class Datatypes 
{
 public static void main(String[] args)
  {
	Scanner s=new Scanner(System.in);
   
	System.out.println("Enter Integer number");
	int num1=s.nextInt();
	System.out.println("Integer value is:"+num1);
	System.out.println();
	
	System.out.println("Enter double number");
	double num2=s.nextDouble();
	System.out.println("double value is:"+num2);
	System.out.println();
	
	System.out.println("Enter float number");
	float num3=s.nextFloat();
	System.out.println("Float value is:"+num3);
	System.out.println();
	
	System.out.println("Enter a String");
	String string=s.next();
	System.out.println("String value is:"+string);
	System.out.println("");
	
	System.out.println("Enter a character");
	char ch=s.next().charAt(0);
	System.out.println("Character value is:"+ch);
	
	System.out.println("Enter a boolean value");
	boolean bool=s.nextBoolean();
	System.out.println("Boolean value is:"+bool);
	}
}
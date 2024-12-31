package StaticConcepts;

public class Studentmain {
	public static void main(String[] args)
	{
		student s=new student();
		System.out.println("Roll no is:"+s.roll);
		System.out.println("name is:"+s.name);
		
		
     String name="kunal";  //local variable
     int num=20;  //local variable
     
     System.out.println("name is:"+name);
     System.out.println("int value is"+num);
     
     System.out.println("The value of Static variable is :"+student.number1);
	}

}

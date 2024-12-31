package Variables;

public class GlobalVariables {
int rollNo=101;        //Global Variable
String name="Darshan"; // Global Variable

public static void main(String[] args) {
	//Accessing instance/Global variables by Creating object of the class
	
	GlobalVariables G=new GlobalVariables();
	System.out.println("rollNo is :"+G.rollNo);
	System.out.println("Name is :"+G.name);
}
}

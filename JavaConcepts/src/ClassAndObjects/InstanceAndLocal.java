package ClassAndObjects;

public class InstanceAndLocal {
//instance
	int rollNo=101;
	String name="Reena";
	
	public static void main(String[] args) {
		//local
		String city="Pune";
		System.out.println(city);
		
		// accessing Global variables
		InstanceAndLocal il=new InstanceAndLocal();
		System.out.println("Roll No :"+il.rollNo);
		System.out.println("name :"+il.name);
	}
}

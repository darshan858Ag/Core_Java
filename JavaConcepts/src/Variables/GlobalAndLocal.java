package Variables;

public class GlobalAndLocal {

	int rollNo=201;
	String name="Vidya";
	
	public static void main(String[] args) {
		
		int rollNo=101;
		String name="Darshan";
		
		System.out.println("Name is :"+name);
		System.out.println("rollNo is :"+rollNo);
		
		
		GlobalAndLocal G=new GlobalAndLocal();
		System.out.println("Name is :"+G.name);
		System.out.println("rollNo is :"+G.rollNo);
	
	}
}

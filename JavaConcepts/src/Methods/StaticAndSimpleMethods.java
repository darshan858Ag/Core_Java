package Methods;

public class StaticAndSimpleMethods {

	void bagh()
	{
		System.out.println("Simple Method");
	}
	
	static void ghe()
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		StaticAndSimpleMethods s=new StaticAndSimpleMethods();
		s.bagh();
		
		StaticAndSimpleMethods.ghe();
	}
}

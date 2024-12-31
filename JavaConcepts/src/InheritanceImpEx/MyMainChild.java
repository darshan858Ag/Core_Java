package InheritanceImpEx;

public class MyMainChild {
public static void main(String[] args) {
	

	Child ch=new Child(); // Child Class object
	ch.display();     // Parent class method and Constructor Called
	System.out.println(ch.name); // child class String name
	System.out.println(ch.num1);  // parent class variable num1
	System.out.println(ch.num2);  // parent class variable num2
	System.out.println(ch.s+"  "+ch.id); // Grand parent class variables
	
	Child2 ch2=new Child2();
	System.out.println(ch2.s+"  "+ch2.id); //Grand parent class variable
	System.out.println(ch2.num1+"  "+ch2.num2); // parent class variable 1 and parent class variable 2
	
	
}
}

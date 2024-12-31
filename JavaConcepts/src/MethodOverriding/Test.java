package MethodOverriding;

public class Test {

	public static void main(String[] args) {
		
	//	Parent p=new Parent();
	//	p.operation(2, 5);
		
		Child ch=new Child();
		ch.operation(4, 2);
		ch.display();
	}
}

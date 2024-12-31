package Inheritance;

public class Z extends Y {
public void methodZ() {
	System.out.println("1st Child Class:");
}

public static void main(String[] args) {
	Z obj=new Z();
	obj.methodX();
	obj.methodY();
	obj.methodZ();
}
}

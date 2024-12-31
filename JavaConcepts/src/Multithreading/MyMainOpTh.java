package Multithreading;

public class MyMainOpTh {
public static void main(String[] args) {
	
	OpTh1 t1=new OpTh1();
	t1.setName("Th1");
	
	OpTh2 t2=new OpTh2();
	t2.setName("Th2");
	
	t1.start();
	t2.start();
}
}

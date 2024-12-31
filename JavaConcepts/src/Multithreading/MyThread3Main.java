package Multithreading;

public class MyThread3Main {
public static void main(String[] args) {
	
	MyThread3 t1=new MyThread3();
	Thread t11=new Thread(t1);
	

	MyThread3 t2=new MyThread3();
	Thread t22=new Thread(t2);
	

	MyThread3 t3=new MyThread3();
	Thread t33=new Thread(t3);
	
	t11.setName("First Thread");
	t22.setName("Second Thread");
	t33.setName("Third Thread");
	
	t11.setPriority(10);
	t22.setPriority(2);
	t33.setPriority(5);
	
	System.out.println(t11.isDaemon());
	System.out.println(t22.isDaemon());
	System.out.println(t33.isDaemon());
	
	t11.setDaemon(true);
	System.out.println(t11.isDaemon());
	System.out.println(t22.isDaemon());
	System.out.println(t33.isDaemon());
	
	t11.start();
	t22.start();
	t33.start();
}
}

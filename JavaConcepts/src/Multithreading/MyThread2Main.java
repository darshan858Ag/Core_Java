package Multithreading;

public class MyThread2Main {
public static void main(String[] args) {
	
	MyThread2 th1=new MyThread2();
	Thread t1=new Thread(th1);
	t1.start();
	
	MyThread2 th2=new MyThread2();
	Thread t2=new Thread(th1);
	t2.start();
	
	
}
}

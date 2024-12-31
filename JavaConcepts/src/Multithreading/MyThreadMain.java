package Multithreading;

public class MyThreadMain {
public static void main(String[] args) {
	
	MyThread thread1=new MyThread();
	thread1.start();
	
	System.out.println(Thread.currentThread().getName());
	
	MyThread thread2=new MyThread();
	thread2.start();
	
	
}
}

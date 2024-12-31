package Multithreading;

public class MyThread extends Thread{
	
	// ctr+space override method Thread
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello World"+Thread.currentThread().getName());
		}
		
	}

}

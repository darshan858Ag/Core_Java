package Multithreading;

public class MyThread3 implements Runnable{
	
@Override
public void run() {
	for(int i=0;i<5;i++)
	{
		try
		{
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName());
		}
		catch(InterruptedException e)
		{

		}
	}
	
}
}

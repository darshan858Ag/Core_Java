package Multithreading;

public class Demo {
 void printTable(int n)
{
	for(int i=0;i<10;i++)
	{
		{
			System.out.println(Thread.currentThread().getName()+ ":"+n+"*"+i+"="+(n*i));
		}
	}
}
}

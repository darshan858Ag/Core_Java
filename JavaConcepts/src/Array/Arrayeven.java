package Array;

public class Arrayeven {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	System.out.println("Even elements of an array");
	for(int i=0;i<a.length;i++)
	{
		int sum=0;
		if(a[i]%2==0)
		{
		 sum=sum+a[i];
		
		}
		System.out.println(+sum);
	}
}
}


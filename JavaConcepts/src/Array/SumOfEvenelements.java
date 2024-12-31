package Array;

public class SumOfEvenelements {
public static void main(String[] args) {
	
	int a[]={1,2,3,4,5};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
	  if( i%2==0)
	  {
		  sum=sum+a[i];
	  }
	}
	System.out.println("Sum of all even elements in an Array is: "+sum);
}
}

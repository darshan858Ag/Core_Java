package Array;

public class SumOfOddelements {
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		  if( a[i]%2!=0)
		  {
			  sum=sum+a[i];
		  }
		}
		System.out.println("Sum of all Odd elements in an Array is: "+sum);
	}
	}



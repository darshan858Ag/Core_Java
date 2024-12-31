package PlacementPrograms;

public class SwappingNumbers {

	static void swap(int m,int n)
	{
	m=m+n;
	n=m-n;
	m=m-n;
	System.out.println("Value of m is "+m+ "and value of n is "+n+" after swapping");
	}
	public static void main(String[] args) {
		int m=9,n=5;
		System.out.println("Value of m is "+m+" and value of n is"+n+" before swapping");
		swap(m,n);
	}
}

package Pattern;

public class AlphabetsCapital {
public static void main(String[] args) {
	
	int n=65;
	for(int i=1;i<=25;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)(i+n)+" ");
		}
		System.out.println();
	}
}
}
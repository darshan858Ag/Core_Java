package Pattern;

public class AlphabetsSmall {
	public static void main(String[] args) {
		
		int n=97;
		for(int i=1;i<=25;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(j+n)+" ");
			}
			System.out.println();
		}
	}
}

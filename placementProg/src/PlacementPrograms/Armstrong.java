package PlacementPrograms;

public class Armstrong {
public static void main(String[] args) {
	
	int n=153,sum=0,digit;
	int temp=n;
	while(n>0)
	{
		digit=n%10;
		sum=sum+(digit*digit*digit);
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println(" It is a Armstrong number");
	}
	else
	{
		System.out.println("It is not a Armstrong number");
	}
	
}
}

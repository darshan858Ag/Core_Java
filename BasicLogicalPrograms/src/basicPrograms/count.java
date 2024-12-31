package basicPrograms;

public class count {
public static void main(String[] args) {
	
	//n=1234 -> count=4
	int n=1234, count=0;
	while(n>0)
	{
		n=n/10;
		count++;
	}
	System.out.println("Count of digits in number is : "+count);
}
}

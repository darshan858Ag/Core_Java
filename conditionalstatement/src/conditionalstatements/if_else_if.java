package conditionalstatements;
import java.util.Scanner;
public class if_else_if {
public static void main(String[] args) {
	System.out.println("Enter number of your choice:");
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  if(n%5==0)
  {
	  if(n%3==0)
	  {
		  System.out.println(+n+":is divisible by 3 and 5");
	  }
	  else
	  {
		  System.out.println(+n+":is not divisible by 3"); 
	  }
  }
	  else
	  {
		  System.out.println(+n+":is not divisible by 5"); 
	  }
  }
}


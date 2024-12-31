package PlacementPrograms;

import java.util.Scanner;

public class DigitToWord {
public static void main(String[] args) {
	
int r,n,num;
String digitWords= "";
Scanner s=new Scanner(System.in);

System.out.println("Enter number");
n=s.nextInt();// n=123

num=n; //num=123
while(num>0) //123>0 /12>0 -> True 0>0 -> False
{
	r=num%10; //r=1 %10 /r=1
	
	switch(r)
	{
	case 0: digitWords= "Zero" + digitWords; break;
	case 1: digitWords= "One" + digitWords; break;
	case 2: digitWords= "Two" + digitWords; break;
	case 3: digitWords= "Three" + digitWords; break;
	case 4: digitWords= "Four" + digitWords; break;
	case 5: digitWords= "Five" + digitWords; break;
	case 6: digitWords= "Six" + digitWords; break;
	case 7: digitWords= "Seven" + digitWords; break;
	case 8: digitWords= "Eight" + digitWords; break;
	case 9: digitWords= "Nine" + digitWords; break;
	
	}
	num=num/10;
}
System.out.println("Digit="+n);
System.out.println("Words="+digitWords);
}
}

package PlacementPrograms;

public class ReverseString {
public static void main(String[] args) {
	
	String str="hello";
	System.out.println("Origional String is:");
	for(int i=0;i<str.length();i++)
	{
		System.out.print(str.charAt(i));
	}
	System.out.println();
	int len=str.length();
	System.out.println("Reverse of string is:");
	for(int i=len-1;i>=0;i--)
	{
		System.out.print(str.charAt(i)+" ");
	}
}
}

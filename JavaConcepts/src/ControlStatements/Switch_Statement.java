package ControlStatements;
import java.util.Scanner;
public class Switch_Statement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Check wether the character is a vowel of consonant :");
	System.out.println("Enter a Character :");
	char ch=s.next().charAt(0);
	
	switch(ch)
	{
	case 'a':
		System.out.println("It is a Vowel");
		break;
		
	case 'e':
		System.out.println("It is a Vowel");
		break;
		
	case 'i':
		System.out.println("It is a Vowel");
		break;
		
	case '0':
		System.out.println("It is a Vowel");
		break;
		
	case 'u':
		System.out.println("It is a Vowel");
		break;
		
	case 'A':
		System.out.println("It is a Vowel");
		break;
		
	case 'E':
		System.out.println("It is a Vowel");
		break;
		
	case 'I':
		System.out.println("It is a Vowel");
		break;
		
	case 'O':
		System.out.println("It is a Vowel");
		break;
		
	case 'U':
		System.out.println("It is a Vowel");
		break;
		
		default:
			System.out.println("It is a Consonant");
	}
	
}
}

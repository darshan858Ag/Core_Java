package conditionalstatements;

public class Vowel_Switch {
	public static void main(String[] args)
	{
		char ch='x';
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is a Vowel");
			break;
			default:
				System.out.println("It is a consonant");
			
		
		}
	}
}

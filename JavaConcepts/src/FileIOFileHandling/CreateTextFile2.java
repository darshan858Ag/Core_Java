package FileIOFileHandling;

import java.io.File;
import java.io.IOException;

public class CreateTextFile2 {
	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\FileiO\\javaFiles\\TextFile2.text");
		if(f1.createNewFile())
		{
			System.out.println("File Created Successfully...!!");
		}
		else
		{
			System.out.println("File is already existing");
		}
	}
	}


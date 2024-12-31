package FileIOFileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFile2 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Reading contents in TextFile2");
		int ch;
		FileReader fr=new FileReader("D:\\FileiO\\javaFiles\\TextFile2.text");
		while((ch=fr.read())!=-1)
		System.out.print((char)ch+" ");
		fr.close();
	}
	}



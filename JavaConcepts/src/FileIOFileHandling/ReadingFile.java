package FileIOFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
public static void main(String[] args) throws IOException {
	
	File file=new File("D:\\FileiO\\javaFiles\\MyFile.text");
	FileReader fr=new FileReader(file);
	BufferedReader reader=new BufferedReader(fr);
	String text;
	while((text=reader.readLine())!=null)
	{
		System.out.println(text);
	}
	reader.close();
}
}

package FileIOFileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class createTextFile {
public static void main(String[] args) throws IOException {
	
	String myContent="This is my data which needs to be stored into the Text file";
	File file=new File("D:\\FileiO\\javaFiles\\MyFile.text");
	FileOutputStream fos=new FileOutputStream(file);
	if(!file.exists())
	{
		file.createNewFile();
	}
	byte myArray[]=myContent.getBytes();
	fos.write(myArray);
	fos.flush();
	System.out.println("File written successfully");
	fos.close();
}
}

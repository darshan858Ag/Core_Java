package FileIOFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTextFile2 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Writing contents into the File1.text");
		String text="How Are You";
		File f1=new File("D:\\FileiO\\javaFiles\\TextFile2.text");
		FileWriter fr=new FileWriter(f1,true);
		BufferedWriter br=new BufferedWriter(fr);
		br.write(text);
		br.close();
		fr.close();
		
		System.out.println("Contents written into the file");
	}
	}


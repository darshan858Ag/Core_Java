package FileIOFileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class ConcatenateFile1andFile2 {
public static void main(String[] args) throws IOException {
	
	String path1="D:\\FileiO\\javaFiles\\TextFile1.text";
	String path2="D:\\FileiO\\javaFiles\\TextFile2.text";
	
	FileInputStream input1=new FileInputStream(path1);
	FileInputStream input2=new FileInputStream(path2);
	
	SequenceInputStream inst=new SequenceInputStream(input1,input2);
	int j;
	while((j=inst.read())!=-1){
	System.out.print((char)j+" ");
}
inst.close();
input1.close();
input2.close();
}
}

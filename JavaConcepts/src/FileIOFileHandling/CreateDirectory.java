package FileIOFileHandling;

import java.io.File;

public class CreateDirectory {
public static void main(String[] args) {
	System.out.println("Create new Folder javaFiles in FileiO");
	String one="D:\\FileiO\\javaFiles";
	File file=new File(one);
	if(!file.exists())
	{
		if(file.mkdir())
		{
			System.out.println("Directory Created");
		}
	}
		else
		{
			System.out.println("Directory with same name is existing");
	     }
}
}



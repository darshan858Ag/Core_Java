package FileIOFileHandling;

import java.io.File;

public class CreateFolders {
	public static void main(String[] args) {
		System.out.println("Create different Folders  javaFiles in FileiO");
		String one="D:\\FileiO\\javaFiles\\Folder1";
		File file=new File(one);
		if(!file.exists())
		{
			if(file.mkdir())
			{
				System.out.println("Directories Created");
			}
		}
			else
			{
				System.out.println("Directory with same name is existing");
		     }
	}
	}



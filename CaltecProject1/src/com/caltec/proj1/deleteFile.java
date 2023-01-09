package com.caltec.proj1;

import java.io.File;
import java.util.Scanner;

public class deleteFile {
	public boolean deletingFile(String path)
	{
			//String path="D:\\caltech\\";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the file name to be deleted");
			String filename=sc.next();
			String finalpath=path+filename;
			System.out.println(finalpath);
			
			File file=new File(finalpath);
			//delete operation
			file.delete();
			System.out.println("file gets deleted");
			return true;
	}
	
			
		

	}







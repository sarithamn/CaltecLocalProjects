package com.caltec.proj1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class deleteFile {
	public boolean deletingFile(String path)throws IOException 
	{
		//String path="D:\\caltech\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name to be deleted");
		String filename=sc.next();
		String finalpath=path+filename;
		System.out.println(finalpath);

		File file=new File(finalpath);
		//delete operation
		boolean deleted=file.delete();
		if(deleted)
			System.out.println("file gets deleted");
		else
			System.out.println("file cannot be deleted");
		return true;
	}




}







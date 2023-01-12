package com.caltec.proj1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class addNewFile {

	public boolean addingNewFile(String path) throws IOException 
	{
		System.out.println("INSIDE adding new file FUNCTION");
		//	String path="C:\\caltech\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name to create: ");
		String filename=sc.next();
		String finalpath=path+filename;
		System.out.println(finalpath);
		//create a file
		File file=new File(finalpath);

		boolean res = false;
		try {
			res = file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res!=true) {
			System.out.println("Sorry file is not created");
		}
		else {
			System.out.println("File is created Successfully ");
		}
		return true;
	}

}

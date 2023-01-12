package com.caltec.proj1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class searchFile {

	public boolean searchingFile(String path)throws IOException {
		//String path="D:\\caltech\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file to search");
		String filenamesearch=sc.next();
		File file=new File(path
				);

		//display operation
		File filename[]=file.listFiles();

		//for-each
		int flag=0;
		if(filename!=null)
		{for(File ff:filename) {
			if(ff.getName().equals(filenamesearch)) {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		}

		if(flag==1) {
			System.out.println("file is found");
		}
		else {
			System.out.println("file is not found");
		}


		return true;


	}

}


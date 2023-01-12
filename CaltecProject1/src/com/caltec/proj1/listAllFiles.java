package com.caltec.proj1;

import java.io.File;

public class listAllFiles {


	public boolean listingFiles(String path)
	{
		//display the files in an ascending order




		//String path="D:\\caltech\\";
		File file=new File(path);
		//display operation
		File filename[]=file.listFiles();
		if(filename.length!=0)
		{//for-each
			System.out.println("the list of files in asscending order in the "+ path +"is");
			for(File ff:filename) {
				System.out.println(ff.getName());
			}
		}
		else
		{
			System.out.println("Sorry there are no files existing in this "+ path );
		}


		return true;
	}

}

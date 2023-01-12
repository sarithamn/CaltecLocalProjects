package com.caltech.file.project;

import java.io.IOException;
import java.util.Scanner;

import com.caltec.proj1.addNewFile;
import com.caltec.proj1.deleteFile;
import com.caltec.proj1.listAllFiles;
import com.caltec.proj1.searchFile;

public class mainmenu {


	public static void main(String[] args) {


		System.out.println("----------------------------------------LockedMe.com--------------------------------------");
		System.out.println("Developer: SARITHA M N");
		System.out.println("Guide line to user: You are provided with a  Menu driven interface.Select option number to accomplish the task");
		System.out.println( "Hit 1 to show all available files in asc order");
		System.out.println( "Hit 2 to get sub menu for file operations: Sub menu can be exited by choosing 4");
		System.out.println( "hit 3 to exit the application ");
		System.out.println(">>>>>>>>>>>>>>>>>>>> Main MENU.");
		System.out.println("1. SHOW ALL FILES IN ASCENDING ORDER");
		System.out.println("2.>>>>>>>>>>>>> SUB MENU.");
		System.out.println("      1. Add files.");
		System.out.println("      2. Delete files");
		System.out.println("      3. Search the file");
		System.out.println("      4. Exit");
		System.out.println("3.Exit the Application");
		while(true)
		{
			System.out.println("Enter your MAIN MENU choice(Any Number between 1 to 3)");
			Scanner sc=new Scanner(System.in);

			int ch = 0;
			try {
				ch = sc.nextInt();
			} catch (Exception e2) {
				System.out.println("  You have entered an invalid NUMBER.Please enter a number from [1,2,3]");

			}
			switch (ch) {
			case 1: {
				System.out.println("-- SHOWING ALL FILES IN ASCENDING ORDER from path C:\\Users\\hp\\Documents\\GitHub\\CalteccProjects\\--");
				String path="C:\\Users\\hp\\Documents\\GitHub\\CalteccProjects\\";
				new listAllFiles().listingFiles(path);
				break;}

			case 2: {
				int chSub = 0;
				do{
					System.out.println("2.Enter SUB MENU Choice (Any Number between 1 to 4)");
					try {
						chSub=sc.nextInt();
					} catch (Exception e1) {
						System.out.println("  You have entered an invalid NUMBER.Please enter a number from [1,2,3,4]");
					}

					switch (chSub) {
					case 1: {
						System.out.println("      1.Adding New files.");
						System.out.println(" Enter file path from existing file path sample C:\\caltech\\");
						String filePath=sc.next();
						try {
							new addNewFile().addingNewFile(filePath);
						} catch (IOException e) {
							System.out.println("  You have entered an invali NUMBER.Please enter a number from [1,2,3,4]");
						}
						break;
					}
					case 2: {
						System.out.println("      2.Deleting files");
						System.out.println( "Enter a valid file path from existing directory for example: C:\\Users\\hp\\Documents\\GitHub\\CalteccProjects\\");
						String filePath=sc.next();
						try {
							new deleteFile().deletingFile(filePath);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
					case 3: {
						System.out.println("      3.Searching the file");
						System.out.println(" Enter file path from existing file paths sample C:\\caltech\\");
						String filePath=sc.next();
						try {
							new  searchFile().searchingFile(filePath);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}
					case 4:
					{
						System.out.println("      4.Exitting to main menu..");
						break;
					}

					default:
						System.out.println(" Invalid!! ");
						break;

					}
				}while(chSub!=4);


				break;	
			}

			case 3: 
				System.out.println(".....................Exitting LockedMeApp-Thank you....................");

				System.exit(ch);
			default:
				System.out.println(" Invalid!!");
				break;


				//						}	default:
				//						
				//						//throw new IllegalArgumentException("Unexpected value: " + ch);
				//	
				//								default:
				//									
				//									//throw new IllegalArgumentException("Unexpected value: " + chSub);
				//									
				//								
				//							}

			}



		}

	}
}

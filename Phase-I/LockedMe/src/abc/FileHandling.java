package abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	public static void AddFile(String FolderName) throws IOException {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the name of the file you want to create :");
		String filename=Sc.nextLine();
	
		File file=new File(FolderName+"\\"+filename);
		if(file.exists()) {
			System.out.println("This File already exist ,Cant craete ");
			OtherOperations(FolderName);
		}else {
			FileOutputStream fos = new FileOutputStream(FolderName+"\\"+filename);
			System.out.println("File successfully craeted");
			OtherOperations(FolderName);
		}
	
	}
	
	public static void DeleteFile(String FolderName) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the name of the file you want to delete :");
		String filename=Sc.nextLine();
		
		File file=new File(FolderName+"\\"+filename);
		
		if (file.delete()) {
            System.out.println("File deleted successfully");
            OtherOperations(FolderName);
        }
        else {
            System.out.println("Failed to delete the file");
            OtherOperations(FolderName);
        }
	}
	
	public static void SearchFile(String FolderName) throws IOException {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the name of the file you want to search and open :");
		String filename=Sc.nextLine();
		
		File file=new File(FolderName+"\\"+filename);
		if(file.exists()) {
			BufferedReader br= new BufferedReader(new FileReader(FolderName+"\\"+filename));
			
			String st;
			while((st=br.readLine()) != null){
				System.out.println(st);
			}
			OtherOperations(FolderName);
		}else {
			System.out.println("Entered file name doesnot exist");
			OtherOperations(FolderName);
		}
	}
	
	public static void MainMenu() {
		main(null);
	}
	public static void OtherOperations(String FolderName) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 1 to add specified file :");
		System.out.println("Enter 2 to delete specefied file : ");
		System.out.println("Enter 3 to search specefied file :");
		System.out.println("enter 4 number to go back to main menu :");
		try {
			int res=Sc.nextInt();
			if(res==1) {
				AddFile(FolderName);
			}else if(res==2) {
				DeleteFile(FolderName);
			}else if(res==3) {
				SearchFile(FolderName);
			}else if(res==4) {
				MainMenu();
			}else {
				System.out.println("Wrong input! ,please try again");
				OtherOperations(FolderName);
			}
		}catch(Exception e) {
			System.out.println("Wrong input! ,please try again");
			OtherOperations(FolderName);
		}
	}
	
	public static void MainOperations(String FolderName) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 1 to perform more operation enter 2 to exit the application :");
		try {
			int res=Sc.nextInt();
			
			if(res==1) {
				OtherOperations(FolderName);
			}else if(res==2) {
				System.out.println("Application existed");
				System.exit(0);
			}else {
				System.out.println("Wrong input ! please try again");
				MainOperations(FolderName);
			}
		}catch(Exception e) {
			System.out.println("Wrong input !Please Try again");
			MainOperations(FolderName);
		}
	}
	public static void Bubblesort(String FilesArray[]) {
		String temp;
		for(int j=0;j<FilesArray.length;j++) {
			for(int i=j+1;i<FilesArray.length;i++) {
				if (FilesArray[i].compareTo(FilesArray[j])<0) {
					temp=FilesArray[j];
					FilesArray[j]=FilesArray[i];
					FilesArray[i]=temp;	
				}
			}
		}
	}
	
	public static void ListOfFiles(String FolderName) {
		//Creating a file object for the directry
		File DirPath = new File(FolderName);
		
		//List of all files in unsorted order
		String FilesArray[] = DirPath.list();
		
		//now we will call the userdefined sorting function 
		Bubblesort(FilesArray);
		
		//Now we will print file one by one using for loop
		for(int i=0;i<FilesArray.length;i++) {
			System.out.println(FilesArray[i]);
		}
		
	}
	

	public static void main(String[] args) {
		String FolderName="F:\\Test Dir";
		
		System.out.println("Welcome to LockedMe.com ");
		
		System.out.println("This application is devloped by Kumar Souvik Saha emp id-2497275");
		System.out.println("----------------------------------------------------------------");
		System.out.println("****************************************************************");
		
		System.out.println("The Lists of files are");
		ListOfFiles(FolderName);
		System.out.println("****************************************************************");
		MainOperations(FolderName);
		
		
	}	 

}

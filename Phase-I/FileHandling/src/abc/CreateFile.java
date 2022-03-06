package abc;

import java.util.Scanner;
import java.io.*;

public class CreateFile {
	
	public static void ReadFile(String filename) throws Exception{
		BufferedReader br= new BufferedReader(new FileReader(filename));
		
		String st;
		while((st=br.readLine()) != null){
			System.out.println(st);
		}
	}
	public static void DeleteFile(String filename) {
		File file=new File(filename);
		if (file.delete()) {
            System.out.println("File deleted successfully");
        }
        else {
            System.out.println("Failed to delete the file");
        }
	}
	
	public static void main(String[] args)throws Exception {
		
		DataInputStream dis = new DataInputStream(System.in);
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the file you wanta to create :");
		String filename=Sc.nextLine();
		
		File file=new File(filename);
		if(file.exists()) {
			System.out.println("THE ENTERED FILENAME ALREADY EXIST");
			System.out.println("1- Press 1 to read the file ");
			System.out.println("2- Press 2 to delete the file ");
			int Res=Sc.nextInt();
			if(Res==1) {
				ReadFile(filename);
			}else if(Res==2) {
				DeleteFile(filename);
			}
		}else {
			FileOutputStream fos = new FileOutputStream(filename,true);// append the data
			System.out.println("File created Enter the data,press @ to stop entering data :");
			int ch;
			while((ch=dis.read()) != '@') {
					fos.write(ch);			// automatically convert 
			}
			fos.close();
			System.out.print("File successfully craeted");
		}
		

	}

}

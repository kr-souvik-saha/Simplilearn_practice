package abc;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		final String pattern="(\\S.*\\S)(@)(\\S.*\\S)(.\\S[a-z]{2,3})";
		System.out.println("Enter your email");
		String email=Sc.nextLine();
		
		if(email.matches(pattern)) {
			System.out.println("Valid email");
		}else {
			System.out.println("Invalid Email");
			
		}
		
	}

}

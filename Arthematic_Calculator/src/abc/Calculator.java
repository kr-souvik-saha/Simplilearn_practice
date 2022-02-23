package abc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1;
		double num2;
		double answer;
		char operator;
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("This is your personal calculator");
		
		System.out.println("Enter 1st number :");
		num1= Sc.nextDouble();
		
		System.out.println("Enter 2nd number :");
		num2=Sc.nextDouble();
		
		System.out.println("Enter the operater(enter only single opereter +,-,/,*) :");
		operator = Sc.next().charAt(0);
		
		if(operator=='+') {
			answer=num1+num2;
		}else if(operator=='-'){
			answer = num1-num2;
		}else if(operator == '*') {
			answer= num1*num2;
		}else if(operator == '/') {
			answer =num1/num2;
		}else {
			System.out.println("Error! You have entered wrong opertaor");
			return ;
		}
		System.out.println("The result is :"+answer);

	}

}

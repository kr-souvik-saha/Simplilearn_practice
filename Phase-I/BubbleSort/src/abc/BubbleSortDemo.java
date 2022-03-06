package abc;

import java.util.Scanner; 

class BubbleSortDemo {

	public static void main(String[] args) {
		Scanner Sc =new Scanner(System.in);
		int[] array=new int[10];
		// First we will take array input from user
		System.out.println("Enter the unordered array of length 10 :");
		for(int i=0;i<10;i++) {
			array[i]=Sc.nextInt();
		}
		
		System.out.println("The entered array is");
		for(int i=0;i<10;i++) {
			System.out.println(array[i]);
		}
		
		for(int i=0;i<10;i++) {
			for(int j=1;j<9;j++) {
				 if(array[j-1] > array[j]){  
                     //swap elements  
                     int temp = array[j-1];  
                     array[j-1] = array[j];  
                     array[j] = temp;  
				}
			}
		}
		
		System.out.println("The sorted array is");
		for(int i=0;i<10;i++) {
			System.out.println(array[i]);
		}
		 
	}

}

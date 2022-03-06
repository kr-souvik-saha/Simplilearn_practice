package abc;

public class OrderStatastic {
	public static void BubbleSort(int array[]) {
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
	}
	
	public static int NthhSmallest(int array[],int n) {
		 return array[n-1];
	}

	public static void main(String[] args) {
		int array[]= {7,3,9,1,12,5,17,4,10,2};
		BubbleSort(array);
		int res=NthhSmallest(array, 4);
		System.out.println(res);

	}

}

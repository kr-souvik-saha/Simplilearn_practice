package abc;

public class TryAndCatch {

	public static void main(String[] args) {
		System.out.println("Line 1");
		int a=10;
		int b=0;
		int arr[]= {1,2,3,4,5};
		try {
			int res=a/b;
			System.out.println("Res"+res);
		}catch(Exception e) {
			System.out.println("this was the exception :"+e.toString());
		}
		try {
			int x=arr[5];
			System.out.println("array of index 5 is"+x);
		}catch(Exception e) {
			System.out.println("There was an exception :"+e.toString());
		}
		System.out.println("Line 2");

	}

}

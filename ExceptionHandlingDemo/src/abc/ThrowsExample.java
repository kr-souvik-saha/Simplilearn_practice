package abc;

public class ThrowsExample {
	
	static void dis1() throws Exception {
		int a=10/0;
		System.out.println("This is dis1 method");
	}
	static void dis2() throws Exception{
		dis1();
		System.out.println("This is dis2 method");
	}

	public static void main(String[] args) {
		try {
			dis2();
		}catch(Exception e) {
			
		}
		System.out.println("This is main method");

	}

}

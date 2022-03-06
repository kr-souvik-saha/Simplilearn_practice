package abc;

public class TryWithMultipleCatchblock {

	public static void main(String[] args) {
		int abc[]= {10,20};
		String str ="a10";
		try {
			int a=10/0;
			int b=10/abc[3];
			int sum=10+Integer.parseInt(str);
		}catch(ArithmeticException e) {
			System.out.println("Divided by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index");
		}catch(Exception e) {
			System.out.println("Generic Exception");
		}
		System.out.println("Finish");

	}

}

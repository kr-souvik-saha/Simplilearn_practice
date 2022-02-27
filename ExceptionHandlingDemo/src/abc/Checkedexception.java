package abc;

public class Checkedexception {
	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		System.out.println("hello");
	}

}

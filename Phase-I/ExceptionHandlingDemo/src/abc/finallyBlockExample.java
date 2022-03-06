package abc;

public class finallyBlockExample {

	public static void main(String[] args) {
		 try {
			 int a=10/0;
			 System.out.println("No Exception");
		 }catch(Exception e) {
			 System.out.println("Catch Block");
		 }finally{
			 System.out.println("Finally");
		 }

	}

}

package abc;

class MyException extends Exception{
	public MyException() {
		
	}
	public MyExceptioon(String msg) {
		super(msg);
	}
}

public class ThrowKeyword {
	 public static void main(String[] args) {
		 int a=10;
		 int b=5;
		 try {
			 if(a>b) {
				 throw new MyException("a>b");
			 }
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }

}

package abc;

public class StringBuff {

	public static void main(String[] args) {
		//String Buffer
				StringBuffer buffer =new StringBuffer("Hello World");
				buffer.append("Java");
				System.out.println(buffer);
				buffer.delete(1,4);
				System.out.println(buffer);
				buffer.reverse();
				System.out.println(buffer);
				
				//String Builder
				StringBuilder builder =new StringBuilder("Hello World");
				builder.append("Java");
				System.out.println(builder);
				builder.delete(1,4);
				System.out.println(builder);
				builder.reverse();
				System.out.println(builder);


	}

}

package exceptionHandling;

public class ArithmaticException1 {

	public static void main(String[] args) {

		int a=10;
		int b=0;
		int c;
		
		try
		{
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)  // Capital E of exception...
		{
			System.out.println(e);
		}
		System.out.println("Hellow world");
	}

}

package exceptionHandling;

public class FirstClassInException {

	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		try {
		System.out.println(2/0);
		}
		
		catch(Exception e)
		
		
		{
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("a");
		}
	}

}

package exceptionHandling;
import java.io.FileInputStream;
public class Test1 {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream fis = new FileInputStream("G:/mno.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Hello world"); // this statement is used for checking whether program is successfuly run or not
	}

}

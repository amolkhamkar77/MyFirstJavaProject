package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MultipleCatch {

	public static void main(String[] args) {

		try
		{
			System.out.println("0");
			FileInputStream fis = new FileInputStream("G:/mno.txt");
		}
		catch(Exception e)
		{
			System.out.println("1");
			e.printStackTrace();      // it will give details of exception
			System.out.println("2");
		}
		System.out.println("Hello world");
	}

}

package ControlStatment;

public class Pract_If_else {

	public static void main(String[] args) {

		int marks =-1 ; // change this input value
		
		
		if(marks>=80 & marks<=100)
		{
			System.out.println("pass");
		}
		else if(marks>=70 & marks<=79)
		{
			System.out.println("Distinction");
		}
		else if(marks>=60 & marks<=69)
		{
			System.out.println("First Class");
		}
		else if(marks>=50 & marks<=59)
		{
			System.out.println("Second class");
		}
		else if(marks>=35 & marks<=49)
		{
			System.out.println("Pass class");
		}
		else if(marks<35 & marks>=0)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Wrong input");
		}
	}

}

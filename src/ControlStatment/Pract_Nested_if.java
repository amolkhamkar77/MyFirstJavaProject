package ControlStatment;

public class Pract_Nested_if {

	public static void main(String[] args) {

		int sBankAc =100;
		int CBankAc= 199;
		
		if(sBankAc >=100)
		{
			System.out.println("you can eligible for saving bank account");
			
			if(CBankAc>=200)
			{
				System.out.println("you can eligible for Current bank account");
			}
			else
			{
				System.out.println("Not eligible for current account");
			}
		}
		else
		{
			System.out.println("No need to open Account in bank");
		}
		
	}

}

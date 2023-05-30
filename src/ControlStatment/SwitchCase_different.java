package ControlStatment;

public class SwitchCase_different {

	public static void main(String[] args) {
		
		//int a = 2; variable declaration
		//switch(a)   switch that variable
		
		switch(5) // we can use direct switch or we first declared variable and then switch that variable
		{
		case 1: System.out.println("Today is Mon");
		break;
		case 2: System.out.println("Today is Tue");
		break;
		case 3: System.out.println("Today is Wed");
		break;
		case 4: System.out.println("Today is Thr");
		break;
		case 5: System.out.println("Today is Fri");
		break;
		case 6: System.out.println("Today is Sat");
		break;
		case 7: System.out.println("Today is Sun");
		break;
		default: System.out.println("Invalid input");
		}
		
	}

}

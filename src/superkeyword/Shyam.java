package superkeyword;

public class Shyam extends Ram {

	int age = 40;
	public void showAge() // static method
	{
		System.out.println(age);// age 40
		System.out.println(super.age);
	}
	
	public static void main(String[] args) {
		
		Shyam r = new Shyam();
		r.showAge();

	}

}

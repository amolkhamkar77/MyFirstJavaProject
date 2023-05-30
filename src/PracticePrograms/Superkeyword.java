package PracticePrograms;

public class Superkeyword extends SuperKeywordClass  {
	int a =20;
	
	public void myMethod()
	{
		int a=10;
		System.out.println(a);  //10...  Local variable
		System.out.println(this.a);  //20... globl variable
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		
		Superkeyword s1 = new Superkeyword();
		s1.myMethod();
		s1.mymethod2();
		
	}

}

package PracticePrograms;

public class LocalAndGlobalVariable {

	
	//1: example of local & global variable
	int a=10; //global variable
	static int b =12;// this is used in staticGlobal class program
	public void m1()
	{
	int c=20; //local variable
	System.out.println(c);
	System.out.println(a);
	
	}
	public void m2()
	{
	int d=30; //local variable
	//System.out.println(c);   //c can not accessed in this method bcoz it is a local variable of method m1
	System.out.println(d);
	System.out.println(a);
	}
	public static void main(String[] args)
	{
	LocalAndGlobalVariable s1=new LocalAndGlobalVariable();
	s1.m1();
	s1.m2();
	}
}

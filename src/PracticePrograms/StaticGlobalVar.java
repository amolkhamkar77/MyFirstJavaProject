package PracticePrograms;

public class StaticGlobalVar {

	//2: example of static global(class variable) variable
	static int a=10; //global variable
	public static void main(String[] args)
	{
	//static global variable call from same class
	System.out.println(a); //variableName
	//m1();  // variable call from same class
	
	//static global variable call from diff class
	System.out.println(LocalAndGlobalVariable.b); //diffclassname.variable
	}
	//public static void m1()
	//{
	//System.out.println(a);
	//}
	//public void m2()
	//{
	//System.out.println(a);
	//}
}

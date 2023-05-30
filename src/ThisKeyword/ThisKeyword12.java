package ThisKeyword;

//import PracticePrograms.Superkeyword;

public class ThisKeyword12 {
	
int a =20; // global variable
	
	public void myMethod()
	{
		int a=10; //Local variable
		System.out.println(a);  //10...  Local variable... this statement call only local variable
		System.out.println(this.a);  //20... globl variable
	}   // This keyword is used when local and global variable have same name

	public static void main(String[] args) {
		
		ThisKeyword12 s1 = new ThisKeyword12();
		s1.myMethod();
	}
}

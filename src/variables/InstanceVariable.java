package variables;

public class InstanceVariable {
	int ab = 40; // Instance variable or Globale variable
	int ac;
	double hh;
	String str;
	boolean bt;
	public void myMethod()
	{
		System.out.println(ab);
		System.out.println(ac);   // default values in instance variable for int = it is zero
		System.out.println(hh);
		System.out.println(str);  // default values in instance variable for String = it is Null
		System.out.println(bt);  // default values in instance variable for Boolean = it is False
	}

	public static void main(String[] args) {
		
		InstanceVariable d = new InstanceVariable();
		d.myMethod();
	}

}

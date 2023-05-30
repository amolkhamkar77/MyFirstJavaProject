package variables;

public class GlobalVariable2 {
	
	float f = 89.56f;
	//static int g = 56;
	public void Mymethod1()
	{
		System.out.println(f);
	}
    public static void Mymethod2() // for static method variable should be static
    {
    	System.out.println("apk");  //System.out.println(g);
    }

	public static void main(String[] args) {
		GlobalVariable2 obj = new GlobalVariable2();
		obj.Mymethod1();
		obj.Mymethod1();
		obj.Mymethod1();
		GlobalVariable2.Mymethod2();

	}

}

package variables;

public class GlobaleVariable {

	float f = 32.55f;    //Global Variable
	static int b = 10;   // Static variable
	
		public void test() {
			System.out.println(f);
		}
		
		public static void test1() {
			System.out.println(b);
		}
	
	
	public static void main(String[] args) {
		GlobaleVariable gv = new GlobaleVariable();
		gv.test();
		gv.test();
		GlobaleVariable.test1();
		

	}

}

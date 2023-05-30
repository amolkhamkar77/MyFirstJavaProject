package conversionCasting;

public class UpCastingClass {

	public static void main(String[] args) {

		// superClass Ref Variable = new SubClass ()
		UpCastSuperClass abc = new UpCastSubClass();
		abc.nature();
		abc.nature(10);
		//abc.   No Sub class new Properties Comes
		// only inherited properties are come in upcasting
	}

}

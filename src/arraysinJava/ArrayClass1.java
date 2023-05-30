package arraysinJava;

public class ArrayClass1 {

	public static void main(String[] args) {
		
		int a[] =new int [5]; // index value and variable values should be match, otherwise it shows exceptions
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for (int i=0; i<5; i++ ) { // if we use a.length then variable values more than index values are print as 0..
			System.out.println(a[i]);
		}

	}

}

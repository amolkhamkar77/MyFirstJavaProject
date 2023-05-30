package logicalPrograms;

public class PalindromNumber {

	public static void main(String[] args) {
		int a=121;
		int b;
		int c=0;
		int d =121;
		while(a>0)
		{
			b=a%10;
			c=c*10+b;
			a=a/10;
		}
		if(d==c)
		{
			System.out.println(c+" Is a Palindrom Number");
		}
		else
		{
			System.out.println(c+" Is not a Palindrom Number");
		}
	}

}

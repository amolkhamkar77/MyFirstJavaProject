package logicalPrograms;

public class SquarePattern {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				if(i==1||i==5||j==1||j==5)// i= row, j= colomn
				{
					System.out.print("*");
				}
				else
				{
					System.out.println(" ");
				}
			}
		}
System.out.println();
	
	}
}

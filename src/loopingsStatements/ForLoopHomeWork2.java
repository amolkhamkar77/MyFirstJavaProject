package loopingsStatements;

public class ForLoopHomeWork2 {

	public static void main(String[] args) {
		for(int i=50; i<=99; i++) // 1<=5...2<=5...3<=5...4<=5...5<=5...6<=5(false) terminate here
		{
System.out.println(i); // it will execute multiple times
		}
	
	
		System.out.println("=============================");
	
	
	for(int i=99; i>=50; i--)// 5>0...4>0...3>0...2>0...1>0....0>0(false) terminate here
	{
		System.out.println(i);//this line will execute multiple times
	}
}
}
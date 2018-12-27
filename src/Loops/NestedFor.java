package Loops;

public class NestedFor {
public void pattern1()
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedFor oo=new NestedFor();
		oo.pattern1();
	}

}

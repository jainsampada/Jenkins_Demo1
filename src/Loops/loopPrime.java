package Loops;

public class loopPrime {
public void acc()
{
	int a=0;
	for(int i=2;i<=100;i++)
	{
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				a=1;
			}
		}
		if(a!=1)
		{
			System.out.println(i);
		}
		else
		{
			a=0;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopPrime oo=new loopPrime();
		oo.acc();
	}

}

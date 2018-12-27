package Loops;

public class WhileLoop {
int a=10,b,c=56;
//public void prefix()
//{
//	b=++a;
//	System.out.println("a value is:"+a);
//	System.out.println("b value is:"+b);
//}
//public void postfix()
//{
//	b=a++ + --c;
//	System.out.println("a value is:"+a);
//	System.out.println("b value is:"+b);
//	System.out.println("c value is:"+c);
//}
public void useWhile()
{
	while(a<=50)
	{
		System.out.println("a is:"+a);
		a++;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop oo=new WhileLoop();
		//oo.prefix();
	//	oo.postfix();
oo.useWhile();
	}

}

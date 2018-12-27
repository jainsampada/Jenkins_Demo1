package Oops_Concepts;

public class ClassDemo {
static int a=100,b=192,res;
int ab;
public static void acc()
{
	System.out.println(a);
}
public static void new1()
{
	String name="Yogesh";
	System.out.println(name);
	System.out.println("Result value is:"+res);
	
	
}

static
{
	res=a+b;
	System.out.println("Result is:"+res);
	res++;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(a);
		ClassDemo oo=new ClassDemo();
		new1();
		MethodsDemo oo1=new MethodsDemo();
		oo1.sub();
	}

}

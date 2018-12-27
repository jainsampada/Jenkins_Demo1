
package InheritanceDemo;
import java.io.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B ob=new B();
ob.acc(10.0);
ob.acc(10);
	}


}
class A
{
	public void acc(double i)
	{
		System.out.println(i*2);
		Oops_Concepts.StudentEncap oo=new Oops_Concepts.StudentEncap();
	}
}
class B extends A
{
	public void acc(int i)
	{
		System.out.println("i is:"+i);
	}
}
package Oops_Concepts;

import java.util.Scanner;

public class MethodsDemo {
	int res,i=100,j=10;
	float f;
public int add(int num1,int num2)
{
	res=num1+num2;
	return res;
}
public void sub()
{
	res=i-j;
	System.out.println("res"+res);
	res=add(i,j);
	System.out.println("result issss"+res);
}
public int disp()
{
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc=new Scanner(System.in);
		MethodsDemo oo=new MethodsDemo();
		int num,num1;
		System.out.println("Enter first number");
		num=sc.nextInt();
		
		System.out.println("Enter second number");
		num1=sc.nextInt();
		int a=oo.add(num, num1);
		System.out.println(a);
		oo.sub();
		num=oo.disp();
		System.out.println("num is"+num);

	}

}

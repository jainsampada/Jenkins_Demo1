package ArraysDemo;

import java.util.Scanner;

public class StudentDetails {
int [] rollno=new int[10];
String[] name=new String[10];
Scanner sc=new Scanner(System.in);
public void input()
{

	for(int i=0;i<=9;i++)
	{
		System.out.println("Enter rollno and name"+i+"student");
		rollno[i]=sc.nextInt();
		name[i]=sc.next();
		
	}
	System.out.println("--------Student Details----------");
	for(int j=0;j<=9;j++)
	{
		
		System.out.print(rollno[j]+"\t");
		System.out.println(name[j]);
	}
	System.out.println("Using Enhanced For Loop");
	for(int roll:rollno)
	{
		System.out.println(roll);
	}
	for(String n:name)
	{
		System.out.println("Name are:"+n);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails oo=new StudentDetails();
		oo.input();
	}

}

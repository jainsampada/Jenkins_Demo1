package InheritanceDemo;

import java.util.Scanner;

public class StuperDetails {
int rollno;
String name;
String dob;
int contact;
Scanner sc=new Scanner(System.in);
protected StuperDetails()
{
	System.out.println("Enter Rollno");
	rollno=sc.nextInt();
	
	System.out.println("Enter Name");
	name=sc.next();
	
}
public StuperDetails(int a, int b)
{
	System.out.println("a is:"+a);
	System.out.println("b is:"+b);
}
public void display()
{
	System.out.println("rollno is:"+rollno);
	System.out.println("name is:"+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

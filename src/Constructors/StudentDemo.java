package Constructors;

public class StudentDemo {
	int rollno;
	String name;
  StudentDemo()
{
	  this(10,20);
	rollno=1;
	name="Yogesh";
	System.out.println("Rollno is:"+rollno);
	
}
public StudentDemo(int a,int b)//Constructor Overloading
{
	//this();
	//StudentDemo oo=new StudentDemo();
	//this();
	System.out.println(a+b);
	
}
public void studentDetails()
{
	System.out.println("Rollno is:"+rollno);
	System.out.println("Name  is:"+name);
}
public void studentDetails(int r)//method overloading
{
	System.out.println("r is"+r);
	//return r;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo oo=new StudentDemo();
//		StudentDemo obj=new StudentDemo(10,33);
//		oo.studentDetails();
//		obj.studentDetails(34);
		
	}

}

package InheritanceDemo;

import java.util.Scanner;

public class StudentMarksDet extends StuperDetails {
int eng,Hindi,maths;
Scanner sc=new Scanner(System.in);
 public  StudentMarksDet() {
	
	
	//super.acceptdetails();
	// super();
	 super(10,20);
	 super.name="sampada";
	System.out.println("Enter marks in english");
	eng=sc.nextInt();
	
	System.out.println("Enter marks in Hindi");
	Hindi=sc.nextInt();
	display();
	
}
 public StudentMarksDet(int a)
 {
	 super();
	 System.out.println("Derived class");
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentMarksDet oo=new StudentMarksDet();
StudentMarksDet obj=new StudentMarksDet(10);
//oo.StudentMarksDet1();
//oo.acceptdetails();
	}

}

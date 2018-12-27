package InheritanceDemo;

import java.util.Scanner;

public class Employee extends FinalDemo implements IntSalDet,Intemployee {
Scanner sc=new Scanner(System.in);
int empid;
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void personaldetails() {
		// TODO Auto-generated method stub
		acc();
	}
	@Override
	public void qualifationdetails() {
		// TODO Auto-generated method stub
	//	Intemployee oo=new Intemployee();
		acc();
		acc11();
	}
	
	@Override
	public void entersal() {
		// TODO Auto-generated method stub
		
	}

	

}

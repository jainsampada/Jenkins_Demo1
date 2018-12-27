package Loops;

import java.util.Scanner;

public class CheckDivisor {
int dividend,divisor,que,rem;
char choice;
Scanner sc=new Scanner(System.in);
public void acc()
{
	do
	{
	System.out.println("Enter value for Dividend");
	dividend=sc.nextInt();
	
	System.out.println("Enter Divisor");
	divisor=sc.nextInt();
	
	if(divisor==0)
	{
		System.out.println("Plz enter values again for dividend and divisor");
		System.out.println("Enter value for Dividend");
		dividend=sc.nextInt();
		
		System.out.println("Enter Divisor");
		divisor=sc.nextInt();
		
		
	}
	
	que=dividend/divisor;
	System.out.println("Quetient is:"+que);
	
	rem=dividend%divisor;
	System.out.println("Remainder is:"+rem);
	
	System.out.println("Enter your choice in (y/n)");
	choice=sc.next().charAt(0);
	}while(choice=='Y');
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CheckDivisor oo=new CheckDivisor();
		 oo.acc();
	}

}

package ArraysDemo;

import java.util.Scanner;

public class DynamicSizeDemo {
int[] rollno;
int size;
Scanner sc=new Scanner(System.in);
public void acc()
{
	System.out.println("Enter Size");
	size=sc.nextInt();
	
	rollno=new int[size];
	for(int i=0;i<rollno.length;i++)
	{
		rollno[i]=sc.nextInt();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicSizeDemo oo=new DynamicSizeDemo();
		oo.acc();
	}

}

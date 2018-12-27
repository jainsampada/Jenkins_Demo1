package ExceptionsDemo;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class ArithmeticExec {
int num1,num2,res;
Scanner sc=new Scanner(System.in);
public void acc()
{
	
	Scanner sc=new Scanner(System.in);
			try {
				System.out.println("Enter num1");
				num1=sc.nextInt();
				System.out.println("Enter num2");
				num2=sc.nextInt();
res=num1/num2;
System.out.println("result is:"+res);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				sc.close();
				System.out.println("finally block");
			}
		
		
	
	
//	catch (ArrayIndexOutOfBoundsException E) {
//		System.out.println("aRRAY ERROR");
//		// TODO: handle exception
//	}
//	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArithmeticExec oo=new ArithmeticExec();
oo.acc();
	}

}

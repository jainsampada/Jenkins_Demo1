package Constructors;

public class ThisDemo {
private int rollno;
public void acc(int rollno)
{
	this.rollno=rollno;
	System.out.println("Rollno"+rollno);
}
public void acc()
{
	System.out.println("Rollno:::"+rollno);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo oo=new ThisDemo();
	
		oo.acc(12);
		oo.acc();
		
	}

}

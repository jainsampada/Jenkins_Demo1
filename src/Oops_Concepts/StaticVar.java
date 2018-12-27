package Oops_Concepts;
import static java.lang.System.out;
public class StaticVar {
static int rollno;
static String name;
static String collegename="btes";
public static void Stat(int r,String n)
{
	rollno=r;
	name=n;
}
public void display()
{
	out.println("Rollno:"+rollno+"Name:"+name+"College Name:"+collegename);
	out.println("heloo");
	out.println("heloo");
	out.println("heloo");
	out.println("heloo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar oo=new StaticVar();
		Stat(10, "ajhj");
		oo.display();
		//ob.display();
	}

}

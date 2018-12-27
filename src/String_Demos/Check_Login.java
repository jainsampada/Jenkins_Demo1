package String_Demos;

public class Check_Login {
	String uname="admin",pass="admin";
	String pass1=new String("admin");
public void Check()
{
	if(pass.equals(pass1))
	{
		System.out.println("You are valid user");
	}
	else
	{
		System.out.println("you are not a valid user");
	}
}
public static void main(String[] a)
{
	Check_Login oo=new  Check_Login();
	oo.Check();
}
}

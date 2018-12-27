package String_Demos;

public class ReverString {
String str="DAD";
String rev="";
public void reverseDemo()
{
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println("Reverse is:"+rev);
	if(str.equals(rev))
	{
	System.out.println("This is Palindrome");	
	}
	else
	{
		System.out.println("This is not Palindrome");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverString oo=new ReverString();
		oo.reverseDemo();

	}

}

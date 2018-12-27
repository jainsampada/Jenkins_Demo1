package String_Demos;

public class StringBufferDemo {
	StringBuffer str=new StringBuffer("Hello");
	StringBuffer str1=new StringBuffer("Hello");
	
public void acc()
{
if(str.equals(str1))
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferDemo oo=new StringBufferDemo();
		oo.acc();
	}

}

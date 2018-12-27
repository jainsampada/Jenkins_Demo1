package String_Demos;

public class Demo {
String s="Java";
String s1="j2SE";
String s3;
char e;

public void display()
{
	s3=s1.concat(s);
	System.out.println("s3 is:"+s3);
	s3=s3.toUpperCase();
	System.out.println("s3 is:"+s3);
	int l=s3.length();
	System.out.println("Length is:"+l);
	e=s3.charAt(4);
	System.out.println("Char at index 4"+e);
	s3=s3.substring(2, 5);
	System.out.println("Substring is:"+s3);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo oo=new Demo();
		oo.display();
	}

}

package ArraysDemo;

import java.lang.reflect.Array;

public class IntializedArray {
int[] rollno={1,3,5,6,2};
public void enter()
{
	 int a;
	System.out.println("Print Rollno");
	for(int i=0;i<rollno.length;i++)
	{
		System.out.println(rollno[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntializedArray oo=new IntializedArray();
		oo.enter();
	}

}

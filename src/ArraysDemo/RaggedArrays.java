package ArraysDemo;

import java.util.Scanner;

public class RaggedArrays {
	int[][] reg=new int[3][];
	int col;
	Scanner s=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter ragged array");
		for(int i=0;i<reg.length;i++)
		{
			System.out.println("Enter size of column for"+i+"row");
			col=s.nextInt();
			reg[i]=new int[col];
			System.out.println("Enter Column values");
			for(int j=0;j<reg[i].length;j++)
			{
				reg[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<reg.length;i++)
		{
			for(int j=0;j<reg[i].length;j++)
			{
				System.out.print(reg[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

public static void main(String[] ar)
{
	RaggedArrays oo=new RaggedArrays();
	oo.accept();
}
}

package Loops;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Sampada Jain";
		String l="",k="";
		int c=0;
		for(int i=0;i<name.length();i++)
		{
		if(name.charAt(i)!=' ')
		{
		l=l+name.charAt(i);
		c++;
		}
		else
		{
		break;
		}
		}
		
		for(int j=c+1;j<name.length();j++)
		{
		k=k+name.charAt(j);
		}
		String news=k+" "+l;
		System.out.println(news);
		}


	}



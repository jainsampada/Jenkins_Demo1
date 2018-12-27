package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StudentDemo {
		byte[] rollno={1,2,3,4};
		String[] name={"Ritu","Riya","Sonu","Puja"};
		byte[] marks={90,70,89,82};
		int len,ch;
		BufferedReader br;
		public void display() throws IOException 
		{
		len=name.length;
		File f=new File("D://Student.txt");
		f.createNewFile();
		//FileOutputStream f1=new FileOutputStream(f);
		FileWriter fw=new FileWriter(f);
		System.out.println("Rollno   "+"Name     "+"Marks");
		//writing data into the file
		for(int i=0;i<4;i++)
		{
		fw.write(rollno[i]);
		fw.write(name[i]);
		fw.write(marks[i]);
		System.out.print(rollno[i]+"        ");
		System.out.print(name[i]+ "     ");
		System.out.print(marks[i]);
		System.out.println();
		}
		//f1.close();
		fw.close();
		//reading data of the file
		FileReader f2=new FileReader("D://Student.txt");
//		br=new BufferedReader(new FileReader("D://Student.txt"));
//		String line=br.readLine();
//		while(line!=null){System.out.println(line);
//		line=br.readLine();
//		}
		//br.close();
		//int size=f2.available();
			System.out.println("Reading data of file student:");
			 while ((ch=f2.read())!=-1) 
			 {
			System.out.print(f2.read()+" ");
			//System.out.print(f.r);
			}
			f2.close();
		}
		public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		StudentDemo o=new StudentDemo();
		o.display();
		}
}

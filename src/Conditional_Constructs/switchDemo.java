package Conditional_Constructs;

import java.util.Scanner;

import Constructors.StudentDemo;

public class switchDemo {
	int choice, num1, num2, res;
	Scanner s = new Scanner(System.in);

	public void check() {
		System.out.println("1.Add\t\t2.Subtract\n3.Multiply\t4.Divide");
		System.out.println("Enter your choice");
		choice = s.nextInt();
		System.out.println("enter first number");
		num1 = s.nextInt();
		System.out.println("enter second number");
		num2 = s.nextInt();
		switch (choice) {
		case 1:
			res = num1 + num2;
			System.out.println("Addition of two numbers" + res);
			break;

		case 2:
			res = num1 - num2;
			System.out.println("Subtraction of two numbers" + res);
			break;

		case 3:
			res = num1 * num2;
			System.out.println("Multiply of two numbers" + res);
			break;

		case 4:
			res = num1 / num2;
			System.out.println("division of two numbers" + res);
			break;

		default:
			System.out.println("you have entered the wrong choice");
			break;
		}
	}

	public static void main(String[] ar) {
		switchDemo oo = new switchDemo();
		oo.check();
		//StudentDemo oo=new StudentDemo();
	}

}

package ExceptionsDemo;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
	int age;
	Scanner sc = new Scanner(System.in);

	public void acc() throws InvalidAgeException,IOException,ArrayIndexOutOfBoundsException {
		System.out.println("Enter age");
		age = sc.nextInt();
		if (age < 18) {
			throw new InvalidAgeException();
		}

	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, InvalidAgeException, IOException {
		// TODO Auto-generated method stub
		ThrowsDemo oo = new ThrowsDemo();
		oo.acc();
	}

}

package ExceptionsDemo;

public class InvalidAgeException extends Exception {
public InvalidAgeException()
{
	System.out.println("Age can not be less then 18");
}
}

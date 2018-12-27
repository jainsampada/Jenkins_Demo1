package Loops;

public class DowhileDemo {
	int i = 30;

	public void acc() {
		do {
			System.out.println("i is:" + i);
			i++;
		} while (i < 30);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DowhileDemo oo = new DowhileDemo();
		
		oo.acc();
	}

}

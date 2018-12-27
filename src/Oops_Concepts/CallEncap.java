package Oops_Concepts;

public class CallEncap {
	public void accept() {
		StudentEncap oo = new StudentEncap();
		oo.setRoll(1);
		Object getrollno = oo.getRoll();
		System.out.println("Roll no is:" + getrollno);
		oo.setName("Vaibhav");
		Object n=oo.getName();
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallEncap oo = new CallEncap();
		oo.accept();
	}

}

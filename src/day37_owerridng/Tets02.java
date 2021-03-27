package day37_owerridng;

class Derived {
	public void getDetails() {
		System.out.println("Derived class");
	}
}

public class Tets02 extends Derived {
	
	public void getDetails() {
		System.out.println("Test class");
	}
	

	public static void main(String[] args) {
		Derived obj = new Tets02();
		obj.getDetails();
	}
}
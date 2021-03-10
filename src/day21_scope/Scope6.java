package day21_scope;

public class Scope6 {

	
		int num1;
		String name = "Ali";
		public static void main(String args){ 
		  add();
		//product (5);//static olmayan bir methodu static method icerisinden cagrilamaz
		}
		public static void add(){
		//num1 ++; ==> burda da num1 instance veriable ve static olmadigi icin static methodun iicnden cagrimaya 
			//calsilmis ondan dolayi cte verir
		int num2 = 6;
		char letter;
		System.out.println("Do addition ");
		}
		public void product(int num3){
		name = "Veli";
		//num2++;  ==> num2 farkli bir methoda olurutulmus ve baska bir methodun iicnden cagrilamaz.
		System.out.println(num3 * num3);
		} 

	}



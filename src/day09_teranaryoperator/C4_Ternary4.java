package day09_teranaryoperator;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi girniz");
		
		int sayi = scan.nextInt();
		
		String sonuc= 	sayi%2==0 ? "Cift sayi" : "Tek sayi";
		System.out.println(sonuc);
		
       
       
       // girilen sayinin mutlak degerini yazdiriniz
       // 5 ->5    -12 -> 12  (girilen sayi x olsun . x pozitifse |x|=x  x negatifse |x|=-x )
       
       Integer sonuc2=  sayi>0 ? sayi*(+1) : sayi*(-1);
       System.out.println(sonuc2);
       
       scan.close();
	}

}

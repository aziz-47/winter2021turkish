package day09_teranaryoperator;

import java.util.Scanner;

public class C6_NestedTernary2 {

	public static void main(String[] args) {
		// Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , 
		//buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");
		
		char ilkHarf = scan.next().charAt(0);
		
	String result=	(ilkHarf>='A'&& ilkHarf<='Z' || ilkHarf>='a'&& ilkHarf<='z') ?  ilkHarf>='a'&& ilkHarf<='z'?"Kucuk harf" :
			"Buyuk harf" : "Giridginiz karekter harf degildri";
	
	System.out.println(result);
	
	scan.close();
		
	
	}

}

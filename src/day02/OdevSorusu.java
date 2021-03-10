package day02;

import java.util.Scanner;

public class OdevSorusu {

	public static void main(String[] args) {
		//Kullanicidan ismini alip isminin bas harfini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		
//		String isim = scan.next();
//		isim =isim.substring(0, 1);
		
		char isim = scan.next().charAt(0);	
		System.out.println(isim);
		
		

	}

}

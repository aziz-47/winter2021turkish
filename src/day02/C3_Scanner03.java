package day02;

import java.util.Scanner;

public class C3_Scanner03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String isim = scan.nextLine();
		System.out.println("Lutfen soyAdinizi giriniz");
		String soyIsim = scan.nextLine();
		
		System.out.println(isim + " " + soyIsim);


	}

}

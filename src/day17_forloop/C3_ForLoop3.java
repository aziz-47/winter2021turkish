package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		/**
		 * Kullanicdan 40 tan kucuk pozitif bir sayi alin.Girilen sayinin faktoriyelini hesaplayip
		 * yazdrian bir methiod olsutruurn
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 40 tan  kuck bir sayi bir sayi giriniz");
		int sayi = scan.nextInt();
		
		faktoryelHesapla(sayi);
		scan.close();

	}

	public  static void faktoryelHesapla(int sayi) {
		if(sayi<=0||sayi>=40) {
			System.out.println("Lutfen gecerli bir sayi girniz");
		}else {
			
			long faktoryel= 1;
			for(int i=1; i<=sayi; i++) {
				faktoryel= faktoryel*i;
			}
			System.out.println(sayi + "!" + "=" + faktoryel);
		}
		
	}

}

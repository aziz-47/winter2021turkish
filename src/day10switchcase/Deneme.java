package day10switchcase;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		
		// Kullanýcýdan üç isim girmesini isteyen bir program yazýn.
		// Programýnýz isimleri azalan sýrada göstermelidir.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ilk ismi giiniz");
		char ilkIsim = scan.next().charAt(0);
		System.out.println("lutfen ilk ismi giiniz");
		char ikinciIsim = scan.next().charAt(0);
		System.out.println("lutfen ilk ismi giiniz");
		char ucuncuIsim = scan.next().charAt(0);

		if (ilkIsim < ikinciIsim && ikinciIsim < ucuncuIsim) {
		System.out.println(ilkIsim);
		System.out.println(ikinciIsim);
		System.out.println(ucuncuIsim);
		}

		else if (ilkIsim < ucuncuIsim && ucuncuIsim < ikinciIsim) {
		System.out.println(ilkIsim);
		System.out.println(ucuncuIsim);
		System.out.println(ikinciIsim);
		}

		else if (ikinciIsim < ilkIsim && ilkIsim < ucuncuIsim) {
		System.out.println(ikinciIsim);
		System.out.println(ilkIsim);
		System.out.println(ucuncuIsim);

		} else if (ikinciIsim < ucuncuIsim && ucuncuIsim < ilkIsim) {
		System.out.println(ikinciIsim);
		System.out.println(ucuncuIsim);
		System.out.println(ilkIsim);

		} else if (ucuncuIsim < ilkIsim && ilkIsim < ikinciIsim) {
		System.out.println(ucuncuIsim);
		System.out.println(ilkIsim);
		System.out.println(ikinciIsim);
		} else {
		System.out.println(ucuncuIsim);
		System.out.println(ikinciIsim);
		System.out.println(ilkIsim);
		}

		scan.close();

	}

}

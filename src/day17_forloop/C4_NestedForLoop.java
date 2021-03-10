package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		/**
		 * Kullanicidan pozitif bir rakam isteyinizve grilen rakama gore asagidaki sekli ciizniz
		 * 
		 * 
		 *    *
		 *    **
		 *    ***
		 *    ****
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan kucuk bir tam sayi giriniz");
		int sayi = scan.nextInt();
		
		for(int i=1; i<=sayi; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();

	   
	}

}

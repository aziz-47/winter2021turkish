package day08_ifelseifnestedif;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil=scan.nextInt();
        
        if (yil%4==0 && yil%100!=0 || yil%400==0) {
            System.out.println("Girdiginiz yil ARTIK YILDIR");
        } else {
            System.out.println("Girdiginiz yil artik yil DEGILDIR");
        }
        
        scan.close();


	}

}

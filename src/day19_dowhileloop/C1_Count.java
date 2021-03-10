package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		//Kullanicdan bir cumle ve bir harf isteyiniz
		//while loop kulnaraka cumlede kac kez kulllanilmis bulunuz
		//case sensitive olsun
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Llutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("Lutfen bir harf giriniz");
		String harf= scan.next().substring(0,1);
		
		
		
		int count =0;
		
		int index= 0;
		
		while(index<cumle.length()) {
			if(cumle.substring(index, index+1).equals(harf)) {
				count++;
				
			}
			index++;
			
		}
		
		System.out.println("Cumlede " + harf + " harfi " + count + " defa kullanilmis ");
		
		

	}

}

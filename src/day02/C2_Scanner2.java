package day02;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		// Kullanicdan ddairenin yari apinin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen daireninyari cappini girniz");
		double yariCap = scan.nextDouble();
		
		System.out.println("Dairenin alani: " + 3.14*yariCap*yariCap);
		
		

	}

}

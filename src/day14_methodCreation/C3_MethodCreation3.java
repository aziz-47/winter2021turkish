package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alan bir method yazin
		//main method icinden cagirarak methdoy calsitirn
		ortalama(12.3,14.6,16.8);
		

	}
	
	public static void ortalama(double num1, double num2, double num3) {
		System.out.println("Giridginiz 3 tane sayinin ortalamasi : " + (num1+num2+num3)/3);
	}
	
	  public static void ortalama(double sayi1, double sayi2) {
	        
	        System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
	        //Bir methodu olusturmak o methodu calistirmak icin yeterli degildir
	        // olusturulan method main method icinden cagrilinca calisir.

	    }

}

package day42_abstractclasses;

public class C2_Final extends C1_Final {

	public static void main(String[] args) {
		 System.out.println(C1_Final.SAYI);
	        
	        //static bir variable okul ismi gibi herkes icin aynidir
	        
	        //C1_final.SAYI+=20;
	        // Sayi variable'i final olarak tanimlandigi icin DEGISTIRILEMEZ
	        
	        C2_Final obj1 = new C2_Final();
	        
	        obj1.deneme();
	    }
	    public void deneme() {
	        System.out.println("child class'daki overriding method");
	    }
	    
	    /*
	    public void deneme2() {
	        //Cannot override the final method from C1_final
	    }
	    
	    */
	    
	    // final class yaptigimizda inherit edilemez
	    
}

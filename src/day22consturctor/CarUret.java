package day22consturctor;

public class CarUret {

	String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
    // bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
    // bu class'da olusturulacak objelere ait tum ozellikler olur
    // bu class direk calistirilmayacagi icin main method olmasa da olur
    // (Kaliphane gibidir)
    
    public void yakit(String yakit) {
        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
    }
    
    public void vites(String vites) {
        System.out.println("Araba " + vites + " viteslidir");
    }


}

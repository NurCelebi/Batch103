package day32maps;

public class Staticblock001 {

    public static double pi;

    static{
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    //static block'lar ihtiyacimiz olan variable'larin class olusturma safhasinda elimizde olmasini saglar.
    //static block'lar Class icindeki hersey'den once calistirilir. "main method" dan ve diger tum method'lardan once calistirilir.
    //static block'lar icinde sadece "static variable" lara deger atanabilir.
    //1'den fazla "static block" varsa ustteki once calistirilir.
    static{
        pi=3.14;
        System.out.println("Static block 1");
    }

    public static double pii;
//static bloklar ihtiyacimiz olan variable'lerin class olusturma safhasinda elimizde olmasini saglar
//static bloklar class icindeki her seyden once calistirilir"main methot"tan ne diger tum methodlardan önce calistirilir
//static bloklar icinde sadece static variable'lere deger atanabili
}

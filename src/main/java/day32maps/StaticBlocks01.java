package day32maps;

public class StaticBlocks01 {

    static{
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        //burasi static old icin bunun icindeki hersey de static olmali.static kalkarsa java sikayet eder.


        System.out.println("main method");
    }

    public static double pi = 3.14;

    //java class'i olustururken pi sayisini verir.sonra main calistirir.
    //static methodlar ihtiyacimiz olan variable'larin class olusturma safhasinda elimizde olmasini saglar
    //static blocklar class icindeki herseyden once calistirilir.'main method'dan ve diger tum methodlardan once calistirilir.
    //static blocklar icinde sadece static variable'lara deger atanabilir.
    static{
        pi=3.14;
        System.out.println("static block 1");
    }

//
//    public static void main(String[] args) {
//        //burasi static old icin bunun icindeki hersey de static olmali.static kalkarsa java sikayet eder.
//
//
//        System.out.println("main method");
//    }

    /*
    biden fazla static block varsa ustteki daha once calistirilir.
    static block ne ise yarar?
    -- bazen main method calistirilmadan once variable'la deger atamak gerekebilir.
    --static olanlar class'a yapistirilir.
     */
}

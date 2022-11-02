package day21accessmodifiersinheritance;

public class Student {
    /*
    Access Modifier
    1)public    2)protected    3) default(Access Modifier'i default yapmak icin access modifier yazmayiniz.)  4)private
                                    //default-->package private
    Note:  Access Modifier'lari genisten dara dogru siralayaniz.
           public> protected > default > private

    Note:  Access Modifier'lari birer birer aciklayiniz.
           Public her class'dan kullanilabilir.
           protected ,baska package'lerden kullanilamaz.Ancak baska package'de child class icinden kullanilabilir.
           default olanlar baska bir package'de kullanilmazlar.
           private olanlara sadece olusturulduklari class icinde kullanilabilirler.

    Note: Class'lar icin hangi Acces Modifier'lar kullanilabilir?
          public  ,default'da kullanilir ama protected ve private kullanilamaz.
     */
    //Public her class'dan kullanilabilir.Bir seyi public yaparsam nereye gidersem gideyim kullanabilirim.


    public String stdNames = "TomHanks";

    //protected ,baska package'lerden kullanilamaz.Ancak baska package'de child class icinden kullanilabilir.
    protected String address = "Miami";


    // default String email = "th@gmail.com";//hata verdi
    //default olanlar baska bir package'de kullanilmazlar.
    //access modifier hic gormuyorsam bu default'dur.
    String email = "th@gmail.com";

    //private olanlara sadece olusturulduklari class icinde kullanilabilirler.
    private String stdId = "23545647893";
}

package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
    1)StringBuilder Java'da bir class'dir.Scanner-Arrays,String... bunlar birer class'dir.Class'larin icinde variable(pasif)
    methodlar(aktif) vardir.
    2)"StringBuilderler" String olusturmaya yarar.
    3)STRING Class varken nicin StringBuilder'a ihtiyac duyariz?-->
    Cunku 'sTRING' Class "Immutable Class'dir" ama biz bazen "Mutable" String'lere ihtiyac duyariz.
    StringBuilder bize "Muatble String" verir.
    4)"Immutable Class'larda" varolan deger degistirilemez.Siz varolan bir degeri degistirmek istediginizde
     --> Memory'de Yeni bir variable yeni degerle olusturulur.
     --> Eski variable'in pointer'i yeni variable'a dondurulur.

       "Mutable Class'larda var olan deger degistirilebilir.Orjinal deger korunmaz.

     5)String Class'larin Immutable yapisi security icin onemlidir.
       Ayni degere sahip birden fazla String oldugunda Java bir tane kontenir olusturur ve ayni degere sahip String'lerin
       bu konteyniri kullanmasini temin eder.Bu Memory'i korumak icin iyidr.Ancak konteynirdaki degeri bir variable
       icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir.Bu tehlikeden kurtulmak icin Stringleri
       Immutable(degismez) yapmistir. Fakat herhangi bir variable'in degerini degistirmek icin Java bir yol bulmustur.
       Degistirmek istediginiz variable icin yeni bir konteynir olusturur ve variable'in pointer'ini bu yeni variable'a
       yonlendirir.Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

        String hesapSahibi1 = "Tom Hanks";
        String hesapSahibi2 = "Tom Hanks";
        String hesapSahibi3 = "Brad Pitt";

     */

    public static void main(String[] args) {
        /*
        2 cesit memory'imiz var.(stack ve heap)normal string str'imiz var daha sonra str yapip tekrar bir deger verirsek,
        eski deger degismiyor ayni kaliyor ama pointer kiriliyor yani
        yeni bir konteynir yapiyor ve yenisini gosteriyor. Bu yapinin nach-vorteile var.kotusu surekli konteynir oluyor.
        Bu memory'de cok yer kaplar bir sure sonra.iyi olan ise orjinal degeri hep koruyor.
         */
        //bu koda degisime kapali.-->striblerde ekleme yapmak icin concat kullaniyoruz.
        String str ="Java";
        str="Super Java";
        System.out.println(str);//Super Java.


        /*
        StringBuilder'da biz bu kodu yazdigimizda java str olusturuyor ve icine Java koyuyor.buna bir adres olusturyor
        ve adresi stack memory'e atiyor.biz bunu degistirme istedigimizde tekrar 'new StringBuilder' yazmamiz gerekir.
        Java yeni bir sey olusturmaz.Direkt hazirda olani degistirir.yani orjinali korumaz.
         */

        //degisime acik.StringBuilder nasil olusturulur?
        //1.yol:
        StringBuilder strb = new StringBuilder("Java");
//        strb = new StringBuilder("Super Java");
        System.out.println(strb);//Java

        //2.yol:-->stringBuilder olusturduktan sonra append kullaniriz
        //yol a:
        StringBuilder strb2 = new StringBuilder();//bos bir stringBuilder olusturduk.
        strb2.append("Java");//appen--> eklemek icin kullanilir.
        strb2.append(" is easy");
        strb2.append("!!");
        System.out.println(strb2);//Java--> Java is easy !!!


        //yol b:
        strb2.append("Learn").append(" Java earn").append(" money");
        System.out.println(strb2);//Java is easy!!Learn Java earn money

        //StringBuilder'larda karakter sayisi nasil bulunur?==> length() methodu ile bulunur.
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("XXXXXXXXXXXXXXX");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3-->18

        //capacity()'de yazdirdigimiz deger fazla gelirse bir 16'lik daha kapasite gelir.ama garanti olsun diye 34luk kapasite verir.-->34
        //capacity asimlarinda kapasite  varolanin 2 katinin 2 fazlasina cikar
        int capacity = strb3.capacity();
        System.out.println(capacity);//16-->stringBuilderlarin 16 kapasitesi vardir.

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70

        //setCharOf(2.'r')--> indeks 2'deki karakteri 'r'ye cevirir.
        strb3.setCharAt(2,'r');//--> karakter degisikligi icin kullaniriz.
        System.out.println(strb3);//CarXXXXXXXXXXXXXXXmmmmmmmmmmmmmmmmmmmmmmm


        //ilk indeks dahil ikici indeks harici olarak yazidirilir.ayni substring gibi.
        //delete(3,18)--> indeks 3(dahil) den indeks 18(haric) e kadar tum karakterleri siler.
        strb3.delete(3,18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmm

        //deleteCharAt(2)--> indeks 2'deki karakteri siler.
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmm


        //reverse() methodu StringBuilder'i ters cevirir. Ali==> ilA
        //method kullandik orjinal deger degisti.
        //Mutable'larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.'
        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmaC


        //Immutable'larda orjinal degeri degistirmek icin method'u kullanmak yeterli olmaz bir de atama islemi yapamlisiniz.
        String abc = "Java";
        abc=  abc.replace("a","i");
        System.out.println(abc);//Jivi


        //toString() methodu StringBuilder'lari String'e cevirir.
        //degistirilemz data istedigim zaman string'e cevirmem lazim
        //StringBuilder'da olmayan ama string'de olan methodlar var onlari kullanmak icin string'e donmek isteyebiliriz
        String stringStrb3= strb3.toString();
        System.out.println(stringStrb3);//mmmmmmmmmmmmmmmmmmmmmmmaC

        //String'den StringBuilder'a asagidaki gibi donebiliriz
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);//

        //insert(3,"XXXX") --> 3.karakterde sonra "XXXX"leri koyar
        strb4.insert(3,"XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmaC


        // insert(3,"KLMNOPQRSTU",5,8);--> 3.karakterden sonra "KLMNOPQRSTU"nin indeks 5,6,7 deki karakterleriniyerlestirir.
        strb4.insert(3,"KLMNOPQRSTU",5,8);
        System.out.println(strb4);//mmmPQRXXXXmmmmmmmmmmmmmmmmmmmmaC

        StringBuilder a = new StringBuilder("Kava");
        StringBuilder b = new StringBuilder("Java");

        //a.compareTo(b) methodu i) StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                       ii)a alfabetik sirada b'den sonra gelirse pozitif olarak oradaki alfabetik siralama farkini gosterir.--ASCII degerlere bakar
        //                       iii) a alfabetik sirada b'den once gelirse negatif olarak oradaki alfabetik siralama farkini gosterir
        //karsilastirma-->2 string karsilastirdiginda int verir.
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);



    }
}

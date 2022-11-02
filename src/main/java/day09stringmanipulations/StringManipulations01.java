package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {


        //indexOf() java kod'a gider hangi ifadeyi koyduysaniz hepsini bulur ve indexleri de bulur.mesela indexof(a) da
        // ilk a nin indexini verir

        //indexOf() method'u verilen chracter veya characterlerin "ilk gorunumun index'ini" verir.


        String str = "Hava is easy";

        int idxA1 = str.indexOf("a");
        System.out.println(idxA1);

        //lastIndexOf() method'u character veya characterlerin "son gorunumunun" index'ini veir.
        // Kara kara dusunme Ankara cumlesinde kara gelimesini indexOf'a koysak, bize 5 cevabini verir.yani
        //ilk gorunumun ilk indexini verir.
        //lastIndexOf() ise 20 verecek yani son gorunumun ilk indexini verir.


        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);


        String s = "Mississippi";
        int idxI = s.indexOf("i");//indexOf() hem String hem de char ile kullanilabilir.

        System.out.println(idxI);//1


        int idxIss = s.indexOf("iss");//ilk gorunumun ilk karakterinin indexini verir.
        // int dedik cunku coklu harf var tek olsaydi char olurdu.
        System.out.println(idxIss);

        int idxIss2 = s.lastIndexOf("iss");// son gorunumun ilk karakterinin indexini verir.
        System.out.println(idxIss2);


        //Example 1: Bir String'deki bir karakterin  tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz.
        //           Helloooo >>>   buyuk h :tekrarsiz e: tekrarsiz l :tekrarli o : tekrarli

        String t = "Helloooo";
        char c = 'e';

        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("tekrarsiz");
        }else{
            System.out.println("tekrarli");

        }
        // indexOf(  string str,fromIndex) mesela e,2 dedigimizde ilk e gorunume bak ama ilk 2 karakteri gormezden gel sonra devam et anlamina gelir

        String u = "Learn Java earn money";

        //indexOf() 2 parametre ile kullanilirsa ikinci parametrede verilen sayi kadar kaarkteri gectikten sonra istenen
        // karakterin ilk gorunumunun index'ini return eder.

       int sonuc= u.indexOf("a",4);
        System.out.println(sonuc);//11


        //lastIndexOf() methodu,verilen rakam kadar ilerler o gectigi yerdeki kisimda e varsa en son hangi e varsa onun indexini alir.
        String m = "Hello Everyone!";
        int e = m.lastIndexOf("e",10);
        System.out.println(e);
        //lastIndexOf () 2 parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en
        //bastan bu indexe kadar olan karakterleri kutu icine aliniz ve lastIndexOf methodu icindeki String ile kullanilmistir.







         //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.Eger String'de hic karakter yoksa
         // isEmpty methodu true return eder,herhangoi bir karakter varsa false return eder.
        //length()==0 demek ile isEmpty true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin length()==0 kullanmayin isEmpty() kullanin.

        String v= " ";
       boolean bosMu= v.isEmpty();
        System.out.println(bosMu);



        // isBlank() hem bos String icin hem de sadece space iceren String'ler icin true return eder.
        String x = " ";
        boolean blankMi = x.isBlank();
        System.out.println(blankMi); //true


        //Example 2: Kullanicida alinan isim mutlaka Space den farkli en az 1 karakter icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz...");
        String ilk  = input.nextLine();

        //Kullanicin space kullnarak beni aldatmasini engellemk istedim bu sebeple isBlank kullandim.

        if(ilk.isBlank()){
            System.out.println("sana ismini gir dedim..");
        }else{
            System.out.println(ilk);

        }



    }

}
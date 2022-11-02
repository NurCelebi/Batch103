package day08StringManipulation;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz isim ve soyismin ilk ve harfini ekrana yazdiriniz.

        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen isminizi giriniz.//");
//        String isim = input.next();
//
//
//        char ilkHarf =isim.charAt(0);
//
//        char sonHarf =isim.charAt(isim.length()-1);// son harfi bulmak icin kullaniriz.
        // yazdiginiz code sadece bazi durumlar icin calisirsa o code 'hard coding' denir
        //hard coding code degildir.
        //yazdiginiz code her durum icin calisirsa code 'dynamic coding' denir

//        System.out.println(" " +ilkHarf+sonHarf);// ascii degerlerini almasin diye basa bir bosluk koyariz.
//

        //2.yol:

//        String ilk = isim.substring(0,1);
//
//       String son =  isim.substring(isim.length()-1);
//        System.out.println(ilk + son);

        //substring de iki deger yaziyoruz ilk dahil ikincisi haric olarak algilar.
        //substring direk birlestirme yapiyor
        //soru bizden cahr methodi isterse char, string isterse string yani substring kullaniriz.


        //Example 2: Verilen String'deki tum hayvan isimlerini ekrana yazdiriniz
         //            " ben kedi,esim tavuk,oglum sever inek."

        String str = "ben kedi,esim tavuk,oglum sever inek.";


        //Substring'in iki kullanimi vardir.
        //1)substring(baslangic indexi,bitis indexi) String'in ortasindan bir parca almaya yarar
        //2) substring(baslangic indexi) string'in verilen index'ten sonuna kadar almaya yarar.

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
       // String inek = str.substring(34,38);//sadece 34 yazsak bile kalanin sonuna kadar gider

        System.out.println(kedi);


        //Example 3: ilk isim ve soy ismi iceren isimlerden ilk ve soyisimlerin bas harflerini ekrana yazdiriniz.
        // ali can         Tahsin Yurdakul ==> TY

        System.out.println("ilk ve soy isminizi giriniz.");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);

        String b= tamIsim.split(" ")[1].substring(0,1);

        System.out.println(a+b);

        //split space ile beraber bosluktan yani space den stringi keser yani bu soruda ali can'da aliyi keser 'can'
        //stringini tutar."[1]" bu kisim 'can'kismini almamizi sagliyor.sunstring(0,1) demek de 0 dahil 1 degil anlamina
        //gelir.ve 'c' alir .string b ise= c verir
        // Ali Can 'da [1] ali'nin indexi 0, can'in indexi 1 oluyor ve biz split ile kestikten sonra can kaliyor ve biz
        //[1] yazinca da 'can' kelimesinin indexi 1 oldugu icin [1] yaziyoruz. cunku kestik ve bizden [1] olan kismi yani 'can' istiyor




    }
}

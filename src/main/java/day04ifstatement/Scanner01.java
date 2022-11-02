package day04ifstatement;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Scanner01 {

    public static void main(String[] args) {
         /*
            Kullanicidan ilk, orta ve soy ismini aliniz ve asagidaki formatta ekrana yazdiriniz
            Ali Mert Can
            123456789
          */
        Scanner input = new Scanner(System.in);


        System.out.println("ilk ismini giriniz");
        String ilkIsim = input.next();// next methodu kullanicidan string datasi almak icin kullanilir.

        System.out.println("orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("soy isminizi giriniz...");
        String soyIsim = input.next();

        System.out.println("kimlik numranizi giriniz");
        String kimlikNumarasi = input.next();

        System.out.println(ilkIsim +" "+ ortaIsim + " "+ soyIsim );// aralarda bosluk birakmak icin +" "+ kullan.
        System.out.println(kimlikNumarasi);

        //2.yol:
        System.out.println("Ilk, orta ve soy isminizi giriniz...");
        String ilk = input.next();
        String orta =input.next();
        String soy = input.next();
        String kimlik = input.next();


        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        /*
           next() ile nextLine() farki nedir
           next() methodu kullanicidan gelen Stringin sadece ilk kelimesini alir.
           nextLine() methodu kullanicidan gelen Stringin tamamini alir.
         */

        //3.yol:
        System.out.println("Ilk ,orta ve soy isminizi giriniz...");
        String tamIsim = input.nextLine();//tum satiri alir line ile.

        System.out.println(tamIsim);

        System.out.println("kimlik numarasini giriniz");
        String kimlikNumarasi1 = input.next();
        System.out.println(kimlikNumarasi1);



    }
}

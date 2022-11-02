package day07ternarystringmanipulation;

public class NestedTernary {

    public static void main(String[] args) {

        /*
          verilen yilin 'leap year(artik yil)' olup olmadigini kontrol eden kodu yazin.
          1) yil 100 e bolunurse 400e de bolunmelidir.==> 1600 artik yil,1800 ar.yil degil,
          2)yil 100e bolunmazse 4e bolunmelidir.==> 1996 artk yil, 2001 art.yil degil
         */

        //Artik Yil: Miladi takvime göre 365 gün olan yılın 366 gün olduğu yıla denmektedir.
        // Normalde 28 gün olan Şubat ayının 4 senede bir 29 çekmesiyle artık yıl yaşamış oluruz.Dört yılda bir
        // gelen 366 günlük yil

        int year = 2022;

        String leap = year%100 ==0 ? (year%400==0 ? "leap year" : "leap year degil"): (year%4==0 ? "leap year": "leap year degil");

        System.out.println(leap);

        /*
         asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz.
         1) sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir.
         2) sekiz karakterden az karakter varsa ilk harfi'k' olmalidir
         */
         //length karakterleri sayar.

         String pwd = "i2a3ed54";

         char ilkHarf = pwd.charAt(0);

         String gecerli = pwd.length()<8 ? (ilkHarf == 'K' ? "gecerli" : "gecersiz") : (ilkHarf=='i' ? "gecerli" : "gecersiz");
         System.out.println(gecerli);


    }
}

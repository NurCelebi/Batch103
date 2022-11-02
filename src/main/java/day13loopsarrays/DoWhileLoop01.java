package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Kullanicida bir sayi aliniz. sayi 100den kucuk ise ekrana ' kazandin' yazdiriniz.
        //           Aksi halde ekrana "kaybettin!"yazdirin.
        //           Kullanici kazandikca oyun devam etmeli


        Scanner input = new Scanner(System.in);

        int sayi = 0;
        do {
            System.out.println("Lutfen bir sayi giriniz...");//bu surekli tekrar edecegi icin loop'un icine yazdik
            sayi=input.nextInt();

            if (sayi<100){
                System.out.println("kazandiniz....");
            }

        }while(sayi<100);//buraya gelince sonuc true olursa 'do' kismina yine gidecek ve busekile surekli devam edecek

        System.out.println("kaybettiniz...");
         sayi--;

        //Example 2: Kullanidan isim aliniz ve isimlerin ilk harfi buyuk mu kontrol eden kodu yaziniz...


        do {
            System.out.println("lutfen isminizi giriniz...");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf>='A' &&  ilkHarf <='Z'){
                System.out.println("ismi basariyla girdiniz...");
            }else{
                System.out.println("ismi yanlis girdiginiz icin islemnizi iptal edilmistir...");
                break;
            }

        }while(true);//sart dogruysa bu loop surekli calisir sonucta biz true ariyoruz.
        //sonsuz loop 'break' ilee kirilir...//(bu kismi tekrar dinle)


        //Infinite Loop= sonsuz dongu demek.

        //attirma-azaltma kisminda hata yaparsak sonsuz dongu olusur.yani 'i--' degil de "i++" yapsaydik sonsuz dongu olmayackti.
        for (int i = 1; i < 4; i--) {
            System.out.println("Hi");

        }
        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
         for(int i=1; i<4; ){
           System.out.println("Hi!");
        }

        //Artirma azaltma kismini yazmazsaniz "infinite loop sorunsal" i olusur.
           int i = 12;
           while(i<15){
               System.out.println("Hi!");

           }







    }
}

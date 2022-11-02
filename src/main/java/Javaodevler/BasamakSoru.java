package Javaodevler;

import java.util.Scanner;

public class BasamakSoru {
    public static void main(String[] args) {

        //Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakamlarinin toplamini ekrana yazdirin.


//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Dort basamakli bir sayi girniz...");
//        char ilkBasamk = input.next().charAt(0);
//        System.out.println(ilkBasamk);
//
//        System.out.println("ayni sayiyi giriniz...");
//        char sonBasamak = input.next().charAt(3);
//        System.out.println(sonBasamak);
//
//        System.out.println( ""+ ilkBasamk+""+ sonBasamak);

//
//         Scanner input = new Scanner(System.in);
//         System.out.println("4 bassamaklı rakam giriniz...");
//
//         byte dörtBasamaklıSayı =input.nextByte();
//
//         System.out.println("İlk rakamı giriniz...");
//         byte ilkRakam = input.nextByte();
//
//         System.out.println("Son rakamını giriniz...");
//         byte sonRakam = input.nextByte();
//
//         int toplam =(ilkRakam+sonRakam);
//         System.out.println("Sonuç:"+ toplam);






         //kullanicinin girdigi 3 baamakli sayinin tum rakamlarinin toplami ekrana yazdirin.


         Scanner input = new Scanner(System.in);


         System.out.println("Uc basamakli sayi giriniz...");
          byte ucBasamkliSayi = input.nextByte();

         System.out.println("ilk basamagi giriniz");
         byte ilk = input.nextByte();

         System.out.println("ikinci basamagi giriniz");
         byte iki = input.nextByte();

         System.out.println("ucuncu basamagi giriniz");
         byte uc = input.nextByte();

         int toplam = (ilk+iki+uc);
         System.out.println("sonuc"+ toplam);












    }

}
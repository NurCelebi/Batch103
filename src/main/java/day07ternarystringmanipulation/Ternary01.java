package day07ternarystringmanipulation;

import java.util.Objects;
import java.util.Scanner;

public class Ternary01 {


    public static void main(String[] args) {


        // Example 1: bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz.


        //1.yol:

        int a = 0;
        if (a > 0) {
            System.out.println("pozitif");
        } else {
            System.out.println("pozitif degil...");
        }


        //2.yol:
        // ternary//if suslu parantez .. yok sadece kosul yaz.ve soru isareti koymalisin
        // ternary verilen degeri bir yere koymamiz gerekiyordu.


        //condition            ?     condition dogru ise uygulanacak kod :   condition yanlis ise uygulanacak kod
        String sonuc = a > 0   ?                  "pozitif"         :            "pozitif degil";
        System.out.println(sonuc);


        //example 2: iki sayidan kucuk olani secen kodu yaziniz...

        int b = 12;
        int c = 23;

        int min = b < c ? b : c;
        System.out.println(min);


        //example 3:verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //      pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //      negatif sayilarin mutlak degeri -1 ile carpilmis halidir.(?)


        int d = -45;

        int abs = d<0 ? -1*d : d;

        System.out.println(abs);


        //example 4: iki tam sayi ayni isaretli ise bu sayilari carpiniz. farkli isaretli ise 'islem yapamaz' mesaji veriniz.

        int e =12;
        int f= 10;

        // hem yazi hem sayi ve ifadeler oldugu icin hepsinin ortak noktasi olan 'objects' class'indan islem yapariz
        //ternary farkli data tiplerinde sonuc return ederse sonucun data tipini'OBJECT' yapiniz

        Object islem =  (e>0 && f>0) || (e<0 && f<0) ? e*f : "islem yapamaz";

        System.out.println(islem);

        // note: java'da her class'in en az bir tane "parent" class'i vardir.
        // sadece 'object' clas'in "parent" class'i yoktur.
    }
}


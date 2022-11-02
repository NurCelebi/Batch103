package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {


    public static void main(String[] args) {

        /*
            kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekran ayazdiran basit bir
            hesap makinesi yapiniz...

            note: switch de sadece int,byte,short,char,String data tipleri kullanilabilir.
            note: eger 3 den fazla durum var ise switch() tercih ediyor hoca.(mesela pztden-pazara gibi)

         */

        Scanner input = new Scanner(System.in);
        char islem =input.next().charAt(0);

        System.out.println("islemi giriniz :  +,-,*,/,%");

        System.out.println("ilk sayiyi giriniz...");
        double ilk = input.nextDouble();

        System.out.println("ikinci sayiyi girniz...");
        double ikinci = input.nextDouble();

        switch (islem){


            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println(ilk%ikinci);
                break;
        }
    }


}

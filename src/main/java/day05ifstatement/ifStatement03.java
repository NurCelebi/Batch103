package day05ifstatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ifStatement03 {
    /*
       iki tane String'in birbirine esit olup olmadigini anlamak icin '==' degil 'equals()' kullanilir.
       iki tane String'i birbirine esit olup olmadigini kontrol etmek icin 2 tane method kullanilabilir.
          i) equals()==> Buyuk harf kucuk harfi onemser.'A' ile 'a' FARKLIDIR.
          ii)equalsIgnoreCase()==> Buyuk harf kucuk harfi onemsemez. 'A' ile 'a' AYNIDIR.
     */

    public static void main(String[] args) {

         //Example 1: kullanicidan gun isimlerini aliniz,o gunu hafta sonu mu hafta ici mi oldugunu kullaniciya soyleyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gun ismi yaziniz...");
        String gun = input.next();

        //1.yol:
        if (gun.equalsIgnoreCase("pazar")){
            System.out.println("hafta sonu...");
        }else if (gun.equalsIgnoreCase("pazartesi")){
            System.out.println("hafta ici");
        }else if (gun.equalsIgnoreCase("sali")){
            System.out.println("hafta ici");
        }else if (gun.equalsIgnoreCase("carsamba")){
            System.out.println("hafta ici");
        }else if (gun.equalsIgnoreCase("persembe")){
            System.out.println("hafta ici");
        }else if (gun.equalsIgnoreCase("cuma")){
            System.out.println("hafta ici");
        }else if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("hafta sonu");
        }else{
            System.out.println("gecerli bir gun ismi giriniz...");
        }

        //2.yol:
        if(gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu...");
        }else if(gun.equalsIgnoreCase("Pazartesi") ||
                 gun.equalsIgnoreCase("Sali") ||
                 gun.equalsIgnoreCase("Carsamba") ||
                 gun.equalsIgnoreCase("Persembe") ||
                 gun.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

        //3.yol: (|| OR VARSA BOOLEAN OLUR.)

            boolean haftaSonu = gun.equalsIgnoreCase("PaZar") || gun.equalsIgnoreCase("Cumartesi");


            boolean haftaIci =      gun.equalsIgnoreCase("Pazartesi") ||
                                   gun.equalsIgnoreCase("Sali") ||
                                   gun.equalsIgnoreCase("Carsamba") ||
                                   gun.equalsIgnoreCase("Persembe") ||
                                   gun.equalsIgnoreCase("Cuma");


        if(haftaSonu){
            System.out.println("Hafta sonu...");
        }else if(haftaIci){
            System.out.println("hafta ici...");
        }else{
            System.out.println("Gecerli bir gun ismi giriniz...");

        }


    }
}

package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
            Kullaniciya ay ismi sorunuz ve kullanicin verdigi ay isminden son aya kadar ekrana yazdiriniz.
         */
        // note: toLowerCase() methodu bir Stringdeki tum karakterleri kucuk harfe cevirir.
        // note: toUpperCase() methodu bir Stringdeki tum karakterleri buyuk harfe cevirir.
        //equalsignorecase iki seyi karsilastirmak icin kullanilir.bu sebele burada kullanilmaz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ay ismini giriniz...");
        String ayIsmi = input.next().toLowerCase();//kelimeyi kucuk harf olarak algilasin diye yazilir.

        switch (ayIsmi){

            //break koymamamizin sebebi bir tane ay ismi yazinca is bitmiyor tum aylari yazdirmak istiyor soru bizden.

            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;// bunu yazmazsak asagidaki default kismini da sonuclandirip yazdirir... calistirmayi birak demek.
            default:
                System.out.println("gecerli ay ismi yaziniz.");

        }
    }
}

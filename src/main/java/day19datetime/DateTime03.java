package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz.

        LocalDateTime Japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(Japonya);

        LocalDateTime Almanya =LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(Almanya);

        Long zamanFarki = ChronoUnit.HOURS.between(Almanya,Japonya);
        System.out.println(zamanFarki);//6

        //Example 2: Sabit bir tarih olusturunuz.
        //java kendisi bir depo olusturur ve oryaa koyar.
        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDate);//2011-04-13

        /*
        1)Java'da sabit datalari(gun isimleri-ay isimleri-ABD'deki eyalet isimleri-...) depolamak ve
        gerektiginde kullanmak icin depolar olustururuz.Bu depolara "Enum" denir.
         */

        //Example 3: USA icin "Woow!" ,UK icin "Big" , CANADA icin "Cold" , TURKEY icin "Vatan" ,GERMANY ICIN "Araba" ,RWANDA icin  "Cay" yazin.

        //---> 3'den fazla ihtimal varsa switch kullan.

        Countries country = Countries.TURKEY;//Enum olusturup icine data koydugumuzda artik data tipi olusturdugumuz sey olur

        switch (country){
            case USA :
                System.out.println("Woow!");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("tanimlanmamis ulke");

        }
    }
}

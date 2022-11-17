package day15arraysmultidimensionalarrays.day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: 'Anlik tarihi'(current date) ekrana yazdiran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();//java bulundugun mekandaki anlik tarihi bana ver.

        System.out.println(currentDate);//2022-10-21//bilgisayardaki tarihi alir

        //2 turlu obje olsuturulur:
        // biri yoktan varetme 'new' ile digeri donusturerek yani 'new keyword'u' kullanmadan yapilir.

        //Example 2: 'Anlik zamani'(current time) ekrana yazdiran kodu yaziniz.
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);//19:41:53.841095100(son taraf nano saniye)

        //Example 3:'Anlik Tarihi' (current date) ve 'Anlik zamani'(current time) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-10-21T19:45:50.193770700

        //Example 4: Japonya'daki anlik tarihi ve anlik saati ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        //tokyo'nun zone id'sine bak,oradaki anlik tarih ve zamani ver
        System.out.println(currentDateTimeInJapan);//2022-10-22T02:55:36.474847800

        //Example 5: Istanbuldaki anlik tarih ve anlik zamani ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul" ));
        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:55:36.476686700

        //Example 6 : Bugunde 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz\
        //Sabit bir tarih yapmamaiz gerekiyopr cunku yarin bu kodu kontrol etsem yanlis olacak.
        // ben bu sekilde yazinca yarin da bu kodu calistirsam yine ayni tarihi gorururum.spesifik  ir tarih olusturmak lazim.

        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);//2024-12-18

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.
        //sabit tarih yapmak icin 'of' kullaniriz.
        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);


//        //parse==> degisim yapiyor
//        LocalDate.parse(dobAli);

        //bunun icerisinde aradaki farki gun istedigi icin 'daqys' yazmamaiz gerekiyor.
        //between seciyoruz. cunku iki tarih arasi farki bulamamiz gerekiyor.
        //iki zamanin farki 2 milyari gecebilir o sebeple 'long' kullanacagiz.
        //() icerisine koydugumuz parametrelerde daha eski olan tarih  daha oncesine yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);//2824

//        //Example 8: Tom,Ali'den 3 yil 8 ay 13 gun sonra dogdu.Ali ise Veli'den 1 yil 15 gun once dogdu.
//        // Tom'un dogum tarihi 18 kasim 2011 ise Veli ve Ali'nin dogum tarihlerini bulunuz.
//
//        LocalDate Tom = LocalDate.of(2011,11,18);
//        LocalDate Ali = Tom.plusYears(3).plusMonths(8).plusDays(13);
//        System.out.println(Ali);

        //Example 8: Istanbul'un fethi ile;cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        LocalDate IstFet =LocalDate.of(1453,5,29);
        LocalDate CumKur= LocalDate.of(1923,10,29);

        Long aySayaisi = ChronoUnit.MONTHS.between(IstFet,CumKur);//FARK BULMA
        System.out.println(aySayaisi);//5645

        //Example 9 : Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate myDate = LocalDate.of(1989,5,13);


        //getDayOfMonth-->olusturdugumuz tarihteki gunu alir.
        int day = myDate.getDayOfMonth();

        //getMonthValue()--> method ayin degerini verir 3. - 5, gibi...
        int month = myDate.getMonthValue();

        if (day>=21 && month==3 ){//21 marttan buyuk anlamina gelir
                System.out.println("koc ");
        }else if (day<=20 && month ==4){
            System.out.println("koc");
        }else if (day>=21 && month==4){
            System.out.println("boga");
        }else if (day<=20 && month==5){
            System.out.println("boga");
        }

        if ((day>=21 && month==3 ) || (day<=20 && month ==4)) {
            System.out.println("koc ");
        }else if ((day>=21 && month==4) ||  (day<=20 && month==5)){
            System.out.println("boga");
        }

    }
}

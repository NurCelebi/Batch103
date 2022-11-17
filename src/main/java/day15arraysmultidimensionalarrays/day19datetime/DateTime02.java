package day15arraysmultidimensionalarrays.day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        //Java normal bir Dtae'i kendi formatinda verir yil-ay-gun olarak. ama biz o formati degistirebiliriz.
        //Example 1:Javadan aldiginiz Date'i ay-gun-yil olarak yaziniz.

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-10-21

        //tarih ve zamani format atici method--uzun methodlarda bas harflerden isim yaparalar
        //'MM' 10'dan kucuk aylari 01,02,03 diye yazar
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formatedDate1 =  dtf1.format(currentDate);//format() methodu bize String verir.
        System.out.println(formatedDate1);//10/21/2022


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formatedDate2 =  dtf2.format(currentDate);//format() methodu bize String verir.
        System.out.println(formatedDate2);//Oct/21/2022

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formatedDate3 =  dtf3.format(currentDate);//format() methodu bize String verir.
        System.out.println(formatedDate3);//October/21/2022

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("M/dd/yyyy");
        //'M' 10'dan kucuk aylari 1,2,3 diye yazar.
        String formatedDate4 =  dtf4.format(currentDate);//format() methodu bize String verir.
        System.out.println(formatedDate4);//10/21/2022


        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM/dd/yy");
        String formatedDate5 =  dtf5.format(currentDate);//format() methodu bize String verir.
        System.out.println(formatedDate5);//10/21/22


        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("MM/d/yy");
        //'d' 10'dan kucuk gunleri 1,2,3 seklinde yazar.01,02,,03 kullanmaz.
        String formatedDate6 =  dtf6.format(currentDate);//format() methodu bize String verir.
        System.out.println(formatedDate6);//10/21/22

        //Example 2: Java'dan aldiginiz Time'in formatini degsitiriniz.

        LocalTime myTime = LocalTime.of(16,23,54,2345);
        System.out.println(myTime);//16:23:54.000002345

        DateTimeFormatter dtf7= DateTimeFormatter.ofPattern("HH:mm");
        //'HH' 24 saat sistemini 'hh' 12 saat sistemini kullanir.
        String formattedMyTime1 = dtf7.format(myTime);
        System.out.println(formattedMyTime1);//04:23//16:23

        DateTimeFormatter dtf8= DateTimeFormatter.ofPattern("hh:mm a");
        //'HH' 24 saat sistemini 'hh' 12 saat sistemini kullanir.
        String formattedMyTime2 = dtf8.format(myTime);
        System.out.println(formattedMyTime2);//04:23 PM



    }
}

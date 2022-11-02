package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch() methodu: bu methodu kullanarak bir elemanin Array'de olup olmadigini anlariz.
        //                          binarySearch methodunu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.
        //                          binarSearch methodu'nda aradiginiz eleman array'de varsa o elemanin indexine return eder.
       //                           binarySearch method'u aradiginiz lemean Array'de yoksa "-a" seklinde bir negatif sayi aliriz.
        //                          Bu sayidaki "-" Anlami bu Arrya'de eleman yoktur , "a" nin anlami ise olsaydi kacinci sirada olurdu anlamina gelir


        //Note: binarySearch(); METHOD'U TEKRARYLAYAN ELEMANLAR ICIN KULLANILMAZ.

        int arr[]= {12,31,43,14};

        int sayi1 = 43;//43 var mi diye arastirmak icin yaptik mesela.

        Arrays.sort(arr);//elemanlari kucukten buyuye siraladi.[12,14,31,43]

        int idx1 = Arrays.binarySearch( arr,sayi1 ); //ilk once array ismini yazariz sonra da sayiyi yazmamiz lazim
                                                   //arastir arr'de 43'u anlamina gelir.
                                                   // sort yaptiktan sonraki array'de indexini soyler.
        //anakodun icine deger yazmamaya dikkat ederiz cunku 43 degisir baska bir sayi gelebilir.
        // anakod ve icindekiler kolay kolay degistirilmez.
        System.out.println(idx1);//3

        //bir array'de bir elemanin var olup olmadigina bakar
        // binarSearch kullanmadan once mutlaka 'Arrays.sort' methodu kullanilmalidir.
        //binarySearch methodu eger eleman o array'de varsa onun indexini bize verir.
        // Sort kullanmazsak eger binarySearch bazen dogru bazen yamlis bilgi verebilir.
        //string'lerde contains kullaniyordurk.ama contains true false return eder. ama burada true false return etmeyecek.

        int sayi2 = 17;
        int sonuc = Arrays.binarySearch(arr,sayi2);
        System.out.println(sonuc);//(-5) "-" ==>  anlami yok demektir.
                                  //      "5" ==> ise bu sayi olsaydi hangi sirada  olurdu onu gosteriuyor.


    }
}

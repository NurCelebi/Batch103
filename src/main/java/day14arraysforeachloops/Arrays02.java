package day14arraysforeachloops;

import java.util.Arrays;
import java.util.Comparator;


public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
        //kucukten buyuye dogru siralama==> sort kucukten buyye siralamada kullanilir.


        int original[] = {0, 2, 3, 0, 12, 0};

        int  yeni[] = new int[original.length];//eleman sayilari yeni ve orjinal ayni olmali.

        int idx = 0;//yeni array'de ilk indexe koyacagimiz sey degisecek o sebeple yeni index olusturmak gerekir.

        for (int i =0 ; i<original.length ; i++){

            if (original[i] !=0){
                yeni[idx] = original[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2 : Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini  kodu yaziniz.
        //            [2,1,2,-3,2]====> kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi.
        //                        ====> kullanici 6'yi sordu==> 6 elemani yok ve 0 kere kullanildi.



        int arr[] = {2,1,2,-3,2};//array olusturduk

        int counter = 0;//'FLAG" denir. bazi durumlarin olup olmadigini kontrol etmek icin 'flag' kullanilir

        int eleman = 2;//kullanici bir eleman istedi ya o yuzden olusturduk

        for (int w : arr){//array old icin for loop yaptik

            if (w==eleman){//array'in icindeki eleman kullanicinin arastirdigi eleman esitse say diyoruz yani1,2,3... diye sayacak
                counter++;//bu kac tane old saymak icin koyduk.//esitse bir kere arttir yien varsa yine sayacak

            }
        }

        if (counter>0){//saydiricaz kac tane eleman oldugunu
            System.out.println(eleman + "array'de" + counter + "defa var");
        }else {
            System.out.println(eleman + "array'de yok");

        }

        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
        //           Java kolaydir calisana, ne kolay ki calismayana ===> calismayana yazdirmasi gerek.

        String sentence = "Javaaaaaaaaaaa kolaydir calisana, ne kolay ki calismayana. ";

        sentence= sentence.replaceAll("\\p{Punct}","");//noktalama isaretlerini yoketmek icin kullanilir.
        System.out.println(sentence);

        String words[]= sentence.split(" ");//bize array verir ve string'i bolmeye yarar

//        Arrays.sort(words);
//
        Arrays.sort(words, Comparator.comparingInt(String::length));//karsilastirici-== java karsilastircini kullan karsilastirmayi string'lerin uzunluklarina gore yap

        System.out.println(Arrays.toString(words));//[Java, calisana, calismayana, ki, kolay, kolaydir, ne
        //bu bana alfabeye gore siralama  yapti 'J' buyuk old. icin en basa aldi.
        // en son elemanda en uzun kelimeyi yazdi.


        System.out.println(words[words.length-1]);//calismaya//son elemani bulmak icin bu kodu yaziyoruz

        //sort'un ikinci kullanimi ilki array ikincisi istedigimiz sekilde duzenleyebiliyoruz.








    }
}

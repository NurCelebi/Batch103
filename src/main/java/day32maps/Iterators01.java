package day32maps;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //loop'lar kendi baslarina list'leri(collection) update edemiyorlar.Bu yuzden java 'iterator' leri olusturdu.
        //Iterator'lar Collection'lari update etmek icin kullanilir.
        //FOR LOOP KULLANARAK HER ELEMANIN SONUNA '!' EKLEYINIZ.
        for (String w : myList){
            w = w + "!";

        }
        System.out.println(myList);//[Z, K, A, J, M]


        //%90 while kullanilir
        ListIterator<String> itr =myList.listIterator();

        //bir sonraki eleman var mi diye kontrol eder.
        while(itr.hasNext()){
           String el = itr.next();
           itr.set(el + "!");

        }

        System.out.println(myList);//[Z!, K!, A!, J!, M!]

        /*
        list'i listIterator'a cevirdihimizde [ Z, K, A, J, M] koyar.en basa bir pointer koyar.normalde list'lerde bu pointer
        yoktur ama listIterator'de vardir. next ile elemani aldi el'e koydu. set ile de el'e ! ekledik.
        tekrara basa doner hasnext kullanir ve z'den sonra eleman var mi diye sorar burasi true olunca while icinde kod
        calisacak. diger elemana gider next ile.
         */

    }
}

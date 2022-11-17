package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Map01 {

    public static void main(String[] args) {

        //size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz.
        //"I like to move it, move it."==> I=1 , Like =1, to=1, move =2, it=2

        String str = "I like to move it, move it.";

        //noktalam isaretlerini sil
        str= str.replaceAll("\\p{Punct}","");
        System.out.println(str);//I like to move it move it


        //kelimeleri almak icin split() kullanalim
        String[] kelimeler=  str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[I, like, to, move, it, move, it]

        //her kelime kac kere gozukuyor--hashmap sira yapmaz sirasi farkli olabilir.
        HashMap<String,Integer> gorunum = new HashMap<>();//{                  }


        //for each yaptim cunku array ile kullaniyorum.
        for (String w:kelimeler){

            Integer gorunumSayisi = gorunum.get(w);

            if (gorunumSayisi==null){


                gorunum.put(w,1);

            }else {
                gorunum.put(w,gorunumSayisi+1);

            }

            System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}
        }


        /*
        ilk 'I' alacak bakacak hic yok o yuzden ilk basta 'null'dir.If kismina geldigimizda eger null ise 1 degeri
        ile map'in icine git i'yi 1 diye yerlestir demek.sonra 'like' alacak w'nun icine koyacak simdi w 'like' oldu.
         gorunum map'ine gidecek ve acaba like'in
        value'su ne diye bakacak ve yine 'null' olacak gorunumsayisi.if kismina geldik like'i 1 degeri ile put yapti.
        put(like,1)--> map'e gel like 'i 1 ile degistir demek.sonra 'to'yu w'nun icine koyduk.Java gorunum map'ine
        gidecek to var midye bakacak ve gorunum sayisi yine 'null' oldu. yine put.(to,1) baktik ve out yerine 1 yazdik yine.
        simdi 'move' koyuyoruz w'nun icine.gorunum methoduna gidecek map'de var mi diye bakacak.null oldugu icin 1 yazdik.
        ayni islemi 'it' icinde yapti ve yine 1 degeri ile map'in icine put yaptik. tekrar 'move' geldi bu map icinde 1 olarak gozukuyordu.
        if kisminda 1==null oldu yanli oldugu icin else kismina gittik ve burada put methodu ile move,2 oldu .
        yani artik move'u 2 ile degistirecegiz.
        ayni key'i kullanirsak ustune yazar-->map'lerde

         */



    }
}

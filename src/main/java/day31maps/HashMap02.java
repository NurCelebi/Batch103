package day31maps;

import java.util.HashMap;

public class HashMap02 {
    /*
         1)Siz 'HashMap<String,Double> salaries = new HashMap<>();' kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir
       yapi olusturur ve bu yapidaki herbir kutuya index verir.Indexler 0'da 15'e kadardir.
         2)Siz ' salaries.put("QA",110000.00);' kodunu yazdiginizda Java,key icin bir HashCode olusturur.Bu HashCode'u 15'e
       boler ve kalani index olarak kullanir..Ve bu elemani o index'e yerlestirir.
         3)Yerlestirirken 4lu bir yapi olusturur.Bu yapinin ilk bolumune 'HashCode'u ikinci bolumune 'key'i,ucuncu bolume 'value' ve
       dorduncu bolume 'pointer' i koyar.bu cok bolumlu yapi LinkedList'lerdeki 'Node' dur.Yani HashMap bucket'lari
       koydugu datayi LinkedList olarak depolar.
         4)Java 'null' icin hep HashCode olarak 'zero(0)' uretir,o yuzen key 'null'oldugundaeleman ilk bucket'a yerlestirilir.
       Bundan dolayi key'si 'null' olan elemanlar Map'in icinde genellikle ilk sirada gozukurler
         5) Java normalde HashCode'lari unique yapar ama bazen trafik kazasi gibi iki eleman icin ayniHashCode uretilebilir.Buna
       'Hash Collision'denir.Hash Collision meshur bir Java Development problemidir.Bu problemle karsilastiginda developer'lar bu problemi cozmek
        icin kodlar yazarlar,ama bu Core Java'nin konudu degildir.
     */

    public static void main(String[] args) {
        HashMap<String,Double> salaries = new HashMap<>();
        //biz yukaridaki kodu yazdigimizda java memory'de 16 tane kutu olusturur ve indexler(0-15)

        salaries.put("QA",110000.00);
        //java key'e bakarak HashKod olusturuyor.QA'ye bakti sonra hashkodu 15'e boler kalan sayi index oluyor ve o
        //index'e gidip 4'lu bir kutu olusturuyor iceride.Bu 4lu kutunun icine en basa ilk hashkodu'u koyar,
        // 2.kutuya key'e koyar,3.kutuya value koyar,4.kutuya da pointer koyuyor.Qa 33 olsun mesela
        //HashCode'lar uniwue olur ama bazen olmayadabilir.Bu bir problemdir javada.



        salaries.put("Dev",130000.00);



        salaries.put("SalesForce",125000.00);
        //mesela hashkod 48 olsa kalan 3 olacak yine 3.indexe gidecek ama lorda QA vardi.olsun yine oraya gider oraya koyar.
        //kalanlar ayni olsa bile ayni kutuya birden fazla eleman koyabilir.
        //HashMap kutularin icerisinde LinkedList kullaniyor yani  yan yana diziyor.
        //key null oldugunda Hashkod hep 0 verir.0'da hep ilk kutu oldugu icin null'i hep en uste gosterir.
        //gerek olursa java ilk 16li da calisir lazim olursa 2.sine yapip kullanabilir.
    }
}

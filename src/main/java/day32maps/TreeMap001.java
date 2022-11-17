package day32maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap001 {

    /*
      Tree kelimesini duyunca aklimiza natural order gelecek.Stringlerde alfabedik siralama; sayilarda kucukten buyuge siralama akla gelir.
      1)TreeMap'ler entrySet'leri key'lere gore 'natural order' da siralar.
      2)natural order'da calisma zaman ister.TreeMap'ler en yavas map'lerdir.
      3)TreeMap'ler thread-safe ve syncronized degildir.

      hiz lazimsa-->hashMap
      siralama lazimsa-->TreeMap

      1) TreeMap'ler entrySet'leri key'lere gore "natural order" da siralar.
      2) TreeMap'ler en yavas map'lerdir. (hiz istiyorsak tek opsiyon HashMap)
      3) TreeMap'ler tread-safe ve syncronized degildir. (bunlar sadece Hashtable da mumkun)
     */

    public static void main(String[] args) {

        TreeMap<String,Double> salaries = new TreeMap<>();

        salaries.put("Tom Hanks",3000.00);
        salaries.put("Marry Star",1000.00);
        salaries.put("Jimmy Jones",5000.00);
        salaries.put("Kevin Bridgeman",6000.00);

        System.out.println(salaries);//{Jimmy Jones=5000.0, Kevin Bridgeman=6000.0, Marry Star=1000.0, Tom Hanks=3000.0}
                                     // -->Alfabetik siraya gore aldi.


        //tailMap() methodu verilen key'den baslayarak sona kadar tum entry'leri bize verir.
        SortedMap<String,Double> map1 =salaries.tailMap("Kevin Bridgeman");
        System.out.println(map1);//{Kevin Bridgeman=6000.0, Marry Star=1000.0, Tom Hanks=3000.0}

        //salaries.tailMap("Kevin Bridgeman");




        //tailMap(String,boolean) verilen key'den baslayarak sona kadar verir tum entry'leri bize verir, verdigimiz key'i haric tutar.
        SortedMap<String,Double> map2 =salaries.tailMap("Kevin Bridgeman",false);
        salaries.tailMap("Kevin Bridgeman", false);
        System.out.println(map2);//{Marry Star=1000.0, Tom Hanks=3000.0}


        salaries.subMap("Kevin Bridgeman",true,"Tom Hanks" ,false);
        NavigableMap<String, Double> map3 = salaries.subMap("Kevin Bridgeman",true,"Tom Hanks" ,false);
        System.out.println(map3);//{Kevin Bridgeman=6000.0, Marry Star=1000.0}


        //lowerEntry("Mary Star")--> marry star'dan bir oncekini verir.
        Map.Entry <String,Double> map4 = salaries.lowerEntry("Marry Star");
        System.out.println(map4);//Kevin Bridgeman=6000.0

        //varolmayan key koyarsak sanki o key varmis gibi dusunur ve bir oncekini verir.
        //lowerEntry("Paris Hilton")-->Paris Hilton'dan bir oncesini verir.Paris hilton olmasa da sanki varmis gibi davranir.
        Map.Entry <String,Double> map5 = salaries.lowerEntry("Paris Hilton");
        System.out.println(map5);//Marry Star=1000.0


        //higherEntry('marry Star')--> mary star'dan bir sonrakini veririr.
        Map.Entry<String,Double> map6 = salaries.higherEntry("Mary Star");
        System.out.println(map6);//Tom Hanks=3000.0

        Map.Entry<String,Double> map7 = salaries.higherEntry("Tom Hanks");
        System.out.println(map7);//null verdi cunku tom hanks'den sonra eleman yok.


        //cellingEntry()--> varolan key 'le kullanilirsa o key'i verir.Varolmayan bir key ile kullanilirsa bir sonrakini verir.
        Map.Entry<String,Double> map8 = salaries.ceilingEntry("Mary Star");
        System.out.println(map8);//Tom Hanks=3000.0



        Map.Entry<String,Double> map9 = salaries.ceilingEntry("Paris Hilton");
        System.out.println(map9);//Tom Hanks=3000.0





    }
}

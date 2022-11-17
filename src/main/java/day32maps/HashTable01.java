package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
      1)HashTable bir map'dir.
      2)HashTable entrySet'leri herhangi bir siralamaya tabi tutmaz.
      3)HashTable,HashMap'lerden daha yavastir.Cunku hashTable thread-safe ve synchronized.bunlari yapmak icin zaman harcar.
      hashMap ,HashTABLE HIZLIDIR AMA COKLU I YAPACAKSAK HashTable kullanilir.
      4)HashTable'larda key null olamaz..Kry'i null yaparsak NullPointerException atar.
      5)HashTable'larda value 'null' olamaz.Value'yu null yaparsak NullPointerException atar.



      ayni anda birden fazl is yapma -->thread-safe
      coklu islerin zaman kazandiracak sekilde siralanmasi.zamanda safe etmek icin kullanilir-->sycgronized

      Note:toString() method'u objeleri konsolda detaylari ile gorebilmek icin class'larin icinde olustururlur.
           toString() methodu'nu olusturtmadan object'i console'a yazdirirsak Java o object'in adresini yazdirir.

     */

    public static void main(String[] args) {

        Hashtable<String,Integer> countryPopulation = new Hashtable<>();
        countryPopulation.put("USA",400000000);
        countryPopulation.put("Germany",83000000);
        countryPopulation.put("Turkiye",90000000);
        System.out.println(countryPopulation);//{USA=400000000, Germany=83000000, Turkiye=90000000}

        //countryPopulation.put(null,90000000);//hashTable'larda key null olamaz.NullPointerException atar.


        //countryPopulation.put("France",null);//NullPointerException atadi.

        /*
        INTERWIEW QUESTIONS
        MAP'LER ARASINDAKI FARKLAR
        1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
                HashTable synchronized ve thread-safe dir.

        2) Treemap'ler natürel order yapar.
        LinkedHashMap giriş sırasına göre listeler.
                HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

        3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
        TreeMap'lerde key'ler icin "null" kullanılmaz.
                HashTable larda ikisi içinde null kullanılmaz.
       */


        //kensdi olusturdugum hashtable ' iceri yazabildim.
        Hashtable<String,Students> myStudents = new Hashtable<>();
        myStudents.put("Math",new Students("Tom Hanks","th@gmail.com",21,true));
        myStudents.put("Science",new Students("MAARY Star","ms@gmail.com",32,false));

        System.out.println(myStudents);//{Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}
        //mat-->key student... devami value olur.toString ile gorduk.eger olmasaydi HashCode verirdi.yani stack memory'de ki
        //adresini gorururz.Objeyi yazdirmak icin toString koyman gerekir.


        //Students name = myStudents.get("name");
        //System.out.println(name);//null verdi.cunku get methodu key ile calisir.burada key sadece Math'di .yani Tom Hnak'e
        //ulasmak icin name kullanamam.Math deseydim hepsini gorecektim.

        String name = myStudents.get("Math").name;
        System.out.println(name);//Tom Hanks sadece ismi istersem yukaridaki gibi kodu yazmama lazim

        int age =myStudents.get("Math").age;
        System.out.println(age);//21//sadece yasi istersem yukaridaki gibi yazmam lazim

       // HashTable'a yazdirdigim degerleri tek tek gormek istersem yukaridaki yaptiklarim gibi hareket etmem lazim.'






    }
}

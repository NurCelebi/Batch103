package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList001 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Taceddin]


        //removeAll ilk List'i degistirir.ikincisi degismez. ama degismesini istediklerimiz icin yeni bir List olustururuz
        List<String> cities = new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);
        System.out.println(names);//[Thomas, Tahsin]
        System.out.println(cities);//[Trump, Tom, Taceddin]


        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsine");


        //Stringlerde her zaman buyuk harf kucuk harf fark eder.Ascii degerler farkli cunku
        boolean sonuc1 = names.containsAll(myNames);
        System.out.println(sonuc1);//false--> Bir Llist'in icinde coklu eleman var olup olmadigini kontrol eder. hepsi varsa 'true' bir tanesi dahi yoksa 'false' verir.


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");


        //Example 1: list'indeki Shoes'u ilk gorunumunu siliniz
        a.remove("Shoes");
        System.out.println(a);//[TV, Radio, Laptop, Shoes, Book, Shoes]


        //Example2 : List'indeki 'shoes' elemaninin tum gorunumlerini siliniz.
        //removeAll kullanmak icin yeni bir List olmasi gerekiyor. o yuzden yeni List olusturacgaiz

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]


        //Example 3:Bir tane salary(maas) List'i olusturun. eger salary 10000'den az ise %20 , 10000'den cok ise %10 zam yapiniz.
        //salary'den bahsettigimizde Double kullaniriz.

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.00);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        for (Double w : salary) {

            if (w < 10000) {

                salary.set(salary.indexOf(w), w * 1.2);//salary'de degisiklik olacagi icin set kullaniyoruz.

                //%20 zam yapmak demektir.
            } else {

                salary.set(salary.indexOf(w), w * 1.1);

            }

        }
        System.out.println(salary);//[13579.500000000002, 10408.8, 16500.825, 11400.0, 22550.000000000004]
        //set metjodu var olan elemani degistiriir. bunun icin index'e bakar


        //Example 4 : iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz.
        //2 ArrayList'in esit olabilmesi icin elemanlar esit olmali ve ayni elemanlar ayni index'te olmalidir.
        //List'lerin eleman sayilari farkli ise esit olamazlar.


        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        //m.add('t');
        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.Way:
        int counter = 0;//Flag- bazi dururmlarin olup olmadigini konterol etmeye eyarar

        for(int i=0; i<m.size(); i++){
            if(m.size()!=n.size()){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }else if(m.get(i) != n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if(counter==0){
            System.out.println("Listler esittir");
        }

        //2.yol :
       boolean esitMi = m.equals(n);

        if (esitMi){
            System.out.println("listeler esittir");
        }else{
            System.out.println("listler esit degildir" );
        }


    }

}

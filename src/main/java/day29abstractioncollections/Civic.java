package day29abstractioncollections;

/*
"multiple parent(birden çok parentli) interface kullandığınızda aynı mtehod ismi ile
birden fazla method oluşturursanız bu methodların return type lari aynı olmalidir.Aksi takdirde hata verir.
Çünkü java hangisini seçeceğini bilemez.  ==> void price();  ile   int price();  gibi

    abstract methodlar sadece be yapilacagini soyler(what to do)
    concrete method'lar ne yapilacagi ile birlikte nasil yapilacagini(how to do ) da soyler.

    interface'ler bir yapilacak isler listesidir.(to do list)

    multiple parent interfadce kullandigimizda ayni method ismi ile birden fazla method olusturursak bu methodlarin
    return type'lari ayni olmalidir.Aksi takdirde hata veriri(price olayinda)

    interface'lerde constructor olmadigi icin interface'lerden object olusturulamaz.Variable'lar hem static hem final'dir hem de public'dir.

    abstract class'larda class olduklari icin constructor vardir.Ama constructor'lar abstract class'larda object olusturamazlar.
    constructor'larin ana yarari object olustururlar.java'da 2 seyden object olusturulmaz 1)abstract classlar 2)interface'ler

    Javada interfacelerden(constructor yok çünkü) ve abstract class lardan object oluşturulamaz.
    -->interface class degildir farkli bir yapidir.

Soru: "Abstract Class" ile "Interface" in farklari nelerdir?
       1)Method
            "Abstract Class" hem abstract hem de concrete method lar icerebilir.
            "Interface" ler ise sadece abstract method'lar icerir.
            Ama istersek interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method lar olusturabiliriz.

       2)Variable
            "Abstract Class" larda normal Class'lardaki gibi her turlu variable olusturulabilir.
            "Interface" lerde ise variable'lar public static ve final olmak zorundadir.

       3)Inheritance
            "Abstract Class" lar class olduklari icin multiple inheritance'a musaade etmezle.
            "Interface" ler ise multiple inheritance'i desteklerler.

       4)Object Creation
            "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
            "Interface" lerde ise constructor olmadigindan object olusturulamaz.

Soru: Object Oriented Programming Language prensipleri(principles) nelerdir?
       i)Inheritance   ii)Polymorphism   iii)Encapsulation   iv)Abstraction

ABSTRACT vs INTERFACE
   1) Abstract :
    1.1 - Class`dir.
    1.2 - Abstract ve concrete method`lar konabilir.
    1.3 - Kismi olarak abstraction saglar.
    1.4 - Birden fazla abstract class`a direk child olunamaz. Coklu inheritance`i desteklemez.
    1.5 - Hiz acisindan avantajlidir
    1.6 - Icindeki tum nesnelerin public olmasi zorunlu degildir.
    1.7 - Soyut olmayan metodlar static olarak tanimlanabilir.
    1.8 - Abstract class constructor`a sahiptir
    1.9 - "Abstract class" larda normal Class'lardaki gibi her turlu variable olusturulabilir
   2) Interface :
   2.1 - Class degildir.
   2.2 - Sadece abstract method`lar konabilir.Ama istersek interface'ler icinde de
         "default" ve "static" keywordler kullanarak concrete methodlar olusturabiliriz
   2.3 - Tam abstraction (soyutluk) saglar.interface'lerdeki tum method'lar "abstract" olmak zorundadir.
   2.4 - Bir class`dan istediginiz kadar interface`i inherit edebilirsiniz. Coklu inheritance`a uygundur.
   2.5 - Hiz acisindan abstract class`a gore yavastir.
   2.6 - Icindeki tum nesnelerin public olmasi gerekir.
   2.7 - Normalde Method'lar static olamaz ancak Interface'lerin icine concarate method konulamaz.
        Devoloper'lar bu sorunu cozebilmek icin istisnai bir durum olarak; tipki kirmizi isikta
        gecilmez; amaa itfaiye polis gecebilir gibi istisnai olarak concreate method uretebilmek icin
        default ve static keyword kullanarak body'si olan method olusturulabilir.static keyword'u ile olusturursaniz
        static method olusturmmus olursunuz.
   2.8 - Interface constructor`a sahip degildir
   2.9 - "Interface" lerde ise variable'lar, public static ve final olmak zorundadir.
      */


public class Civic implements Engine,Ac{

    public void run(){
        System.out.println("civic runs well");
    }


}

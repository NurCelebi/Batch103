package day21accessmodifiersinheritance;

public class AnimalRunner {

    public static void main(String[] args) {

        //runner'larin icine main method koyariz.
        //javada her class'in ortak babasi olan bir class'i vardir.--> Object Class'idir.
        //gordugumuz diger methodlar ise Object Class'dan geliyor equals, hashcode ... gibi

        /*
        1)inheritance sayesinde
           i)kod tekrarlarindan kurtuluruz.
           ii)Code tamiri(maintance)kolay olur.
           iii)Child Class'lari daha atomic yapmis oluruz.

         2)Bir Class'i baska bir class'in Chil Class'i yapmak icin
         "extends" keyword'u kullanilir.Ilk yazilan Class Child,ikinci yazilan Class parent olur

         3)Child Class object'leri Parent Class'dan method ve variable'lari kullanabilirler.

         4)Parent Class object'leri Chil Class'dan method ve variable'lari kullanamaz.

         5)Object Class her Class'in parent'idir.
         Java da Object Class haric her Class'in parent'i vardir.
         Java'da parent'i olmayan tek Class--> Object Class'dir.

         6)private method ve variable'lar Child Class'lar tarafindan kullanilamazlar.
           protecd method ve variable'lar Child Class'lar tarafindan kullanilabilir.
           default  method ve variable'lar ayni package'deki  Child Class'lar tarafindan kullanilabilir.
           'public' method ve variable'lar Child Class'lar tarafindan kullanilabilir.
           NOTE: Child Class'lar tarafindan kullanilabilir olmak 'inherit' edilebilir demektir.

           7) 4 tip inheritance vardir.
              i)Multilevel Inheritance: Java bunu kabul eder
              ii)Hierarchical Inheritance : Bir parent icin coklu child; java bunu kabul eder.
              iii)Multiple Inheritance : Bir Child'a coklu Parent demek; Java bunu desteklemez.(Java doesn't support Multiple Inheritance)
              iv) Single Inheritamce : Bir Child Class icin bir Parent Class demektir,Java bunu destekler.-->parent deyince bir ustekini anlamamiz gerekir.



         */

            Cat c1 = new Cat();
            c1.eat();//Animals eat...
            c1.drink();//Animals drink...
            c1.meow();//Cats meow...


            Dog d1 = new Dog();
            d1.eat();//Animals eat...
            d1.drink();//Animals drink...
            d1.bark();//Dogs bark...







    }
}

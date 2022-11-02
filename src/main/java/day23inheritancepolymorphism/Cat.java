package day23inheritancepolymorphism;



public class Cat extends Mammal {

    public void meow(){

        System.out.println("Cats meow...");
    }

    @Override
    public int add(int a, int b) {//mesela short yapsam hata verir-long yapsam buyuk yapsamda hata verir
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Animal create() {
        return new Mammal();
    }

    //asagidaki method  overriding olarak adlandirilir
    @Override//@override annotationa'ini kullanarak javanin yaptigimiz override islemini kontrol etmesini sagliyoruz.
    public void eat() {
        //super.eat();//parent'a git eat'i kullan.ama biz bunu degistrimak istiyoruz.super() silcez.
        System.out.println("cats eat");



     //child Class'da spesifik bir degisiklik yapmak istedigimizde overriding yapariz.

        /*
        1)Override yaparken method'un body'si degisir.
        2)override yaparken ASLA method signature'a dokunulmaz.yani eat()ve () icine parametreler kismi degistirilemez.
        3)override yaparken inheritance olmak zorundadir
        4)override yaparken access modifier'lar belli kurallara gore farklilastirilabilirler.
          1)private methodlar override edilemezler.
          2)child class'daki override edilen method'un access modifier'i pareny classdaki methodun access modifier'i ile
          ayni veya daha genis olmalidir.
          note:child class'daki method'un access modifier'i daha dar olamaz.
          3)default methodlar ayni package icindeyse override edilebilirler.
            farkli package'den override edilemezler
       5)parent class'daki methodun return type'i void ise return type degistirilemez.
       6)parent class'daki methodun return type'i primitive  ise return type degistirilemez.
       7)parent class'daki methodun return type'i wrapper class  ise return type degistirilemez.
       8)parent class'daki methodun return type'i Parent Class  ise return type Child'lardan biri olabilir
       note:child class'daki return type parent class'dakinden genis olamaz
       note:aralarinda pareny-child iliskisi olmayan class'lar overriding'de return type degisiminde kullanilamazlar.
       Mesela Short Integer'dan kucukur fakat aralarinda parent-child iliskisi olmadigindan Integer yerine Short kullanilamaz.
       note:child'daki method'un return type'indan parent'daki methodun return type'ina gidiste 'IS-A' relationship olmalidir.
       note:Arlarinda 'IS-A' relationship olan data type'lara 'covariant'denir.


       Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
      HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içerm

      9)'final' method'lar override edilemezler cunku overriding'de method body degistirilir.fakat 'final' method body degistirilmesine musaade etmez.
      10)Polymorphism = Overloading+Overriding'dir.
         Note :polymorphism nedir?--> denirse overloading ve overriding anlatin

         12)Overloading ile Overriding arasindaki farklar nelerdir?
           i)Overloading icin 'inheritance'gerekmez,fakat 'overriding'icin gerekir.overloading sadece bir class icinde oluyor.parent-child gerekmez.
           ii)private methodlar overload edilebilir.override edilemezler.overload-->bir class icinde oluyor cunku ayni classtakilere ulasabiliyorsun.
           iii)final methodlar overload edilebilir,override edilemezler.overload-->parametrelere doknuyorum o sebeple sorun olmuyor-override da body
           iv)overloading static polymorphism olarak ,Overriding dinamic polymorphism olarak adlandirilir.
           -->cunku static methodlar overload edilebilir,override edilemezler.
           v)Overloading'de method signature degisir ama overriding'de method signature dokunulmaz.

         */
    }
}

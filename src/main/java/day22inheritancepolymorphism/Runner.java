package day22inheritancepolymorphism;



public class Runner {

    public static void main(String[] args) {

        //inheritance'de variable'lar secilirken Java object'in data tipine bakar.
        //oncelikle istediginiz variable'i Object'in data tipi olan Class'da arar.

        Cats cat1 = new Cats();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45


        Mammals cat2 = new Cats();
        System.out.println(cat2.a);//13

        Animals cat3 = new Cats();
        System.out.println(cat3.a);//12

        //Object olustururken Object'in data tipi Child Class'lardan secilemez.
        //inheritance variable'lar secilirken Java Constructor;a bakar.
        //oncelikle istediginiz method'u Constructor'i kullanilan Class'dan alir.
        //O Class'da bulamazsa Parent Class'lara bakar.
        //Hicbir yerde o method'u bulamazsa hata verir.
        //constructur isimleri Class ismiyle ayni olmalidir.
        //inheritance sayesinde tekrari ve surekli kod yazmayi onlemis oluyoruz.
        //inheritance yazmak istedigimiz veya duzeltmek istedigimiz kod varsa bunlari cok kolay bir sekilde duzeltmemizi saglar.
        //mesela bir class'i baska bir class'in child olarak yaparsak ve 1000 tane child class olsa yanlis method yazsak
        // veya update etmek istesek sadece bir tanesine kodlari yazsak hersey cok kolay olur.
        //inheritance bir kavram olarak bilinmesi gerekir.faydalari ve nasil kullanildigini bilmemiz gerekir.


        Cats cat4 = new Cats();//constructor Cat() oluyor
        cat4.eat();//Cat eat
        cat4.drink();//Mammal drink...


        //Cat cat5 = new Mammal();//boyle birsey olamaz.
        Mammals cat5 = new Mammals();
        cat5.eat();//Mammal eat


        Animals cat6 = new Animals();
        cat6.eat();//Animal eat







    }
}

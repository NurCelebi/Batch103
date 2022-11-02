package day22inheritancepolymorphism;

public class CatRunner {
    public static void main(String[] args) {

        //constructer --> public Animal()... gibi yazilir class adi ile ayni olmalidir.
        //her constructer'in ilk satirinda gorunmeyene super() vardir.biz on=bject olustururken cat constructor kullan dedik ve ilk satirda super() var.
        //bu kodu anlami parent'daki constructor'i bul anlamina gelir.
        //mesela cat'in parent'i mammal'dir. Mammal'a gider eger cat class'da yoksa . eger mammal'de yok animal'da varsa conturcter'a oraya bakilir.
        //Yani yukariya dogru surekli tirmanir object class'a kadar.
        //sonra geri gelir. ver ekrana en ustten alta dogru ne varsa yazdirir.
        //super() ne ise yarar--> super() BIZIM CHILD CLASS'DAN PARENT CLASS'A GIDIP ORADAKI CONTRUCTOR'LARI KULLANMAMIZI SAGLAR.
        //super() parent constructer'i cagirmamizi saglar.
        /*
        Java'da Object olustururken once  Constructor'lar parent'dan Child'a dogru calistirirlir.
        Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
        "super()" kodu her constructor'in ilk satirinda gizli olarak bulunur.
        super() kodunu istersek gorunur sekilde de yazabiliriz,java kizmaz
        "super() kodunu gorunur sekilde yazarasak sakin haa ilk satir disinda bir satira koymayiniz,hata verir.
        super() kodu parent class'dan constructor cagirmaya yarar.
         */


        Cats cat1 = new Cats();//Animal
                             //Mammal
                             // Cat


    }





}

package day25exception;

public class E01 {
    /*
Bir kod yazilirken olasi exeptionlar ongorulup ona gore careler uretilmelidir.
1-)Eger exeption olustugunda kodun calismaya devam etmesini istemiyorsak method
isminin yanina bunu=olusabilecek exeptionu deklare edebiliriz.
2-)Eger kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try chatch blogunun icine alir
 try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exeption'i ve olasi exeption durumunda
 Javanin ne yapmasini istedigimizi yazabiliriz

 --> Exception(istisnai hata) javada kodlarimizi calistirirken meydana gelen beklenmedik durumlardir
 -->Exception'lar ile calismanin 2 yolu vardir:
    a)try-catch block kullanma ve exception olussa bile calismayi devam ettirme
    b)throw exception kullanarak calismayi durdurma(mesela yazdigimiz kod geregi bir dosya uzerinden okuma yapmamiz gerekiyor ise
      bu dosyamiz eger silinmis ise java dosyayi bulamazve uygulamanin devam etmesi gerekmez.)
 --> eger exception'i handle etmez isek(sorunu halletmezsek)java calismayi durdurur.
 -->try-catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz.
 -->try, catch olmaksizin yalniz kullanilamaz
 -->Eger yazmis oldugunuz herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try-catch block icine koymalisiniz.
 -->catch block parantezi icerisine olmasi muhtemel exception class ismi yazilir
 --> e.getmessage(), methodunu kulanarak teknik mesajlar elde edebiliriz
     System.out.println(); burada yazmis oldugum mesajlar beni teknik olmayan aciklamalarimdir.
     e.printStackTrace(); methodu exception ile ilgili detaylica teknik mesaj verir.kod calismaya devam eder
-->   System.err.println(); hata mesajini renkli olarak verir.bu sayede konsolda kolaylikla diger mesajlardan ayirmak icin kullaniriz.
--> eger try body icindeki kod sorunsuz calisirsa catch block devreye girmez.

     */

    public static void main(String[] args) {

         //divide(6,2);//3
        //divide(0,2);//0
        //divide(6,0);//matematikta bir sayi 0 ile bolunemez.

        divide2(5,0);



    }


    //run time :calisma sirasinda hata gormek
    //compile time : henuz kodu yazarsak hata almamiz.
    //asagidaki sorunu if ile cozmeyi tavsiye edilmiyor.yani sorunu bu sekilde cozmek tavsiye edilen bir sey degil.
    //bir developer icin tum matematik kurallarini ezbere bilmek mumkun degildir.


    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("bir sayi sifir ile bolunemez");
        } else {
            System.out.println(a / b);
        }

    }

    public static void divide2(int a,int b){
        /*
        eger bir problem alirsan bu sekilde yapip koda devam edebilirsin.
        kod geregi akis geregi ben bir kod yazdim ve bana hata verdi.hatanin nerede oldugu konsolda yaziyor.
        olasi bir hatada kodumuzu daha dinamik yazmamiz gerekir.hata aldigimiz zaman duzeltmek icin try-catch kodunu yazariz.

        2.yol: try-catch kullanarak exception'i handle etmek tavsiye edilir.
         */

        try{//burada islemi yapmaya calisti denedi.
            System.out.println(a/b);
            System.out.println("hi exceptions");
            System.out.println("bye exceptions");

            //burada calisma durdu aslinda
            //catch kisminda devam etti ve kendimizce bir not birakip kod yazmaya devam ettik
        }catch(ArithmeticException e){//javadaki bir class'dir.String nasil bir class ve data tipi ise arithmeticexception da oyledir.
            System.out.println("bolme isleminde bir problem olustu.==>"+e.getMessage());//bu islem kodu devam etmesini sagliyor.(by zero verdi)
            e.printStackTrace();//bu sekilde print yapar
            System.err.println("bolme isleminde bir problem olustu");//renkli olarak verir//bolme isleminde bir problem olustu


            //java matematik ile ilgili karsilasilmasi muhtemel tum istisnalari - hatalari 'ArithmatikException' class'ina koymustur.
            //matematikteki tum istisnalari detaylari bilmek zorunda degilsin.





        }



    }

}

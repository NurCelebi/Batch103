package day01variables;

public class Variables01 {

                                   //Variable nasil olusturulur?


    //Java'da "cumle" deriz, Java'da "statement' deriz
    //Java'da ";" Ingilizce'deki "." gibidir

    // "=" sembolu "Assigment Operator" olarak adlandirilir
    //"Assignment(Atama) Operator" sagdaki degeri alir soldaki variable'in icine koyar

   //1)Access Modifier  2)Data Type  3)Variable ismi   4)=    5)Deger  6);
   public int age = 13;

   public int height = 183;

                       //Java'da Data type*lari(memory*i akillica kullanabilmek amac)

   /*

                                  Primitive Data Types
     1)int: Integer'in kisaltmasi. Integer tamsayi demektir. 32 bit kullanir.
            Matematik*de tam sayilarin basi ve sonu yoktur.Fakat Java*da tam sayilarin basi ve sonu vardir.
            En kucuk int = -2,147,483,648
            En buyuk int =  2,147,483,647

    2)byte: Tamsayilar icin kullanilir. 8 bit kullanir.
            En kucuk byte = -128
            En buyuk byte =  127

    3)short: Tamsayilar icin, 16 bit kullanir.
             En kucuk short = -32768
             En buyuk short =  32767

   4)Long:  Tamsayilar icin, 64 bit kullanir.
             En kucuk Long = -9,223,372,036,854,755,808
             En buyuk Long =  9,223,372,036,854,755,807

   5)float; Ondalikli sayilar icindir.32 bit ullanilir.
            "float" virgulden sonra 7 basamak icerebilir
            "float" degerlerinde "f" veya "F" koyamamiz gerekir.

   6)double: Ondalikli sayilar icindir.64 bit kullanir.
             "double" virgulden sonra 16 basamak icerebilir.


    7)boolean: "true" veya "false" degerleri icin kullanilir.1 bit kullanir.

    8)char: Tek karakterlere icin kullanilir. 16 bit kullanir.
             A, c, 2, ?, _, =,
             Note: Char'lara deger verirken degeri tek tirnak arasina koyunuz,yoksa hata verir

             Note: Java buyuk ve kucuk harflere duyarlidir.
                   Java icin TRUE ile true tamamen farklidir

             Note: Numeric Data Types: byte < short < int < long < float < double
                   Numeric Olmayan Data Types: boolean - char

                                       Non-Primitive Data Types

      String:  isim , adre, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
               String degerleri mutlaka cift tirnak arasina konmalidir.
               String non-primitive dir. Yani bir String olusturdugunuzda Java size bircok method verir.


                        Primitive ile Non-Primitive 'lerin farki nedir?
               1) Non-Primitive Data tiplerinde degerin yaninda methodlar vardir.
                  Primitive Data tiplerinde ise sadece deger vardir ama method yoktur.
               2) Primitive Data tipleri Java tarafindan olusturulmustur,toplam 8 tanedir.Biz Primitive data
              olusturamayiz.
                  Non-primitive data tipleri Java tarafindan olusturulmustur,biz de olusturabilirz.Non-primitiveler
              sayilamayacak kadar coktur,cunku her developer Non-primitive data tipi olusturabilir.
              3) Primitive data tipleri isimlendirilirken kucuk harflerle isimlendirirler.kucuk harflerle baslar.
                 (char,boolean,byte...)
                 Non-primitive data tip isimleri buyuk harf ile baslar.(String..)
              4) Primitive data tipleri memory'de farkli buyuklukte yerler kullanirlar(16,32 bit...)
                 Non-primitivelerin hepsi memory'de ayni buyuklukte yer kullanirlar.

    */

   public byte price = 12;

   public short populationOfVillage = 23000;


   public float priceOfShirt =13.99F;


   public double weightOfCell = 0.000012045;

   // Siz "Long" demenize ragmen Java verilen sayiyi "int" kabul eder
   // Bu yuzden, Long bir variable'a "int" araliginin disinda bir sayi verirseniz mutlaka sonuna "L" veya "l" koyunuz

   public long populationOfWorld = 7000000000L;



   //Burada "L" koymadigimiz halde problem yok cunku "1234" int araligina uyar.
   public long x = 1234;


   public boolean isOld = true;
   public boolean idRich = false;

   public char initial = 'S';


   public String name = "Tom Hanks";

   //Note: "main method" arabanin motoru gibidir.
   //      "main mothod" calismadan hicbirsey calismaz.

   public static void main(String[] args) {

   }

}







package day08StringManipulation;

public class StringManipulation02 {

    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz.
        //           "Ali okula gitti." ==> 14 karakter var

        String str = "Ali okula gitti.";


        //replace() method'u bir Stringdeki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ","").length();


        //degistirme islemi replace oluyor." " degistir yerine"" koyma anlami var
        //length string'e gider kac karakter var onu sayar.
       //  " " = burada degistirmek istedigini koy "" bunu yerine koy anlami var



        System.out.println(num);

        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.
        //toUpperCase tum harfleri cevirir.biz sadece kucukleri cevir diyoruz.

        String s = "Ankara'nin tasina gozlerimin yasina bak";
        String yeniS = s.replace("a","A");
        System.out.println(yeniS);// AnkArA'nin yAsinA bAk gozlerimin yAsinA bAk

        //Example 3: bir stringdeki tum "kara" kelimlerinin yerine "*" koyunuz.
        String t = "Kara kara dusunme Ankara";

        String yeniT = t.replace("kara","*");

        System.out.println(yeniT);//Kara* dusunme An*

        // Kara yi algilamaz cunku bizden kara istoiiyoru ama diger Kara olarak yazilmis onu o sebple saymaz.

        //Example 4: Bir stringdeki tum sayilari "*" a ceviriniz.
        //          "AC202117004" ==> AC*******
        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]","*");

        System.out.println(yeniStdId);

        //replaceall heosi anlamina gelir sayilardan bahsettigimiz icin [0-9] olarak ifadelendirdik.

        /*
          bir grup datayi ifade eden kodlara 'REGEX' denir.
          "regular Expressions'in kisaltilmis halidir"

          1) tum rakamlar==> [0-9]
          2)tum kucuk harfler ==>[a-z]
          3) tum buyuk harfler ==>[A-Z]
          4)tum harfler icin ==> [a-zA-Z]
          5) sesli harfler ==> [aeiouAEIOU]
          6)space ==> [ ]
          7)tum rakamlar ve tum harfler==> [0-9a-zA-Z]
          8)tum noktalama isaretleri ==> \\p{Punct}==(ezberle=noktalam isaretleri icin regex yaz google)

          1)Rakamlar haric tum karakterler ==> [^0-9]
          2)Kucuk harfler haric butun karakterler ==> [^a-z]
          3)Buyuk harfler haric tum karakterler==> [^A-Z]
          4)TUM HARFLER HARIC TUM KARAKTERLER ==> [^a=zA-Z]
          5)space haric ==> [^ ]
          tum sembol deyince harfler kucuk-buyuk rakamlar ve bosluklari kaldirir
         */

        //Example 5: verilen bir String'de kullanilan noktalama isareti ve rakamlar ve space karakteri haric tum
        //karakterlerin sayisini bulan kodu yaziniz.

        String u =  "Ali  13  yasinda,  dersem  inanma!...";
        int sonuc  = u.
                replaceAll("[0-9]","").//Ali yasinda, dersem inanma!...
                replace("  ","").//Aliyasinda,derseminanma!...
                replaceAll("\\p{Punct}","").//Aliyasindaderseminanma
                length();//kalan karakterleri sayiyor



        System.out.println(sonuc);
        //ilki sayilari saymiyor-ikincisi boslugu saymiyor,ucuncu noktalama isaretleri saymaz ve geri kalani saymak icin length koyduk.
        //tek satirdsa kod cok uzun oldugu icin yukaridaki gibi yazdik


        //Example 6: Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz.
        //           1) space haric en az sekiz karakter olmali
        //           2)en az bir sembol icermeli
        //           3)en az 1 rakam  icermeli
        //           4)en az 1 buyuk harf icermeli
        //           5)en az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

        //1)space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ","").length()>7;

        //2)en az bir sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;
        //0-9sildi,a-z sildi.A-Zsildi ve bosluk varsa silmesi icin buyukZ den sonra bosluk koyduk koseli paranteze
        //ve onu da silmis oldu

        //3)en az 1 rakam  icermeli
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;

        //iv)En az bir büyük harf içermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

         //v)En az bir küçük harf içermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;


       boolean pwdgecerli = first&&second&&third&&fourth&&fifth;

       if(pwdgecerli){
           System.out.println("password'unuz gecerlidir...");
       }else{
           System.out.println("password'unuz gecersizdir.");
       }

       //Example 7: bir stringdeki noktalama isartelerinin sayisini gosteren kodu yaziniz.
        String cumle = "Sen yapmazsan, ben ?...";
       int number = cumle.replaceAll("[^\\p{Punct]","").length();
        System.out.println(number);


        //Example 8: verilen bir string "Al" ile basliyor ve "x" ile bitiyorsa ekrana "harika"yazdirin.Aksi takdirde
        // "normal" yazdirin.

        String v = "Alex";

       boolean baslangic = v.startsWith("Al");//neyle basladigini gosterir

       boolean bitis = v.endsWith("x");//neyle bittigini gosterir

       String result = baslangic && bitis ? "Harika" : "Normal";

        System.out.println(result);









    }
}

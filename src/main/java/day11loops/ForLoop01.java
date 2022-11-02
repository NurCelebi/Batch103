package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: 3'den 6'ya kadar tam sayilarin toplamini bulan  kodu yaziniz.

        int sum = 0;
        for (int i=3; i <7; i++){
            sum = sum+ i;//toplamayi yap variable icine koyuyoruz.
//            System.out.println(sum);//18

            // tum sonuclari tek tek gormek istersek loop icine sout koy
            //en son sonucu=-degeri gormek istersek loop'un disina sout koymamiz gerekir.
            //bu tarz sorularda genelde sout loop'un disina konuyor

        }
        //sout(sum); Loop'un disina yazilirsa sadece sum'in son degerini ekrana yazdirir.
        //Loop'un icine yazilirsa her bir loop icin sum'in hangi degerleri aldigini yazdirir.
        //sum=0 neden yaptik? sum'in icindeki sayi ile verilen ilk sayiyi toplayip sonuca ulasmak istedigim icin 0 koyarim.cunku '0' etkisiz elemandir toplamada.
        System.out.println(sum);//18





        //Example 2: 6'dan 3'e kadar tamsayilarin toplamini bulan kodu yaziniz.

        int multiply = 1;
        for (int a=6; a>2; a--){
            multiply = multiply * a;


        }
        //1 yazmamizin sebebi 1 carpma isleminde etkisiz elemandir.
        System.out.println(multiply);

        //Example 3: size verilen bir tam sayinin rakamlari toplamini bulunuz.


        //tamsayiyi tam sayiya bolersek sonuc tamsayi olur.
        // birler basamagi icin %10 yapariz.
        //sayiyi yine 10'a bolunce mesela 385 sayisi icin /10 yaparsak 38.5 olur.integer bir degeri int'e bolersek sonuc int olmali.yani 38 olarak alacagiz ele.
        //38'i tekrar /10 yapacagiz sonuc 8 olacak yani onlar basa. buluruz.
        //yuzler basamagi icin elimizde 38 vardi onu tekrar 10'a bolecegiz.3,8 kalacak ve java sadece 3'u alacak.
        //rakamlarin biittigini yine/10 yaparak buluruz.
        //decrement icin ya boleriz ya cikartirz.bu soru icin /10 yapamamiz gerekiyor cunku azaliyor.

        int num = 385 ;
        num = Math.abs(num);//mutlak hale getirebilmek icin bu yontem kullanilir.


        int sonuc = 0;//rakamlari toplayacagimiz icin 0 yaptik.
        for (int i= num ; i>0; i= i/10 ){

            sonuc =  sonuc + i%10;

        }


        System.out.println(sonuc);

        //Example 4:  Size verilen bir String'i ekrana ters ceviren kodu yaziniz.
        //            "Kaba ==> "abaK

        String str = "Kaba";
        // baslangicta length-1 dedik cunlu son karakterden basliyoruz./ilk karaktere kadar devam edecegi icin 0'a esir ve buyuk olmali


        //concatenation yapacaksaniz empty String ("")  yapariz.
        String ters = "";


        for (int i= str.length()-1 ; i>=0 ; i-- ){

            char c = str.charAt(i);//index'i 3 olani al demek istiyor(length()-1 ile bulduk bunu.

            ters = ters +c;



        }
        System.out.println(ters);



    }
}

package day10stringmanipulations;

public class ForLoop01 {

    public static void main(String[] args) {
        //loop dongu demek .bir seyi tekrar tekrar yapmak demektir.

        //Example 1: ekrana 5 kere "Hi" yazdiriniz.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Tekrarli isler icin Loop kullaniriz
        //4 cesit Loop vardir.1)for-loop 2)while-Loop 3)d0-while-Loop 4)for-each-Loop
        //bunlarin dordu de ayni isi yapar sadece dizilimi farklidir.bir de bazi detaylarinda farkliliklari vardir.

        //i)for-Loop
        //Example 2: ekrana 5 kere "Hi" yazdiriniz.

        //birinci bolum bir kez calisir.
        //ikinci bolu tekrarli calisir.
        //ucuncu bolum rekrarli calisir.

        //   baslangic degeri Loop   hangi sart altinda calisacak  Incremant(arttirma) veya decrement(azaltma
        for ( int i =1           ;      i<6                     ;          i = i+1                               ){
            System.out.println("Hi");


        }

        //concat string'ler icin kullanilir.stringleri birlestirme
        //Example 3: 4ten 7ye kadar tumm tam sayilari ekrana yazdiran kodu ekrana yaziniz.

        for (int b= 4; b<8 ; b++){ // b= b+1 de olabilirdi.
            System.out.println(b);

        }
        System.out.println();//sorularin cevaplari arasinda karisiklikm olmasin diye araya sout koyduk



        //Example 3: 14ten 5e kadar tum tamsayilarini yazdiran kodu yaziniz.

        for (int f =14; f>4 ; f--){
            System.out.println(f);
        }

        System.out.println();


        //Example 5: 14ten 5 e kadar tum cift sayilari ekran ayzdiriniz.


        //1.yol:
        for (int d=14; d>4 ; d= d-2){
            System.out.println(d);
        }


        System.out.println();

        //2.yol:
        for (int d= 14 ; d>4 ; d--){

            if (d%2==0){
                System.out.println( d + " ");
            }
        }

        //Example 6: 28 den 157ye kadar tum tek sayilari ekrana yazdirin

         for (int n= 28; n<158; n++){
             if (n%2!=0){
                 System.out.println(n + " ");
             }
         }
        System.out.println();

         //Example 7: "Java" Sytring'ini "J*a*v*a" stringine ceviren kodu yaziniz.


                String str = "Java";

                for (int i=0 ; i<str.length() ; i++){
                    System.out.print(str.charAt(i)+ "*");
//                    System.out.println(str.length());
                }


        System.out.println();

         //Example 8: size verilen string'de tekrarsiz karakterleri ekrana yazdiriniz.
         //            "Hellooo Ali "==>He Ai


        String s = "Hellooo Ali";
                for (int i = 0 ; i<s.length() ; i++){

                    char c = s.charAt(i);

                    if (s.indexOf(c)==s.lastIndexOf(c)){//tekrarsiz olmasi dedigimizde bunu yapmamiz gerekiyor
                        // ilk gorunum ve son gorunumunun sifira esit olmasi yani bir kere olmasi gerekiyor.
                        //string'in icinde bir kere kullandigimiz zaman ilk ve son gorunum esit olur
                        //karakter tekrarli ise 0'a esit degil, tekrarsiz ise 0'a esit olur.
                        System.out.print(c);
                    }
                }
    }
}

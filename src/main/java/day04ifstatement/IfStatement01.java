package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //If it rains I will cancel the picnic.
        // If statement belli kodlari belli sartlara bagli olarak calistirmaya yarar.

        //Example 1: Sayi pozitif ise ekrana poyitif yazdirin.
        int s = 12;

        if (s > 0) {
            System.out.println("Positive");

            //Example2 : Verilen karakter buyuk harf ise ekrana buyuk harf yazdirin.

            char ch = 'V';

            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("buyuk harf");

            }
            /*
            && islemi sadece boolean ile kullanilir.
                true && true = true
                true && false = false
                false && true = false
                false&& false = false
            && islemi mukemmelliyetcidir. true sonucunu alabilmek icin hersey true olmalidir.
             */

            //Example 3: verilen bir sayi uc basamakli ise ekraa ' uc basamakli' yazdiriniz.

            int n = 123;

            Math.abs(n);// eksi degerde bir sayi gelirse mutlak deger yapip disari cikartir ve sonuclandirir.

            if (n > 99 && n < 1000) { // n>=100 && n<=999 veya n>99 && n<1000
                System.out.println("uc basamakli");


            }

            //Example 4: verilen bir sayi cift bir sayi ise ekrana 'cift sayi' yazdiriniz/

            int p = -18;

            p = Math.abs(p);

            // '=' isaret atama operatorudur.,matematikteki esittir anlamina gelmez
            // matematikteki esittir sembolu Java'da == seklindedir.
            //2+3 == 5

            if (p % 2 == 0) {
                System.out.println("cift sayi");


            }

            //Example 5 : verilen bir sayi 300den kucuk veya 1200 den buyuk ise ekrana ' harika sayi' yazdirin.

            int r = 250;

            r = Math.abs(r);


            if (r < 300 || r > 1200) {

                System.out.println("harika sayi");

                /*
                   Note: veya  =  ||
                   sadece boolean lar ile kullanılır.

              true || true = true
              false || true = true
              true || false = true
              false || false = false
                     note: || isleminde false alabilmek icin herseyin false olmasi gerekir
                   || isleminde sadece bir tane true sonucu true yapmaya yeter.

                 */

            }
        }


    }
}
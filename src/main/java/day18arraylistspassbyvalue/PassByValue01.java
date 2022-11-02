package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        //methodlar main methodu altinda olur.
        //static method olan main method"un icindeki hersey static olmalidir.
        //orjinal degeri koruyamazsak ilk islemde orjinali degistirirsek diger tum hamleler farkli sonuclar olusturur bize.
        /*
            1)Java, variable'ların orijinal değerlerini korumak ister.
             2)Variable metotlar içinde kullanıldığında, Java metodun içine
             orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
             Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
            orijinal değer korunmuş olur. Bu sisteme PassByValue denir.
            Note: Java "Pass By Value' kullanir.Bazi programlama dilleri orjinal degeri koruma altina almamistir.
            Bu isi developer'lara birakmistir.Bu tarz diiller "Pass By Reference" kullanir.
            Java 'PASS BY REFERENCE' KULLANMAZ.

        */




        int x=12;//copy degeri bu.java bunu degistirir.orjinali korur.
        System.out.println(x);//5





        change (x);
        System.out.println(x);//5

        int ucret =100;
        int kopya = indirim(ucret);
        System.out.println(kopya);//90

        ucret = indirim(ucret);


        System.out.println(ucret);//100

    }
          public static void  change (int a ){
        System.out.println(a*3);
         }

         //void disindaki 'return' typle'da method body'si icinde 'return' keyword kullanilmalidir
         public static int indirim (int gomlekUcreti){
                return  gomlekUcreti-10;

         }
}

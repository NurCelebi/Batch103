package day03typecastingwrapperscanner;

import java.sql.SQLOutput;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
            note :Java primitive lere methodlar ekleyerek yeni bir yapi(structer) olusturdu.
                  Bu yapiya " Wrapper Class" denir.


                  Primitive      Wrapper
                  byte       ==> Byte
                  **int        ==> Integer
                  short      ==> Short
                  long       ==> Long
                  float      ==> Float
                  double     ==> Double
                  boolean    ==> Boolean
                  **char       ==> Character
         */

        byte primitiveByte =12; //primitiveByte yazip nokta koydugumuzda hic method goremeyiz, cunku primitiveler method icermez sadece deger icerir.
        Byte wrapperByte = 12; //"wrapperByte" yazip nokta koydugumuzda bir cok method goruruz. cunku "wrapper" lar method icerir.


        //byte data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); //127

        // Example 2: sort,int, long data tiplerinin en buyuk ve en kucuk degerlerini ekranma yazdirin


        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        // "primitiveler nasil "wrapper"lara cevrilir.( Autoboxing)

           float f1 = 13.99F;

           Float wrapperF1 = f1;

        // wrapper"lar nasil primitive"lere cevrilir.( Unboxing)

        Character w1 = 's';

        char primitiveW1 = w1;

        //Note: Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir.




    }
}

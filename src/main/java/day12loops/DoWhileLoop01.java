package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while loop bazi durumlarda hic calismayabilir. bu soruda int i =0 while(i<1) diyor yani 1<1 false oldugu icin calismiyor.
        //while loop icin zero execution mumkundur.
        //while loop icin loop body'si icindeki kodun hic calistirilmama ihtimali vardir.
        int i = 1;

        while (i<1){//burada dusunuyorsun oyle hareket ediyorsunj
            System.out.println("While Loop");
            i++;

        }


        //do-while loop'un body'si icindeki kod her halikarda en az 1 kere calisir.
        int k =1;

        do {//burada dusunmeden direkt hareket ediliyor.sonra dusunuyor

            System.out.println("do-while Loop");
            k++;

        }while(k<1);

        //do-while loop kullandigimizda loop body'si icindeki kod en az bir kere calisir.
        //yani do while loop icin zero execution mumkun degildir.



        //Example 1: bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz...
        //           24,5673 ==> 5+6+7+3==21

        double num = 24.5673;//24.5673'u kesmek icin split yapmak gerekir ama split stringlerde kullanilir.biz double'i string'e cevoircez.
        System.out.println(num);


        //String.valueOf() methodu parantez icine konulan data tipini String yapar.
        String str = String.valueOf(num);
        System.out.println(str);//24.6573

        //regex icin nokta kullandiginizda onune "\\." koyunuz.yani nokTA \\. seklinde kullanilir.
        String decimalPart = str.split("\\.") [1];//[1] demek boldukten sonra ilk kismin indexi 0, ikinci kismin indexi 1 o yuzden orayi aliyoruz.
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);//bu degeri integer'a d=cevir anlamina gelir burasi yani 5673 u cevirir.
        System.out.println(decimalInt);

        int sum =0;

        do{
            sum = sum+ decimalInt%10;

            decimalInt= decimalInt/10;

        }while (decimalInt>0);

        System.out.println(sum);


    }

}

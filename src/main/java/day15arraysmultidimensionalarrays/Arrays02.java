package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif" ve "en kucuk pozitif elemani" bulunuz //-12,-5,-2,0,18,23

        int arr[] ={-12, 18 ,-5, 23,-22,0};

        Arrays.sort(arr);//[-12,-5,-2,0,18,23]

        int maxNegative = arr[0];//yeni arrray'deki maxneg. bulduracak
        int minPositive =arr[arr.length-1];//pozitif sayilar en sagda oldugu icin en son eleman kesin pozitiftir o yuzdne boyle seciyorum
                                           //en kucuk poztir de dahi olsa lengt-1 olarak bakariz cunku pozitifler kesinlikle sagdadir.


                       //[-12,-5,0,23,180
        for(int w : arr){//surekli sayilari tekrar edecegimiz icin loop yaptik






            if(w<0){
                maxNegative = Math.max(maxNegative,w);//array icindeki negatif sayilari kiyaslayip en buyugunu bize verecek.= 2 tane aybi sayidna varsa birini  verir.
            }



            if (w>0){
                Math.min(minPositive,w);

            }
        }

        System.out.println(maxNegative + " and " + minPositive);//elemanlarin hepsini yazdirinca loop kirildi ve sonuclari yazdirdi.





    }
}

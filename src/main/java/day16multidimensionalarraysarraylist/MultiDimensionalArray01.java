package day16multidimensionalarraysarraylist;


import java.util.Arrays;

public class MultiDimensionalArray01 {

    /*
    Array veya Collection varsa for each loop kullanmak ilk tercihimiz olsun
    Array veya Coolection var ama 'index' kullanmak zorundasiniz o zaman for-each-loop calismaz.
     "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
     */

    public static void main(String[] args) {

        //Bir tane Integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;

        for (int[] w : arr) {

            for (int k : w) {

                sum = sum + k;


            }

        }
        System.out.println(sum);

        //Bir multidimesional array'i normal array'e ceviren kodu yaziniz.
        // {{2,5,1}{32,75} } ==> {2,5,1,32,75}

        //multidimensional arraydeki eleman sayisini bulacagiz.
        //cunku array uzunlugu orjinal array'in eleman sayisina esit olmalidir.

        int brr[][] = {{2, 5, 1}, {32, 75}};

        int toplam = 0;

        for (int[] w : brr) {
            toplam = toplam + w.length;//[0,0,0,0,0]==> bu yeni array'in hali

        }
        System.out.println(toplam);
        //burasi eleman sayisini bulmak icin yapildi.


        int idx = 0;//yeni array'de elemanlari iceri koymamiz icin index'e gore koyacagiz o sebeple bunu yaptik.
        int crr[] = new int[toplam];//yeni array onceki arrayle ayni uzunlukta old icin toplam dedik



        for (int[] w :brr){//brr icin kuruyoruz bu loop'u==> w --> 2,5,1 oldu ilk once sonra 32,75 olacak.

            for (int l : w){

                crr[idx]=l;//yeni array'in indexlerine gore siralama yapacagi icin yukarida idx icin int yaptik.
                idx++;

            }

        }

        System.out.println(Arrays.toString(crr));

    }
}

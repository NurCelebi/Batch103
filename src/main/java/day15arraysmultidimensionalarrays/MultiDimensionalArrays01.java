package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    //cok buyutlu Array'ler anlamina gelir.
    //Bir Array'in elemanlari Array ise bu Array'ler  Multidimensional Array'dir.


    public static void main(String[] args) {

//        //Multidimensional Array nasil olsutururlur?
//        int arr[][] = new int[3][2];//3-2 distakinde kac tane var ve iceride kac tane var onlarin sayisini yaziyoruz
//        System.out.println(Arrays.deepToString(arr));//[[0,0],[0,0],[0,0]]
//
//        //Multidimensional Array'lere eleman ekleme nasil yapilir?
//        arr[1][0]=6;
//        arr[0][0]=3;
//        arr[0][1]=-4;
//        arr[1][1]=18;
//        arr[2][0]=-7;
//        arr[2][1]=0;
//
//
//        //Multidimensional Array console'a nasil yazdirilir?//hepsinini yzdirabilmek icin yapiyoruz.
//        System.out.println(Arrays.deepToString(arr)); //[[3, -4], [6, 18], [-7, 0]]
//
//
//        //Multidimensional Array'lerde Array elemanlarindan biri naisl yazdilir?
//        System.out.println(Arrays.toString(arr[1]));//[6, 18]==>index' 1 old icin bunu yazdirdi.==> arrays yazdiracagimiz icin toString olarak yazdik.
//
//
//        //Multidimensional Array'lerde ic Array'lerdeki elemanlar nasil yazdirilir?
//        System.out.println((arr[1][0]));//sadece int yazdiricaz o sebeple sadece sout demek yeterli//cevap ==>6
//
//
//        //Example 1: String bir Multidimensional Array olsuturunuz
//        // eleman ekleyiniz
//        // toplam eleman sayisini ekrana ayzdiran kodu yaziniz.
//
//        //String bir multidimensional olsturuyoruz.
//        String brr[][] = new String[4][3];
//
//
//        brr[0][0] = "A";
//        brr[0][1] = "B";
//        brr[0][2] = "C";
//
//        brr[1][0] = "D";
//        brr[1][1] = "E";
//        brr[1][2] = "F";
//
//        brr[2][0] = "G";
//        brr[2][1] = "H";
//        brr[2][2] = "I";
//
//        brr[3][0] = "J";
//        brr[3][1] = "K";
//        brr[3][2] = "L";
//
//        System.out.println(Arrays.deepToString(brr));//[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]
//        //elemanlar array oldugu icin String[] olarak yazdik
//
//        int sum = 0 ;//toplama eleman sayisini istedigi icin sum olusturduk.
//        for (String[] w : brr){//mesela [A, B, C] w old icin bunun uzunlugunu alip sum'a koyacagiz
//
//            sum = sum + w.length;//w'nin uzunlugu bul sum'a ekle sum kutusuna koy
//
//
//        }
//
//        System.out.println(sum);//12

        char arr[] = new char[4];
        arr[0] = 'A';
        arr[2] = 'E';
        arr[3] = 'M';
        System.out.println(Arrays.toString(arr));

    }
}

package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArraysLists01 {

    public static void main(String[] args) {

        //Example 1: bir Integer ArrayList'teki 7 haric tum elemanlari 2 arttiriniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w: ages){

            if (w==7){
                continue;

            }
//            w=w+2;//List bu sekilde degismez.degistirme icin set() kullanilmasi gerekir
            //bu integer deguistirmek icin yapikiyor

            ages.set(ages.indexOf(w),w+2 );//w'nin indexine git onu degistirme digerlerini 2 ekle.7'yi gorursen bosver demek.


        }
        System.out.println(ages);


        //Example 2: Size verilen ArrayList'de 8 ve 8'den onceki tum elemanlari 2 katina cikariniz.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w: nums){

            nums.set(nums.indexOf(w),w*2 );//once olmali cunku 8'den once de sayilar vardir.loop'u kiran sayi 8.
            if (w==8){
                break;
            }

        }
        System.out.println(nums);

    }
}

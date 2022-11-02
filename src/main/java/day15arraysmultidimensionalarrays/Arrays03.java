package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //Example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
        //           a-e-i-o-u-A-E-I-O-U

        String str = "Java ogrenince para kazanamk kolay, ogrenmeyice ne kolay ki";

        str = str.toLowerCase();


        String harfler[] = str.split("");//split her zaman array verir.harfeleri tek tek ayirmamaiza yaradi.

        int counter = 0;//kac tane old saydirmak icin yaptik

        System.out.println(Arrays.toString(harfler));//tum harfleri teker teker verdi
        //switch kullanicaz cunku ucten fazla ihtimal var

        for (String w : harfler){

            switch (w){

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                      counter++;
                      break;




            }

        }
        System.out.println(counter);

    }

}

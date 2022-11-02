package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays02 {

    public static void main(String[] args) {

        //MultidimensionalArray kisa yoldan nasil olusturulur?

        char arr[][] = { {'a','b'} , {'C','D','E'} , {'?'}  };

        System.out.println(Arrays.deepToString(arr));//[[a, b], [C, D, E], [?]]


        //Example: Bir String Multidimensional Array'de icinde 'a' olan elemanlari konsola yazidiriniz.
        // w= {"learn", "java", "it"} bu oluyor sonra degisiyor

        String brr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        for (String[] w :brr){// ilk array icin donecek- sonra ikinci array icin donecek

            for (String k : w){// burada k array'in icindeki elemanlara verdigimiz  isim

                if (k.contains("a")){
                    System.out.print(k+ " ");//learn java easy

                }
            }

        }





    }
}

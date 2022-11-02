package day03typecastingwrapperscanner;

public class TypeCasting01 {

      //Type Casting: Bir numeric data tipini diger numeric data tipine cevirmek demektir.
      //    byte< short< int< long < flot < double

     //Note: Kucuk data tipini buyuk data tipine cevirmeye " Auto Widening" denir.
     //Note: Buyuk data tipini kucuk data tipine cevirmeye " Explicit Narrowing" denir.

    public static void main(String[] args) {

       byte age = 23;

       int newAge = age;


       long population = 1234;
       int newPopulation = (int)population;


       //Example 1: short'u double'a ceviren kodu yaziniz.
       //           float'i byte yapan kodu yaziniz




        short numOfStudents = 235;
        double newNumOfStudent = numOfStudents; // Auto Widening

        float price = 12.99F;

        byte newPrice = (byte)price; // Explicit Narrowing


        System.out.println(newPrice); //==> Java ondalik sayiyi tamsayiya cevirirken yuvarlama islemi yapmaz.
                                      //    Java ondalik sayiyi tamsayiya cevirirken ondalik kismi siler.

        int number = 515;
        byte newNumber = (byte)number;


        System.out.println(newNumber);//3 === Java 515'e 256'ya boldu ( byteki sayilarin sayisi) ya boldu kalani return etti/

        int num = 510;

        byte newNum = (byte)num;


        System.out.println(newNum);





    }
}

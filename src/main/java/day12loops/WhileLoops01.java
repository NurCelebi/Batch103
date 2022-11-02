package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {


        //Example 1: 3'den 10'a kadar tamsayilarin ayni satirda ekrana yazdirana kodu yaziniz...

        for (int i=3 ;i<11 ; i++){
            System.out.print(i + " ");


            System.out.println();
        }

        //2.yol : tum loop'larda baslangic degerleri hangi sartlarda calisacagi,arttirma veya azaltma vardir...

        int i =3;//baslangic

        while (i<11){//hangi sartlarda calisacagi

            System.out.print(i+ " ");

            i++; //arttiracagi yazar



        }

        System.out.println();




        //Example 2: 17'den 4'e kadar cift sayilari ekrana ayni satirda yazdiran kodu yaziniz.

        int b = 17;

        while (b>3){
            if (b%2==0){
                System.out.print(b + " ");
            }
            b--;
        }

        System.out.println();


        //Example 3: 12'den 67'ye kadar sayilarin toplamini veren kodu yaziniz.
        int sum = 0;

        int c = 12;

        while (c<68){

            sum = sum + c ;//toplama islemi yaparken kullaniyoruz.


           c++ ;
        }
        System.out.println(sum);

        //example 4: size verilen bir tamsayinin rakamlarini toplamini ekrana yazdiran kodu yaziniz...

        int sonuc = 0;

        int sayi = 385;

        sayi  = Math.abs(sayi);


        while ( sayi >0){

            sonuc = sonuc + sayi%10;

            sayi = sayi/10;


        }


        System.out.println(sonuc);

        //Example 5: kullanicidan aldigini bir sayinin carpim tablasounu ekrana yazdiriniz.
        //      3==> 3x1=3    3x2=6   3x3=9......   3x10=30


        Scanner input = new Scanner(System.in);
        System.out.println("carpim tablosunu gormek icin bir sayi giriniz...");
        int s = input.nextInt();//s= kullanicidan aldigimiz sayi

        int n = 1;//ilk deger 1 yani x1,x2,x3... yapiyoruz ya oradaki 1 ilk deger oluyor.

        while (n<11){// 1'den 10'a kadar s carparak gidiyoruz.

           System.out.println(s + "x" +n+ " ="+ s*n);


           n++;


        }





    }
}

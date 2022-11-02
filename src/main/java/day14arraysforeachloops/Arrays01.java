package day14arraysforeachloops;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Note: Arrayslerin icine sadece primitive data tipleri  ve "reference(adres) lar yerlestirilir.

    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprised you";

        System.out.println(Arrays.toString(str));

        //String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz.
        String arr[] = {"Jane", "Mark" , "Christopher" , "Tom","Ali", "Rojda"};

        for (String w : arr){//for each loop kendisi yapiyor

            System.out.print(w + " ");//buraya koyarsam tom'da yazilir

            if(w.equals("Tom")){
                break;

            }

//            System.out.print(w + " ");// buraya koyarsam tom yazdirmaz
        }

        System.out.println();

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz.

        String brr[] = {"Jane", "Mark" , "Christopher" , "Tom","Ali", "Rojda"};

        for (String w : brr){

//            System.out.println(w + " ");

            if (w.equals("Tom" ) || w.equals("Jane")){//"" dedik cunku biri true digeri false o sebeple || yapiyoruz.
                continue;//break olmaz loop kirar--- false olursa continue calismaz
                //if'li kisim true cikinca devam eder diger ismi kontrol etmeye devam eder.


            }
            System.out.print(w + " ");
        }

        System.out.println();

        //Example 3: Kullanici ile beraber Array olusturunuz ve icine data ekleyiniz
        //            Bir ogretmenin sinifindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int  numOfStd = input.nextInt();


        String names[] = new String[numOfStd];//kullanicinin verdigi sayiyi yerlestiriyoruz.//tekrarli islem loop lazim
        //tumm  verileri bir kapta toplamak icin yapiyoruz aarray

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz");

        for (int i = 1 ; i<= numOfStd ; i++){

            System.out.println("Lutfen " + i + ". ogrenci ismini giriniz");


            String stdName = input.next();
            //index 0 oldugu icin -1 diyoruz.ilk index buluyoruz.index her zaman sira no'dan 1 azdir.


            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdName;

        }

        System.out.println(Arrays.toString(names));


    }
}

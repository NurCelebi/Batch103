package day05ifstatement;

import java.util.Scanner;

public class ifStatememt01 {

    public static void main(String[] args) {

        //Example1: kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        int s = input.nextInt();

        //1.yol:

        if (s%2==0){
            System.out.println("cift sati...");

        }
        //!0 demek esit degil demektir.
        if(s%2!=0){
            System.out.println("tek sayi...");

        }

        //2.yol:

        if (s%2==0){
            System.out.println("cift sayi...");
        }else{
            System.out.println("tek sayi...");

        }

        //Example 2:Bir sayinin negatif,pozitif veya notr oldugunu soyleyen kodu yaziniz.


        System.out.println("bir sayi giriniz...");
        double d =input.nextDouble();

        if (d>0){
            System.out.println("pozitif...");
        }else if (d==0){
            System.out.println("notr...");
        }else{
            System.out.println("negatif");

        }
    }
}

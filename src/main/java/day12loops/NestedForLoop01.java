package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {


    public static void main(String[] args) {

        //asagidaki sekili ekrana yazdiran kodu yaziniz...
        // ****
        //****
        //****

        //yukaridan asagiya gidiyorum tekrarli yani loop kullanicam burada 2 loop var biri asahi satira inen looplar var ve yanyana yazdirdigimiz yildizlarin oldugu loop vra

        Scanner input = new Scanner(System.in);
        System.out.println("satir sayisini griniz...");
        int satir = input.nextInt();

        System.out.println("lutfen sutun sayisiini giriniz...");
        int sutun = input.nextInt();

        System.out.println("karakter seciniz...");
        char ch = input.next().charAt(0);


        for (int i =1 ; i< satir ; i++){

            for (int k =1 ; k< sutun; k++){ //1den baslama sebebi 4 yildiz var 1 den basliyor...
                System.out.print(ch);
                // asagiya sout koyduk cunku verilen degerlere gore yazdiracak for'un ici false verdigi zaman en sondaki sout'a gidecek.
            }
            System.out.println();
        }

        //Example 2:asagidaki sekli cizen kodu yaziniz.
        //                 1
        //                 1 2
        //                 1 2 3
        //                 1 2 3 4
        //                 1 2 3 4 5

        for (int a = 1; a<6 ; a++){

            for (int k = 1 ; k<=a; k++){ //k<=a dedik cunku a 1 den basliyor o yuzden .
                System.out.print(k + " ");

            }
            System.out.println();
        }

        //Example 3: asagidaki sekli cizen kodu yaziniz...
       //               * * * *
        //              * * *
        //              * *
        //              *


        int row = 4;

        for (int i = 1 ; i<=row; i++){//asagiya dogru 4 sutun old icin artarak gidiyor 1-2-3-4 diye

            for (int k = row ; k>=i; k--){ // 4 yildizla basliyor
                System.out.print(" * ");

            }
            System.out.println();//bu soruya bir daha bak
        }



    }
}

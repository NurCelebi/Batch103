package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaziniz.

        Scanner input =  new Scanner(System.in);


        System.out.println("Dikdortgenin kisa kenari giriniz");
        int en = input.nextInt();

        System.out.println("Diktorgenin uzun kenarini girin");
        int boy = input.nextInt();

        System.out.println("Alan" + en*boy);

        System.out.println("Cevre" + 2*(en+boy));






}
}

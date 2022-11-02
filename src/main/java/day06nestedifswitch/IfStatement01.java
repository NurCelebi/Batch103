package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanicidan yas degerini alan kodu yaziniz ve yasin hangi evrede oldugunu asagidaki
        //toplaya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz...");
        byte yas = input.nextByte();


        if (yas<0){
            System.out.println("gecerli bir yas giriniz...");
        }else if (yas<5){
            System.out.println("bebek");
        }else if (yas < 13){
            System.out.println("cocuk");
        }else if (yas <21){
            System.out.println("genc");
        }else if (yas<31){
            System.out.println("yetiskin");
        }else{
            System.out.println("yanimlanmamis evre...");
        }







    }
}

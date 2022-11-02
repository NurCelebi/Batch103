package day05ifstatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class ifStatement02 {

    public static void main(String[] args) {

        //Example1: kullanici gun numarasini girsin, kod gun ismini yazsin.
        //           2==> pazartesi   5==> persembe

        Scanner input = new Scanner(System.in);
        System.out.println("gun numarasi giriniiz..");
        byte gunNo = input.nextByte();

        if (gunNo==1){
            System.out.println("pazar");
        }else if (gunNo==2){
            System.out.println("pazartesi");
        }else if (gunNo==3){
            System.out.println("Sali");
        }else if (gunNo==4){
            System.out.println("carsamba");
        }else if (gunNo==5){
            System.out.println("persembe");
        }else if (gunNo==6){
            System.out.println("cuma");
        }else if (gunNo==7){
            System.out.println("cumartesi");
        }else{
            System.out.println("gecerli gun numrasi giriniz.gecerli gun numarasi 1,2,3,4,5,6,7 den birisidir.");
        }
    }
}

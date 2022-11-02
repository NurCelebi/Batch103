package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    public static void main(String[] args) {


/*
    Method overLoading nasil yapilir?
    1)Method isimleri ayni olmalidir.
    2)Method parametreleri farkli olmalidir.
       i)Parametre sayilari degistirilebilir.
       ii)Parametrelerein data typle larini degistirilebilir.
       iii)Parametrelerein yerleri degistirilebilir, ancak data typleri farkli ise.
     3)Method ismi + Parametreler = Method Signature
       Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez.
    */


        add(3,5);//1.secer
        //once isme bakar(add)asagida add ismiyle bircok method olabilirama java icerideki parametrelere bakar
        // ve en uyumlu olduguna bakar.java daha az ugracagi ekstra is yapmayacagi kodu secer.

        add(3,5.0);//3.secer

        //add(3.0,4.0);//hic bir sonuc calismaz.


    }

    public static void add(int a, int b ){
        System.out.println(a+b);
    } //tam uyum


    public static void add(int a, int b,int c ){

        System.out.println(a+b+c);
    }//uyum yok 3 parametre var


    public static void add(int a, double b ){
        System.out.println(a+b);
    }//2 opsiyonlu ama tam uyumlu degil

    public static void add(double a, int b ){

        System.out.println(a+b);
    }//2 opsiyonlu ama tam uyumlu degil

}

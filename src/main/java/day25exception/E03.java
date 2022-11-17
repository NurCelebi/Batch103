package day25exception;

public class E03 {
    public static void main(String[] args) {

        String str= "Ali";
        getNumOfChars(str);//length==3

        String s ="";
        getNumOfChars(s);//0

        String t=null;//t variable olusturdum icine null attim
        getNumOfChars(t);//NullPointerException
        //eger length() methodunda null kulanirsaniz bu exception'i alirsiniz.



    }
    //Bir String'de bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz

    public static void getNumOfChars(String str ){


        try{
            System.out.println(str.length());


        }catch(NullPointerException e){
            System.out.println("length() methodunda bir problem olustu ==>"+ e.getMessage());

            e.printStackTrace();
            //bu methodu kullandiginiz zaman System.out.println(); kullanmamiza gerek yok
        }


    }
}

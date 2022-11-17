package day26exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        char ch1 = getCharFromString("Java",2);//v
        System.out.println(ch1);

        char ch2 = getCharFromString("Selenium" , 8);
        System.out.println(ch2);//StringIndexOutOfBoundsException==string'in index sinirlari vardi burada hata yaptin
        //Eger bir string'den karakter veyea karakterler alirtken olmayan bir index kullanilirsa
        //StringIndexOutOfBoundsException alinir


    }

    public static char getCharFromString(String str,int idx){

        char c = ' ';//bu verilen ilk degerin ne oldugu hic onemli degil
        try{

            c=  str.charAt(idx);

        }catch(StringIndexOutOfBoundsException e ){

            System.out.println("Index ile ilgili bir problem olustu." + e.getMessage());//mesaji verir adece

            System.out.println(e.getMessage());//java'nin teorik mesaji

            e.printStackTrace();//detayli'log' icin

            //bir hata olustugunda ne yaparsin?-->'log'lara bakarim yani alt tarafta gordugumuz akis exception kisminda yazanlar.
        }
        return c;
    }

}

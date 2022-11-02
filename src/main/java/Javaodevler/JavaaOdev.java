package Javaodevler;

import java.util.Scanner;

public class JavaaOdev {

    public static void main(String[] args) {

        //1) İki tane integer variable oluşturun, o variable’lara deger
        //atayın ve farklarını console’a yazdırın.

        int a = 5;
        int b = 4;

        System.out.println(a + b);

        //2)Iki tane char variable oluşturun ve onları console’a yan
        //yana yazın

        char first = 'A';
        char second = 'B';

        System.out.println("firsCharGir");
        System.out.println("SecondCharGir");
        System.out.println("IlkIkiCharYanYanaYazdir");

        // 3)Kullanıcıdan karenin kenar uzunluğunu alin ve sonra bu karenin alan ve
        //çevresini hesaplayıp ekrana yazdıran bir program yazınız.
        //Not: Alan: Boy x En
        //Not: Çevre: 2x (Boy + En)

        Scanner input = new Scanner(System.in);

        System.out.println("Kisa kenari girin");
        int en = input.nextInt();

        System.out.println("Uzun kenari girin");
        int boy = input.nextInt();

        System.out.println("alan" + en * boy);

        System.out.println("cevre" + 2 * (en + boy));

        //) Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir
        //Program yazınız. (byte kullanınız)
        //Not 1: Üçgenin Cevresi: a + b + c



        System.out.println("a Kenarini girin");
        byte ilkKenar = input.nextByte();

        System.out.println("b kenarini girin");
        byte ikinciKenar = input.nextByte();

        System.out.println("c kenarini girin");
        byte ucuncuKenar = input.nextByte();


        System.out.println(ilkKenar+ikinciKenar+ ucuncuKenar);


        //Mil’i kilometreye çeviren bir program yazınız. (double kullanınız)
        //Not 1: km = mile x 1.6

        System.out.println("Mil km'ye cevir");
        double olcu = input.nextDouble();

        System.out.println("cevir" + (olcu* 1.6));


        //Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız.
        //Ad ve soyad ilk satırda, adres ikinci satırda olsun.
        //(String kullanınız)

        System.out.println("Adniyi girin");
        String ad = input.next();

        System.out.println("Soyadini girin");
        String soyad =input.next();

        System.out.println("Adresinizi girin");
        String adres = input.next();


        //sayi1 ve sayi2 nin degerleri degisen SWAP programi yazdirin.

        double sayi1 = 12;
        double sayi2 = 10;

        System.out.println("sazyilarin degerlerini degistir");
        double sayi = input.nextDouble();



     //Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakamlarinin toplamini ekrana yazdiran bir program yaziniz.

        System.out.println("4 basamakli bir sayi giriniz");
        int say1 = input.nextInt();

        System.out.println("ilk ve son rakami yazin");
        int say2 = input.nextInt();

        System.out.println("topla" + say1+say2);





    }


}

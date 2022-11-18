package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber ;//hesap numarasi
    private int pinNumber;//sifremiz

    private double checkingBalance;//vadesiz hesap bakiyesi
    private double savingBalance;//vadeli hesap bakiyesi

    //dolar formati olusturma
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //hesabimdan para cekmek icin--geriye para iade istiyorum return type olacak(paraCekmeIslemindenSonraKalanMiktar )--(amount;miktar)
    //neden private olusturduk?-->baska class'da cagirma ihtiyacim yok bir kere gorsem yeterli.

    private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalance = checkingBalance -amount;

        return checkingBalance;


    }

    //para yatirma isleminden sonra bakiyeyi hesapla

    private double calculateCheckingBalanceAfterDeposit(double amount){

        checkingBalance = checkingBalance + amount;

        return checkingBalance;


    }

    //para cekme saving hesabindan para cekildikten sonra kalan bakiye

    private double calculateSavingBalanceAfterWithdraw(double amount){

        savingBalance = savingBalance - amount;

        return savingBalance;
    }

    //para yatirma isleminden sonra saving hesabindaki bakiyeyi hesapla

    private double calculateSavingBalanceAfterDeposit(double amount){

        savingBalance= savingBalance + amount;

        return savingBalance;
    }

    //Musteri ile para cekmek icin etkilesime gecelim-->checkinghesap icin gecerli burasi
    //public olacak cunku diger yerlerden de cagiracagiz.
    public void getCheckingWithdraw(){

        //moneyformat olusturduk cunku dolar cinsinden parayi gormek istiyoruz.yukarida method olsuturduk
        displayCurrentAmount(checkingBalance);
        System.out.println("cekmek istediginiz miktari giriniz.");
        double amount = input.nextDouble();


        /*
        ksiinin checkingbalance'da mesela 1000$ var istedigi miktar 500$.bir kosul koyarak eger sizin istediginiz miktar hesabindaki
        miktardan kucuk veya esitse cekilebilecek miktardir.if calisir.para islemi yaprigimiz method calculateCheckingBalanceAfterWithdraw(amount);dur.
        yukarida yapmistik onun ismini aldik yani.else if kisminda cekebuiloiyorsa 'bize o miktari goster 'kodu yazdir.
        ksii ehsabindna para cektikten sonra kalan miktari gosteren kod yazmaliyiz.
        ilkinde kisi yanlis miktar girebilir
        2.de kisi dogru miktar girebilir islem yapablir
        3.kisinin bakiyesi yetersizse bunu kisiye soyluyoruz.
         */
        if (amount<=0 ){

            System.out.println("sifir veya eksi rakamlar gecersizdir.");
            getCheckingWithdraw();//recursive method-->kendisini tekrardan cagirma

         //burada islem yapabilir cunku hesabindaki miktardan kucuk veya esit
        }else if (amount<= checkingBalance){

            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);

        }else{
            System.out.println("yetersiz bakiye");
        }




    }

    //para yatirma checking account'a ; musteri ile para yatirmak icin etkilesime gecelim
    public void getCheckingDeposit(){

        displayCurrentAmount(checkingBalance);
        System.out.println("yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("sifir veya eksi rakamlar gecersizdir.");
            getCheckingDeposit();

        }else{
              calculateSavingBalanceAfterDeposit(amount);
              System.out.println();
              displayCurrentAmount(checkingBalance);
        }

    }

    //Musteri ile para cekme icin etkilesime gecelim : saving hesap
    public  void calculateSavingBalanceAfterWithdraw (){

        displayCurrentAmount(savingBalance);//format kismi ile yazilan methodumuz
        System.out.println("cekmek istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount<=0){

            System.out.println("sifir veya eksi rakamlar gecersizdir.");
           getSavingBalance();//yanlis girerse islemi tekrarlasin diye yazdik

        }else if(amount<=savingBalance){

            calculateSavingBalanceAfterWithdraw(amount);//hesaptaki parayi gosterecek
            System.out.println();
            displayCurrentAmount(savingBalance);

        }else {
            System.out.println("yetersiz bakiye");
        }
    }

    //kisi kendi hesabina oara yatirma:saving balance icin gecerli olacak.musteri ile iletisime gecelim

    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("yatirmak istediginiz meblayi giriniz");
        double amount = input.nextDouble();


        if (amount<=0){

            System.out.println("sifir veya eksi rakamlar gecersizdir");
            getSavingDeposit();
        }else{
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }
    }

























/*
biz buraya checkingbalance koydugumuzda savingbalance icin cagiramam yani yeni bir method yapmam lazim.
ama eger ben ()bu kisma yeni bir parametre verip balance deyip onu da format kismindaki () yere aktarirsam 'balance'
dersem daha dinamik kod olur ve tekrardan saving icin method yapmama gerek kalmaz hep bunu kullanabilirim.
 */
    //son bakiyeyi goster methodu(baska yerlerde cagirma ihtimalimiz var public yapiyoruz)
    //parametre vermem gerekir cunku update oluyor.
    //bu methodu hep checkingbalance icin cagiracagiz.
    public void displayCurrentAmount(double balance){
        System.out.println(" hesabinizda bulunan bakiye" + moneyFormat.format(balance));
    }






}

package day27exceptions;

public class Exceptions03 {
    /*
        1)Java Exception'lar olusturarak Developer'larin Java kurallarina uymalarini temin etmistir.
        2)Biz de Application uretirken kendi Exception'larimizi olusturarak diger developer'larin bizim ortaya koydugumuz kurallara uymalarini temin ederiz.
        3)Java'nin degil, bizim urettigimiz Exception'lara "Custom Exception" denir.
        4)Custom Exception'lar da "RuntimeException" ve "CompileTimeException" olabilir.
        5)Custom "RuntimeException" uretmek icin "extends RuntimeException" deriz
        6)Custom "CompileTimeException" uretmek icin "extends Exception" deriz
     */

    public static void main(String[] args) throws IllegalGradeException {
        //javada kuralalr sayiyi 0'a bolemezsin.arrayleerde olmayan indexi kullanamazsin,bir string'i sayiya cevirebilirsin ama heopsi karakter olmali gibi
        //biz de kendi app'lerimize kendimiz kurallar koyabiliriz.



        printGrades(60);

        checNameFormat("Ali");
    }

    //ogrenci notlarini yazdiran bir method olusturunuz.
    public static void printGrades(double grade) throws IllegalGradeException {
        //throw--> exception ata anlaminda kullaniriz. cunku burada kendimiz exception uretiyoruz.
        //uilk se3ferde kirmizi olan yere geldik mkoreactions deyip lk olana tikladik
        //ve bize 'throws UIllegalGradeException' ekledi yukari.
        if (grade<0 || grade>100){
            throw new IllegalGradeException("Grade 0'dan az 100'den cok olamaz");
        }else{
            System.out.println(grade);

        }
    }

    //verilen ismin ilk harfinin buyuk harf olmamasi durumunda exception atan bir kod yaziniz.-->illegalnameexception'a gidiyoruz yani

    public static boolean checNameFormat(String name){

        if (name.charAt(0)>='A'&& name.charAt(0)<='Z'){
            return true;
        }else{//bunu kendim urettim exception atsin diye
            //eger controctur kullnamzsam sadecealttakini kullanabilirim.ve mesaj olusturmus oldum
            //bu mesaji koyuarak illeganelnameexceptions'da controctor urettim.
            //burasi uncheck exception oldu cunku hic hata vermedi yazarken ama usttekinde veriyordu throws yaoptik yukarida
            throw new IllegalNameException("Isimler buyuk harfle baslamalidir.");
        }
    }
}

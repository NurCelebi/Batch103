package day24statickeywordencapsulation;

public class StudentRunner {

    //degisimleri Class'da yapmadigimiz icin orada ayni ilk degerleri goruruz.
    //obje'de degisiklik yaptigimiz icin sadece degisikligi orada goruruz.

    public static void main(String[] args) {

        Student std1 = new Student();

        //getter
        System.out.println(std1.getStdId());//TH0856345798

        System.out.println(std1.getGpa());//3.8

        System.out.println(std1.isRetired());//false


        //setter
        std1.setStdId("AB");
        System.out.println(std1.getStdId());//AB

        std1.setGpa(4.0);
        System.out.println(std1.getGpa());//4.0

        std1.setRetired(true);
        System.out.println(std1.isRetired());//true


        //application yaparken fazla obje olusturmak zararli memopry dolar.mesela tom'mark'mary'susan var ben bunlar
        //icin hepsine ayri ayri obke yapacaktim ve cok yer kaplayacakti.encapsulation sayesinde --> set() methodu ile
        // bir objeyi cevirerek degistirerek kullanmis oldum.1 objeyi 1000 obje gibi kullanabilirz.
        //tekrar eskiye donmek istersek tekrar set ile degistirebilirz.


    }
}

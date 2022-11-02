package day23inheritancepolymorphism;

public class CourseRunner {

    public static void main(String[] args) {

        //objenin ismi class'in ismiyle ayni yapmak cok sik gorulur.

//        Maths math = new Maths();
//
//        math.liveSession();
//
//        math.practice();

        Maths m = new Maths(6);//math class'inin constructor'ini kullan olarak algilanir
        //java math class'indaki constructorlara bkaar secim yapmaz olan hepsine bakar parametreye bakar hanisinda parametrese
        //int ise onu secer.


        //Constructor B
        //Constructor 1
        //Constructor 2

        //6\yi silersem ciktilar constroctor B- const.1 olarak yazilir.
        //this yoksa gorunmez super olur ve string olan const.yazdirir 6yi da sil cons b-const 1
        //super kaldirilirsa const a- const 1 olur.
    }
}

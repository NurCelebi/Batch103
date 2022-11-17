package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {
    /*
    1)LinkedList'deki her eleman 2 bolumden olusur.i)Data bolumu 2)Pointer
    2)LinkedList'deki her bir eleman "Node" olarak adlandirilir.
    3)LinkedList'ler eleman ekleme ve eleman silme islemlerinde cok basarilidir.
    4)LinkedList'ler eleman arama islemlerinde basarisizlardir.
    5)3. ve 4. maddelerden dolayi ekleme ve eleman silme islemlerinin cok yapilacagi durumlarda LinkedList kullanilmalidir.
    6)ArrayList'ler index kullanir.LinkedList'ler index kullanmaz.
    7)Index kullanmak eleman bulma islemlerinde cok basarilidir. Bu yuzden eleman bulma islmelerini cok yapacaksak
    ArrayList kullanmaliyiz.
    8)add methodu abstract olarak kullanilir LinkedList'lerde zorunludur ama nasil kullanacagi onlara kalmistir.
     */

    public static void main(String[] args) {

        LinkedList <String> visitors = new LinkedList();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Anjelina Julie");
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");

        visitors.add(2,"Anjelina Julie");//[Tom, Hanks, Anjelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]
        //burada index kullandik gozukuyor.normalde index kullanmiyor sadece daha net gozuksun diye buna izin veriyor java.
        System.out.println(visitors);//[Tom, Hanks, Tom Hanks, Brad, Pitt, Brad Pitt]

        //ekleme-cikarmada LinkedList'ler cok basarilidir,  o yuzden cok method iceirir.
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt arkin");
        System.out.println(visitors);//[Cuneyt arkin, Tom, Hanks, Anjelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Ajda Pekkan]

        visitors.removeLast();
        System.out.println(visitors);//[Cuneyt arkin, Tom, Hanks, Anjelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        visitors.removeFirst();
        System.out.println(visitors);//[Tom, Hanks, Anjelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt]

        System.out.println(visitors);//[Tom, Hanks, Anjelina Julie, Anjelina Julie, Tom Hanks, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //ilk gorunumu siler.
        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);//[Tom, Hanks, Anjelina Julie, Anjelina Julie, Brad, Pitt, Brad Pitt, Brad Pitt, Tom Hanks]

        //son gorunumu siler.
        visitors.removeLastOccurrence("Brad Pitt");
        System.out.println(visitors);//[Tom, Hanks, Anjelina Julie, Anjelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

        //hangi node oldugunu anlar sana onu getirir.
        //visitors.get()


        //ilk elemani siler ve sildigi elemani bize veriri.removeFoirs ile aynidir aslinda(cut-paste yapar)==>Ctrl+X
        // .Eğer bu list boş ise NoSuchElementException alırsın
        //Böyle bir element yok
        String firstEl = visitors.pop();
        System.out.println(firstEl);//Tom
        System.out.println(visitors);//[Hanks, Anjelina Julie, Anjelina Julie, Brad, Pitt, Brad Pitt, Tom Hanks]

//        LinkedList <String> myList = new LinkedList();-->kapattik cunku sonraski kodlar hatadan dolayi calismaz.
//        myList.pop();
//        System.out.println(myList);//NoSuchElementException exception atti cunku LinkedList bos


    }
}

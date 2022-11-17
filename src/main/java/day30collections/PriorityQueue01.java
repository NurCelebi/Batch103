package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

      //(oncelik)PriorityQueue Java kendisine gore bir oncelik belirleyerek siralama yapar
      //Biz istersek siralamayi belirleyebiliriz
    public static void main(String[] args) {

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");

        //javanin kendisine gore belirledigi bir oncelikli siraya gore yapar.java elemanlar bakar kendisine gore oncelik belirler ve yazdirir.
        //random demek degildir.java arkada kendisi bir kural olusturur o kuralara gore oncelik belirler.
        //bize faydasi nedir?--> biz istersek kendimiz siralama kuralini belirleriz
        System.out.println(myQueue);//[A, C, B, G, E]





    }
}

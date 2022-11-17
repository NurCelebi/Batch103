package day30collections;
/*
   Deque==>Doubel Ended Queue manasindadir.yani iki uclu Queue demektir.


   FIFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiğinde kullanılır.

Java Collection Framework içerisinde çift uçlu kuyruk olarak tasarlanan bir arabirimdir.
Deque arabirimi, elemanlarına baş ve son taraftan erişilebilen bir bağlı liste yapısıdır.
Deque, JCF icerisinde Queue arabiriminden türetilmiştir.
 */

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    public static void main(String[] args) {

        Deque<String> furnitureTruck = new LinkedList<>();
        furnitureTruck.add("Chair");
        furnitureTruck.add("Mirror");
        furnitureTruck.add("Sofa");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Bed");
        furnitureTruck.add("Dining Table");
        System.out.println(furnitureTruck);//[Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]


        /*
        Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
          This method is equivalent to addFirst.
          Params:
          e – the element to push
          Throws:
          IllegalStateException – if the element cannot be added at this time due to capacity restrictions
          ClassCastException – if the class of the specified element prevents it from being added to this deque
          NullPointerException – if the specified element is null and this deque does not permit null elements
          IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */
        furnitureTruck.push("Refrrigerator");//ilk siraya koyma addfirst ile ayni anlmada
        System.out.println(furnitureTruck);//[Refrrigerator, Chair, Mirror, Sofa, Bed, Bed, Bed, Dining Table]

        //Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, bu deque tarafından temsil edilen yığına
        // (başka bir deyişle, bu deque'nin başında) bir öğeyi iter, şu anda boş alan yoksa bir IllegalStateException fırlatır.
       // Bu yöntem, addFirst'e eşdeğerdir.


    }
}

package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
    Java Collections Framework 'un bir üyesidir. İşlemlerden geçmeden önce öğeleri depolanmasını sağlar.
     Collection arayüzünün bir altarayüzü olduğundan, onun bütün metotlarını kullanır. Onlara ek olarak, kuyruk
     yapısındaki ekleme, silme gibi işlemleri kolaylaştıran metotlara sahiptir.
     */
    /*
     ilk giren elemani ilk kullanmamiz(FIRST IN FIRST OUT ==> FIFO) gerektiginde Queue en iyi secimdir.
     Queue da elemanlar 'insertion order'a gore dizilirler.
     Queue da  peek(), pool(), element(),remove() gibi ilk elemani ilgilendiren bir cok method vardir
     remove()-->ilk elemenai siler
     offer() methodu kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.
     */

    public static void main(String[] args) {

        Queue<String>  wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meet");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);//[Milk, Meet, Bread, Honey, Tomatoes]
/*
   Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
   When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
   Returns: true if the element was added to this queue, else false
   Throws:
   ClassCastException – if the class of the specified element prevents it from being added to this queue
   NullPointerException – if the specified element is null and this queue does not permit null elements
   IllegalArgumentException – if some property of this element prevents it from being added to this queue
*/
        /*
         Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse,
         belirtilen öğeyi bu kuyruğa ekler. Kapasite kısıtlamalı bir kuyruk kullanırken,
         bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca
         bir istisna atarak bir öğe eklemede başarısız olabilir.
        */
        /*
        Kapasite kısıtlamalarını ihlal etmeden hemen yapmak mümkünse, belirtilen öğeyi bu kuyruğa ekler.
         Kapasite kısıtlamalı bir kuyruk kullanırken, bu yöntemin eklenmesi genellikle tercih edilir, bu yöntem yalnızca bir istisna atarak bir öğe eklemede başarısız olabilir.
         Döndürür: öğe bu kuyruğa eklendiyse true, aksi takdirde false
         Atar:
         ClassCastException – belirtilen öğenin sınıfı, onun bu kuyruğa eklenmesini engelliyorsa
         NullPointerException – belirtilen öğe boşsa ve bu sıra boş öğelere izin vermiyorsa
         IllegalArgumentException – bu öğenin bazı özellikleri onun bu kuyruğa eklenmesini engelliyorsa
         */

        /*
    İlk giren elemanı ilk kullanmanız(First In First Out ==> FIFO) gerektiğinde Queue en iyi seçimdir.
    Queue'da elemanlar "insertion order" a göre dizilirler.
    Queue'da pop(), peek(), poll(), element(), remove() gibi ilk elemanı ilgilendiren birçok method vardır.
         */


        wareHouse.offer("Potatoes");//true-false verir.-- en sona ekler
        System.out.println(wareHouse);//[Milk, Meet, Bread, Honey, Tomatoes, Potatoes]


    }
}

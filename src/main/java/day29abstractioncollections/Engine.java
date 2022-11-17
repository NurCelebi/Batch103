package day29abstractioncollections;

public interface Engine extends Vehicle{
         //child-parent durumunda
    //Child    Parent
    //Class--> Interface(parent)     ==> Implements kullanilir
    //Class--> Class(parent)         ==> extends kullanilir
    //Interface-->Interface          ==> extends kullanilir
    //Interfca-->Class               ==> Mumkun degil
    //tipler ayni oldugunda extends ;tipler farkli oldugunda implements kullanilir.



    //interface\lerdeki tum variable'lar otomatik olarak(default) 'public' dir.
    //deger atamazsak hata veriyor bunu yapan final'lardi.
    //interface\lerdeki tum variable'lar otomatik olarak(default) 'final' dir.
    //interface\lerdeki tum variable'lar otomatik olarak(default) 'static' dir.tum objeler icin ortaktir.
    // static olan bir seye interface'in ismi ile ulasilabilir.obje olusturmaya gerek yok.
    int price =2000;//bu deger 2000'dir artik degistirilemez.

    double weight =23.5;


    void run();



}

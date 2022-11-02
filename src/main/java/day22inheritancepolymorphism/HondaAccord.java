package day22inheritancepolymorphism;

public class HondaAccord extends Honda {

    //gorunmez constructor'in gorunur hali budur aslinda.constructor obje olusturmaya yarar.
    //Class olusturdugumuzda Java otomatik olarak gorunmaz bir constructor verir.Cunku Java Class'in bir kalip oldugunu
    // ve Object olusturmak icin yaratildigini ve Object olusturmak icin constructor'in sart oldugunu bilir.
    //Java'nin otomatik olarak olusturdugu bu gorunmez constructor'a 'default constructor' denir.
    //siz kendiniz herhangi bir constructor olsutrudgunuzda Java 'default constructor'i siler.
    //Bir Class'da birden fazla constructor olabilir.Fakat bu contructor'larin parametreleri farkli olmalidir.
    //"this" keyword "bu class" anlamindadir.this.price demek bu Class'daki "price" variable demektir.
    //"this.price" syntax'i constructor'larin icinde kullanilir.
    //constructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Object uzerindeki variable'larin degerlerini degistirir.
    //Class'daki variable degerlerini degistiremez.
    public  int price;
    public int year;
    public String make;

    public String model;


    public HondaAccord(){//hicbir sart vermeden honda olsutrumak istiyorum

    }

    public HondaAccord(int price){//fiyatini isteyerek honda olsurturmak istiyorum
        this.price = price;


    }

    public HondaAccord(int price,int year){ //fiyat ve yil isteyerek honda olsuturmak istiyorum
        //super("White" ,54000);//super bir ust parent'a gider.--> honda'ya gidicez
        this.price = price;//benim verdigim bu.ucret ucret olarak at anlaminda kullanilir.
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord(int price,int year,String make,String model){
        this.price= price;
        this.year = year;
        this.make= make;
        this.model= model;

    }

}

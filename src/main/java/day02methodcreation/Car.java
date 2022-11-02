package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

      /*
          Note: Class === Variable === Object === Kullanacagiz
                          Method
       */


    public static void main(String[] args) {

        // Object nasil olusturulur?
        //1)Class ismini yaziniz  2) Objeye bir isim veriniz  3)=  4) new keyword kullan  5) Class ismi parantezle beraber
                 Car                     myHonda                =          new                        Car();
                 System.out.println(myHonda.fiyat);
                 System.out.println(myHonda.marka);

                 myHonda.hareketEt();
                 myHonda.dur();

        // MethodCreation class'indan object olusturduk.
           MethodCreation obj = new MethodCreation();
           System.out.println(obj.toplamaYap(3,5));

    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder....");

    }

    public void dur(){
        System.out.println("Honda guvenli durur...");
    }

}

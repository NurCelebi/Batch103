package day24statickeywordencapsulation;

public class CarRunner {

    public static void main(String[] args) {
        //objede yapilan degisiklik sadece objeyi etkiler ama couter'da yapacagimiz degisiklikten hepsi etkilenir
        //class'la ayni isime sahip return yok==>constroctor.
        //new MyClass(2)==> constructor'i kullan anlamina gelir


        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4 =new Car();


        //static variable\lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(car1.counter);//4
        //static variable'lara class ismi kullanarak ulasilmalidir.
        System.out.println(Car.counter);//class adiyla ulastik
        System.out.println(car1.price);//2001


        System.out.println(Car.counter);//4
        System.out.println(car2.price);//2001


        //static keyword-->
        // class'a baglanmis class elemanlidir.class'larda variable ve methodlar var/static variable ve sattic method class'a bagli
        //static  class elemanlari tum objelerin ortak elemanlaridir.gokteki ay gibi her canlinin ortak elemanidir.
        //staticler uzerinde yapilan her degisiklik tum objeleri etkiler ve hepsi tarafinda gorulur.gokteki aya cizik atarsak tum insanlar etkilenir ve hepsi goruru
        //static class elemanlari class uzerinden ulasilir.
        //staticler override edilemezler.neden?--> cunku override alir degisitirrerek kullanirdi.bir tane chil methodu kafasina
        //gore degistirirse ama o method hepsi icin ortak old icin digerleri buna izin vermez.
        //o sebeple override edilemezler

          /*
                     Interview Question
        static keyword nedir ?
        1. Static keyword class'a baglanmis class elemanlaridir.
        2.  static class elemenalri butun objelerin ortak elemanlaridir.
        3. staticler uzerinde yapilan her degisiklik butun objeleri etkiler.
        4.Static class elemenalarina class uzerinden ulasilir.objeler staticlere ulasmak icin kullanilmaz.
           hata vermez ama tavsiye edilmez.
        */





    }
}

package day24statickeywordencapsulation;

public class Car {
    //degisiklik yapildiginda tum  objeler etkileniyorsa static,sadece bir tane obje etkileniyorsa non-static denir.
    //degisikliklerin hepsinden tum objeler etkilensin istiyorsak static yapariz.
    //static olan bir variable olsurma yaptiysak b ir degisiklik yaparsak tum objeler bu degisikligi otomatik olarak ogrenir.

    public static String make="Honda";//variable olustueduk

    public String model ="Accord";

    public int price = 20000;

    public static  int counter=0;//herkes gorsun diye static yaptik

    public Car(){
        counter++;
        price++;

    }

}

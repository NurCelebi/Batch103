package day22inheritancepolymorphism;

public class VehicleRunner {

    public static void main(String[] args) {

        //Example 1: Car turunde rengi beyaz olan 54.000 km'de olan 250.000 tl fiyati olan
        //2020 model bir Honda Accord ariyorum.

        HondaAccord hacc = new HondaAccord(250000,2020);

        /*
          Vehicle Constructor
          Car Constructor
          Honda Constructor
          Honda Accord Constructor--> calisma sirasi boyle oldu.en buyuk parent'dan child'a dogru hepsini siraladi.
         */
    }
}

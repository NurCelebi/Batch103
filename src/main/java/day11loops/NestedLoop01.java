package day11loops;

public class NestedLoop01 {

    public static void main(String[] args) {

        /*
            1.Example:asagidaki ciktiyi vercek kodu yaziniz...
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        //bir dongunun icinde baska bir dongu varsa NestedLoop diyoruz
        //icteki dongu kirilinca disaridaki donguyle devam eder
        //icteki ve distaki loop da kirilinca bune nestedloop deniyor.
        //nested'lar uzun sureli calistigi icin cok kullanmamaya calismamaiz gerekir. ama yapmamiz gereken yerler de tabiki de olacak.


        for (int i = 1 ; i<5 ; i++){
            //5 yapmamaizin sebebi 4 hafta 1 ay eder.

            System.out.println("Week :" + i);//week'leri yazdirmak icin.

            for (int k = 1 ; k<8 ; k++){//8 yazdik cunku haftada 7 gun var.
                System.out.println("Day :" + k);
            }
        }
    }
}

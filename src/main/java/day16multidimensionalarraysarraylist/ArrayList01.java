package day16multidimensionalarraysarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {


    public static void main(String[] args) {

         /*
    ArrayList'ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.
    Array ile ArrayList'in farki nedir?

    1)Array olustururken Array icine kac tane eleman koymamiz gerektigini soylemeliyiz,soyledigimiz eleman sayisindan fazl eleman koyamayiz.
      Array'ler eleman sayisinda fixed'dirler.bu bir problem.java yeni bir yapi olusturdu==ArrayList
      ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,cunku ArrayList'ler eleman sayisinda flexible(esnek) dirlar.


     2)Array'lerin icine 'primitive ve reference' lar konabilir.
       ArrayList'lerin icine ise 'Non-primitive' ler  konur.

     3) Array'ler super fast'dir.yani cok hizli. Array'ler memory'i cok az kullanir.
     Note: eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz.Ama eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin
     */


        //ArrayList nasil olusturulur?

        //1.yol:
        ArrayList<Integer> ages = new ArrayList<Integer>();//wrapperClass halini koymamizi ister==> int --> Integer gibi...

        //2.yol:
        ArrayList<Integer> heights = new ArrayList<>();

        //3.yol:
        List<Integer> nums = new ArrayList<>();


        //ArrayList'ler nasil yazdirili?
        System.out.println(nums);//sadece ismini koyamamiz yeterlidir ArrayList yazdirirken.//[]


        //ArrayList'lere nasil eleman eklenir?-->
        // add() ekleme sirasina gore ekler.elemani her zaman en sona ekler (insertion order)
        //add() method'u boolean return eder.
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21,18,20]


        nums.add(1, 50);//index 1'e 50'yoi yerlestir.
        System.out.println(nums);//[21,50,18,20]

        List<Integer> preices = new ArrayList<>();
        preices.add(23);
        preices.add(185);

        //coklu eleman eklemek istersek asagidaki tarzda yapacagiz. istedigimizi ekle veya istedigimiz listi istedigimiz index'e ekle

        nums.addAll(preices);//yeni degerleri de eklememize yariyor .
        System.out.println(nums);//[21,50,18,20,23,185]
        System.out.println(preices);//[23,185]

        nums.addAll(2, preices);// ekleme istedigin indexe yeni listi ekle.
        System.out.println(nums);//[21,50,23,185,18,20,23,185]

        //ArrayList'leri eleman sayisi nasil bulunur?
        //size-->arrayList'lerde eleman sayisi verir.
        //length--> array'lerde eleman sayisini verir
        int elemanSayisi = nums.size();//bize integer verir
        System.out.println(elemanSayisi);//8

        //ArrayList'lerde herhangi bir eleman nasil secilir?
        //get() method'u istenen bir index'teki elemani verir.

        int el1 = nums.get(3);//index koyuyoruz.
        System.out.println(el1);//185


        //ArayList'in bos olup olmadigini nasil anlariz?
        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);//false


        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);//true

        //ArrayList'de bir eleman nasil degistirilir?
        //index 3 teki elemani buluyor ve onu verdigimiz degere degistiriyor
        nums.set(3, 200);//
        System.out.println(nums);//[21, 50, 23, 200, 18, 20, 23, 185]

        //Example 1 : nums ArrayList'indeki tum tek sayilari 11 arttirdiktan sonra ekrana yazdiriniz.
        //list collections birisidir

        for (int w : nums) {//ilk elemani w icine koyuyoruz ve boyle devam ediyor


            if (w % 2 != 0) {

                nums.set(nums.indexOf(w), w + 11);//elemanin indexini ver diyor ve 11 ekle diyor.
                //set() methodu ile 11 ekledigimiz yeni elelmani o index'e koyar.


            }
        }

        System.out.println(nums);//[32, 50, 34, 200, 18, 20, 34, 196]


        //remove() elemenai silmemizi saglar
        //remove() methodunun icine tamsayi koyarsaniz java onu index olarak kabul eder.

        //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu  siliniz...
        //biz buraya direkt 200 yazarsak bunu primitive olarak algilar index'e bakar ama biz 200 elemanini silmek istiyoruz
        //Bu sebeple biz 200 elemanini tanimasi icin yukarida baska bir integer(wrapper class'a koymak gerek) yapmamiz gerekiyor ve o integer ismini remove() icine yazmak gerekir.

        Integer sayi = 34;
        nums.remove(sayi);
        System.out.println(nums);//birinci 34'u sildi.

        //Note: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir,yani int'dir.
        //Note 2: "Primitive" ler ArrayList'lerin elemani olamazlar.cunku List'ler non-primitive depolar.
        //Note 3: Primitive'i Wrapper Class'a cevirirsek Non Primitive olur.Ve Non Primitive'ler ArrayList'lerin elemani olur.


        ArrayList<Character> list = new ArrayList<Character>();


        for (char i = 'a'; i <= 'e'; i++) {
//            list.clear();
            list.add(i);
        }
        System.out.println(list);









    }

}

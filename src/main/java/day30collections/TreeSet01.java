package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
  /*
        TreeSet tekrarsiz elemanlari 'alfabetik siralama' veya 'kucukten buyuge'(natural Order) siralamaya yarar.
        national order==> alfabetik siralama(kelime) - kucukten buyuge(sayisal) anlamina gelir.

        TreeSet coook yavas calisir.O yuzden bunu kullanirken dusunmek gerekir.eger sartsa siralam ona gore kullan yoksa kulanma.
        TreeSet'i klllanmkatan genelde kacinmaliyiz.

        NOTE:Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir.Ama TreeSet'ler coook
             yavas calistigi icin biz elamanlari once HashSet'e depolariz sonra HashSet'i TreeSet'e cevirerek TreeSet'in
             yavas olma problemini asmis oluruz.
         */

    public static void main(String[] args) {

        //Example 1: Sekiz tane unique String elemani alfabetik sirada depolayiniz.
        //unique gorunce--> set alfabetik deyince-->treeset anlariz

        //1.Way:yavas calisir
        //'long' kismini yazmamaizin amaci ne kadar surede calistigini gormek icin yaptik.
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        //alfabetik siraya koydu.
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1 - start1);//bu islemin ne kadar surdugunu gosterecek//4999800==> yavas


        //2.Way:bu yol daha iyi HashSet kullanmak daha hizli yapar
        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        TreeSet myEmaiLsSorted = new TreeSet(myEmails);//HashSet'i TreeSet'e cevirmek icin bu kodu yazdik.
        System.out.println(myEmaiLsSorted);//0
        System.out.println(myEmails);//[b@gmail.com, k@gmail.com, c@gmail.com, y@gmail.com, m@gmail.com, z@gmail.com, d@gmail.com, a@gmail.com]
        //siralama yapmadi rastgele yapti.
        Long end2 = LocalTime.now().toNanoOfDay();

        System.out.println(end2- end1);//0==>hizli

        //SortedSet yapısına bağlıdır, bu yüzden tekrarlanan öğelere izin vermez.
    }
}

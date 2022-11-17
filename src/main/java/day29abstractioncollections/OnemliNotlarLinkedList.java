package day29abstractioncollections;

/*
Collection: birden fazla datanın depolanması.
Array ilkel bu yüzden collectionlara dahil değil.
List'ler collection'lara dahil.

Collection diyince bunlar aklınıza gelmeli:
1)List  i)ArrayList ii)LinkedList
2)Set
3)Queue

>List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
>>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
--Set ve List'i amacına göre kullanın.
>>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.


      ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
      Array ile ArrayList'in farki nedir?

         1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
           Array'ler eleman sayisinda "fixed" dirler.
           ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.

         2)Array'lerin icine "primitive" ve "reference" lar konabilir.
           ArrayList'lerin icine ise sadece "non-primitive" ler konulur.

         3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.

          Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
               eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin

- Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
- Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
- LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
- Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
yerine "Node" kelimesini kullanmak yerinde olacaktir.
- Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
- Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.

 */

//ArrayList'ler index kullanir ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.
//cunku bircok elemanin re-index edilmesi gerekir.
    /*
    LinkedList her zaman 2 bolumden olusur bu kisim 'Node' (eleman) anlaminda kullanilir.ikinci bolumde ise bir sonraki
    bolumde geleck olan siradani Node'u gosterir.
    ArrayList'lerde eleman deriz, LinkedList'lerde Node denir.
    een son elemanin(node) pointer kismi 'null' gosterrir.en son bolume==>Tail denir.
    ilk bastaki node'un basinda ise 'head' vardir.
    LinkedList'lerde eleman cikarilacak olursa cikabilir aradaki baglanti oklarini kirar ve kaldigi yerden devam eder.
    Bu elemani garbece collector siler.

LinkedList eleman ekleme ve eleman silmede cok basarilidir.Bu yuzden eleman ekleme ve eleman silme islemlerini cokca
yapacagimiz durumlarda LinkedList kullanmaliyiz.Mesela muzeye gelen kisiler ile ilgili liste tutacaksin ama surekli gelip
 gidiyorlar bu sebeple burada lINKEDLIST kullanilmasi cok mantikli olur cok daha hizli olur.Cok daha yogun islemlerde kullanilabilir.

     */
/*
       ArrayListlerde index kullanmanin pozitif-negatif  yanlar?
1)index adres vermedir.Index kullanmak adres gibidir.
2)lINKEDlIST INDEX KULLANMAZ.buLMASINI ISTEDIGIMIZ ELELMANI BULMAK ICIN ILK ONCE ilk elemana gelir ona bakar 'senden
sonraki nedir?' doiye sora sora devam eder.yani iceride olan eleman sayisi kadar devam eder surekli caslisir.
3)LinkedList eleman bulmada iyi degil.
4)ArrayList eleman bulmada iyidircunku index kullanir.(search)


 */

public class OnemliNotlarLinkedList {


}

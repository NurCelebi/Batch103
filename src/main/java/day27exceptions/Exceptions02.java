package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
        1) FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
           "new" den sonraki "FileInputStream" hata verir. Cunku; biz Java'ya verilen adresteki dosya' ya git dedik, Java
           iki endise'ye kapildi i)Ya adres yanlissa   ii)Ya verilen adreste dosya yoksa.
           Biz "method isminden" sonra, "throws FileNotFoundException" yazarak, Java'ya bu iki endise duydugun durum
           olusursa "Exception At" dedik.beni ara anlami

        2) while((k = fis.read()) != -1){} yazdigimizda "read()" method'u hata verir. Cunku biz Java'ya dosya'daki
          karakterleri oku dedik. Java bir endiseye kapildi i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse.
          Biz method isminden sonra "throws IOException" yazarak, Java'ya bu durumla karsilastiginda "Exception At" dedik.

        3) Method isminden sonra "throws IOException" yazarsaniz Java "throws FilNotFoundException" i siler. Cunku;
           "IOException", "FileNotFoundException" i kapsar. "IOException", "FileNotFoundException" in parent'idir, onun yaptigi
           herseyi yapabilir o yuzden "IOException" varken "FileNotFoundException"a gerek yoktur.

           "IOException", "Input Output Exception" demektir.

         4) Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken, daha "Run" butonuna basmadan ortaya cikti.
            Bu tarz Exception'lara "Compile Time Exception" denir, diger adlari "Checked Exception" dir.

           "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling), halletmeden code yazmaya devam etmeyiniz.
     */

    public static void main(String[] args) throws IOException {
        readTheTextFromTheFile();//burada silersek hata yapar cunlu kodu ona gore throw olarak yazdik

        readTheText();//burada throw kullanmasan bile hata vermez beni ara demedik cunku
    }

    //Bir text file'daki text'i okuyan kodu yaziniz.
    //1.Way:
    public static void readTheTextFromTheFile() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");
        int k = 0;
        while((k = fis.read()) != -1){
            System.out.print((char)k);
        }
        //fis.read deyince dosyaya gidip okuayacak ve ilk karakteri alarak okumaya baslayacak
        //dosyaya gidecek while dongusunde ilk J harfini larak baslayacak onunASCII degerina bakarak devam edecek loop'u tamalayacak
        //tum dosyadaki char'larb bitene kadar.read bir method
    }

    //2.Way:
    public static void readTheText() {
        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

            //sag tikladiktan sonra try-catch yazan bir sey var ona tikla/try-catch yontemi olusturuldu.
            int k = 0;
            while((k = fis.read()) != -1){//read ilk sikayete ettim kirmizi uzerinde bekle moreactions de 4 opsiyon var add catch clauses sec,2. catch olustu.
                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya'nin adresi veya varligi ile ilgili bir problem var.");

        } catch (IOException e) {
            System.out.println("Dosya'da okunamayan bir character var");
        }

        //exceptions'larda parent altta chil ustte olur.burada ben9i ara demiyoryuz ya 1.ni ya 2.ni yap diyoruz try-catch ile.
        //2/catch silsek mesela read yine hata verir.read'in uzerine gel moreactions de 4 ihtimal vardi en altta 'surround with try/catch var ona tiklarsak nested try olur
        //3.secenekte parent exception'i secmemizi saglar'IOExceptions
    }
}
package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {


        /*
             String Class Methodları
 1)equals():           i)İki tane String'in aynı olup olmadığını anlamamıza yarar.
                       ii)equals() method'u 'boolean' return eder.

 2)equalsIgnoreCase(): i) İki tane String'in aynı olup olmadığını büyük harf küçük harfe dikkat etmeden anlamamıza yarar.
                       ii) equalsIgnoreCase() method'u 'boolean' return eder.

 3)toLowerCase():      i)Bir String'deki tüm harfleri küçük harfe çevirmek için kullanılır.
                       ii) toLowerCase() method'u "String" return eder.

 4)toUpperCase():      i)Bir String'deki tüm harfleri büyük harfe çevirmek için kullanılır.
                       ii)toUpperCase() methodu "String" return eder.

 5)charAt():           i)Bir String'den belli bir index'deki characteeri almak için kullanılır.
                       ii) charAt() method'u "char" return eder.

 6)length():           i)Bir String'de kaç tane character kullanıldığını öğrenmek için kullanılır.
                       ii) length() method'u "int" return eder.

 7)contains():         i)Bir String'de belli bir characterin veya characterlerin var olup olmadığını anlamak için kullanılır.
                       ii) contains() method'u "boolean" return eder.

 8)split():            i)Bir String'i istediğimiz character'den parçalamaya yarar.
                       ii)split() method'u "Array" return eder.

 */

        //bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
        //i)en az 8 karakter icermeli
        // ii)space character icermemeli
        //iii)ilk harfi'M' veya 'm' olmali
        //iv)son characteri ? olmali

        String pwd = "Manisa12?" ;

        //i)en az 8 karakter icermeli.(karsilastirma old icin boolean)
        boolean first = pwd.length()>7;

        //ii)space characteri icermemeli
        boolean second = !pwd.contains(" ");//! not anlama gelir yani icermez.

        //iii) ilk harfii 'M' veya 'm' olmali.
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';//veya old icin boolean oldu.

        //iv)son characteri ? olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third  && fourth);



    }
}

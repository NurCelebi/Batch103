package day26exceptions;

public class Exceptions01 {
    public static void main(String[] args) {


        String str = "123";//bu string 1-2-3'tur.

        int result = convertStringToInteger(str);
        System.out.println(result+ 5);//128

        String st ="1a2b";
        int r = convertStringToInteger(st);//NumberFormatException/eger icinde rakamdan farkli karakter barindiran
                                           //bir String'i valuOf() kullanarak Integer'a cevirmek isterseniz
                                           //'NumberFormatException' aliriz.
        System.out.println(r+10);//bu kisim negatif senaryoda calisacak.

    }

    public static int convertStringToInteger(String str){//string'i alacak integer'a cevirecek

        int i =0;


        //herhangi bir satirda java exception atarsa sonraki kodlar calistirilamaz.
        //Herhangi bir satirda "Exception" atilirsa Java direkt "catch" bolumune gecer try icindeki sonraki kodlari calistirmaz

        try{
           i=  Integer.valueOf(str);
            System.out.println("burasi try bolumu");//problemsiz olsa da bunu yazdigimiz icin sonuc ile bu calisacak.

        }catch(NumberFormatException e){////valuOf methodu methodu integer'a cevirecek

            System.out.println("rakam olmayan karakter iceren String'ler Integer'a  cevrilmez");

        }
        return i;




    }


}

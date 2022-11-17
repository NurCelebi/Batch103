package day10stringmanipulations.day11loops;

public class ForLoop002 {
    public static void main(String[] args) {

        // //Bir String'deki 'm' karakteri haric tum karakterleri yazdiriniz.
        //        //Andromeda ==> Androed


        String str = "madam ";

        //1.yol:
        for (int i =0 ; i<str.length() ; i++){

            char c = str.charAt(i);

            if (c!='m'){
                System.out.print(c);
            }
        }

        //2.yol:
        for (int i =0; i<str.length() ; i++){

            char c = str.charAt(i);

            if (c=='m'){
                continue;//bosver demek yani c m'ye esit mi bosveer dedigimizde m'yi yazdirmaz.
                // Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz 'continue'kullaniniz.

            }


            System.out.println(c);
        }

        //Example 2: 1'den 100'e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz.



        for (int i = 1 ; i<101 ; i++){

            if (i%6==0){//bu kisim true olursa 'continue' calisiyor.
                continue;

            }

            System.out.print(i + " ");
        }

        System.out.println();

        //Example 3: Size verilen bir String'deki 'm'den onceki karakterleri yazdiriniz...
        //               Luxemburg ==> Luxe


        String s = "Luxemburg";

        for(int i = 0 ; i<s.length(); i++){

            char c = s.charAt(i);

            if (c=='m'){//karakter m'ye esitse loop'u kir anlami var
                break;//herhangi bi ryerde Loop'u kirmak istersek 'break' kullanmamiz gerekecektir.

            }
            System.out.print(c);//eger sout'u if'in uzerine koyarsak m ve m'den oncesini yazdir anlamini gelir.

        }

    }
}

package day25exception;



public class E02 {
    public static void main(String[] args) {
        String arr[] = {"Ali","Can", "Veli" , "Han"};

        getElementFromArray(arr,2);//Veli
        getElementFromArray(arr,0);//Ali
        getElementFromArray(arr,4);//ArrayIndexOutOfBoundsException

        //biz burada en fazla lnegt uzunlugunda ve lengt-1 indexini yazmamiz gerekir o sebeple son arr,4 bize hata verir
    }
    //Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun.
    public static void getElementFromArray(String arr[],int idx ){
        try{
            System.out.println(arr[idx]);

        }catch (ArrayIndexOutOfBoundsException e){
            //Bu benim teknik olmayan aciklamam
            System.out.println("Array index te bir problem geldi");

            //Exception ile ilgili detaylica teknik mesaj verir.
            e.printStackTrace();

            //hata mesajini diger mesajlardan ayirmak icin kullaniriz.(renkli)
            System.err.println("Array index te bir problem yasandi==>"+e.getMessage());

        }


    }
}

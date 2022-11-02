package day21accessmodifiersinheritance;

public class StudentRunner {


    public static void main(String[] args) {

        //main method olan class'lara runner ismi konur genelde.
        //obje yardimiyla diger class ile baglanti kurabildim.
        //adress protected'di. ayni packgae icindeysem protected -public -string ulasabilirim.
        //fakat private ulasamiyorum.cunku bir sey private ise ona sadece icinde bulunudugu class'dan ulasilabilir.

        Student std1 = new Student();
        System.out.println(std1.stdNames);//TomHanks
    }
}

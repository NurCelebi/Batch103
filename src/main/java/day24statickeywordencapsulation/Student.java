package day24statickeywordencapsulation;
//Encapsulation(kapsllemek-kapsule koymak):  'Dat Hiding(gizlemek)' data gizlemek korumak demektir

//neden data gizleriz?--> Data'yi di etkenlerden korumak icin gizleriz.

//Data'yi nasil gizlersin?--> Access Modifier'ini 'private' yaparak gizlenir.

//Data'yi gizledikten sonra baska Class'lardan okumak istersen naparsin?
//'get' methodlar(getter)  olusturularak gizledigimiz data'lari okunur hale getirebiliriz

//Data'yi gizledikten sonra baskaClass'lardan degistirmek istersem ne yaparsin?-->
//'set method(setter)'lar olusturarak gizledigimiz data'lari degistirebilirz.

//Variable'in Data type'i ile get method'un 'return type'i ayni olmalidir

//get mothod'lari isimlendirirken "get+ <variable name>" ancak variable'in data tipi boolean ise "is + <variable name> yapariz.


public class Student {

    private String stdName = "Tom Hanks";//name public old icin tekrar olusturmaya gerek yok
    private String stdId = "TH0856345798";
    private double gpa = 3.8;
    private boolean retired = false;

    //GETTER'LAR-->baska class'lardan okumak icin yaptik.--get methodlar public olurlar.
    public String getStdId() {
        return stdId;//ben bu methodu kullandigimda bana stdId ver anlamina gelir.
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {//boolean'larda is ile baslar digerlerinde get ile baslar
        return retired;
    }


    //setter methodlar--> degistirmeye yarar isimleri degistircez.public ler cunku baska class'larda gormek istiyorum.
    //return type void cunku setter bize data vermez degisimi yapar birakir.
   // setter'da variable ismi ne ise parametre ismi de ayni olur

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }
}

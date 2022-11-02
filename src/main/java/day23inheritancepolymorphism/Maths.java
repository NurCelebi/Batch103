package day23inheritancepolymorphism;

public class Maths extends Courses{

    //ayni class'in icinde bir contructor'i kullandiktan sonra vbaskasini kullanmak isterse
    //this() kullanmamiz gerekir.


    public void practice(){
        System.out.println("solve questions");


    }
    public Maths(){
       super("second");//parent class'a gitmek icin--> parantez icine bir sey yazmazsak ilk constructor'a gider-->gidilecek constructor icin birseyler yazmak gerek.
        System.out.println("Constructor 1");
    }
    public Maths(int a){
        this();//ayni class icinde diger constructor'i kullan anlamina gelir.
        System.out.println("Constructor 2");

    }


}

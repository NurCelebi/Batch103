package day22inheritancepolymorphism;

public class Mammals extends Animals {

    public int a = 13;

    public int b = 34;


    public void eat(){
        System.out.println("Mammal Eat");
    }

    public void drink(){

        System.out.println("Mammal drink...");

    }

    public Mammals(){
        System.out.println("Mammal");
    }



}

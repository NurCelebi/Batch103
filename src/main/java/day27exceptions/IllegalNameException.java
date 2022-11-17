package day27exceptions;

public class IllegalNameException extends RuntimeException{
    //kodumuzun run yaptiktan sonra exception olmasini istersek 'runtimeexception' ile extends edecegiz.

    public IllegalNameException(String message){
        //super dedik cunku parent'da gidip baksin diye

        super(message);


    }
}

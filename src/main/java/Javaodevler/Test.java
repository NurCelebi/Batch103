package Javaodevler;

public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.myMethod('A', 'b'));
    }
    public int myMethod(char c1, char c2){
        return c1 + c2;
    }

}


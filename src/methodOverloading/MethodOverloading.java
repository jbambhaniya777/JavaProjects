package methodOverloading;

public class MethodOverloading {
    //Overloading -- insert the things
    // In class having method with same name with different parameters and datatypes
    public static void addition (){
        int a = 10;
        int b= 20;
        int c = a+b;
        System.out.println(c);
    }

    public static void addition (int a, int b) {
        System.out.println(a+b);
    }
    public static void addition (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        addition();
        addition(11,45);
        addition(40,10,30);
        // addition("Parin","Radha");
    }

}

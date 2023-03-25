package methodOverriding;

public class ParentAddition {
    public static void addition (float a, float b){
        System.out.println(a + b);
    }

    public static void addition (int a, int b, int c, int d) {
        System.out.println(a+b+c+d);
    }
    public static void substraction (int a, int b){
        int c = a-b;
        System.out.println(c);
    }
    public static void substraction (int a, int b, int c){
        int e = a-b-c;
        System.out.println(e);
    }
    public static void main(String[] args) {
        addition(20.29f, 30.20f);
        addition (10,20,30,40);

    }
}

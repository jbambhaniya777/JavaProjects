package methodOverriding;

public class ChildAddition {
    public static void addition (float a, float b){
        float c = a+b;
        System.out.println(c);
    }
    public static void addition (int a, int b, int c, int d) {
        int e = a+b+c+d;
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        addition(20.20f, 30.5f);
        addition(10,20,30,40);
    }
}

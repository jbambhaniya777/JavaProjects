package arrayTopic;

public class TypeCasting {
    public static void main(String[] args) {
        byte a = 20;
        short b = a; // wide casting
        System.out.println(b);

        short z = 234;
        byte f = (byte) z; // narrow casting
        System.out.println(f);

        long abc = 6799654;
        int xyz = (int) abc; // narrow casting
        System.out.println(xyz);

        int m = 20;
        int n = 40;
        float p = (float) m/n ; // narrow casting
        System.out.println(p);
    }
}

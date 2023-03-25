package parsing;

public class NumberParsing {
    public static void main(String[] args) {
        int a = 20;
        a = a+30;
        System.out.println(a);
        String x = Integer.toString(a);
        x = x + "abcs";
        System.out.println(x);
        String y = Integer.toString(a);
        y = y + "def";
        System.out.println(y);

        double c = 35.67d;
        String z = Double.toString(c);
        z = z + "hjkk";
        System.out.println(z);


    }
}

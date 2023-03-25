package parsing;

public class StringParsing {
    public static void main(String[] args) {
        String x = "123"; // convert into int
        x = x + 20; // 12320

        int a = Integer.parseInt(x);
        a = a+20;
        double b = Double.parseDouble(x);
        System.out.println(b);
        System.out.println(a);
        System.out.println(x);

    }
}

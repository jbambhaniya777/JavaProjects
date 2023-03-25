package controlStatements;

public class CheckMaxFrom3Number {
    public static void main(String[] args) {

        int a = 20;
        int b = 15;
        int c = 35;
        if (a > b && a > c) {
            System.out.println(a + " is bigger number");
        } else if (b > c && b > c) {
            System.out.println(b + " is bigger number");
        } else {
            System.out.println(c + " is bigger number");
        }
    }
}

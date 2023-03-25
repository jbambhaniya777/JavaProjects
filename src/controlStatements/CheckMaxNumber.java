package controlStatements;

public class CheckMaxNumber {
    public static void checkMaxNumber(int a, int b, int c){
        if (a!=b && b!=c && a!=c){
            if (a>b && a>c){
                System.out.println(a + " is bigger number");
            } else if (b>a && b>c) {
                System.out.println(b + " is bigger number");
            } else {
                System.out.println(c + " is bigger number");
            }
        }else {
            System.out.println("two numbers are same");
        }
    }

    public static void main(String[] args) {
        checkMaxNumber(22,87,26);
        checkMaxNumber(46,46,30);
        checkMaxNumber(28,15,55);
        checkMaxNumber(95,11,25);
    }
}

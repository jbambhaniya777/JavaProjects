package controlStatements;

public class OddEvenNumbers {
    public static void checkEvenOrOddNumber (int number) {
        if (number%2==0) {
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }
    }

    public static void main(String[] args) {

        // 2,4,6,8, , = even number = = 0
        // 1,3,5,7,9, = odd number
        checkEvenOrOddNumber(14);
        checkEvenOrOddNumber(8999);
    }

}

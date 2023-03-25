package arrayTopic;

public class FindEvenOdd {
    public static void findEvenNumber (int [] numbers){
        for (int number : numbers) {
            if (number%2==0) {
                System.out.println(number + " is Even number");
            }
        }

    }
    public static void findOddNumber (int [] numbers) {
        for (int number : numbers){
            if (number%2!=0) {
                System.out.println(number + " is odd number");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {23,78,89,56,44,01,59,78,58};
        findEvenNumber(arr);
        findOddNumber(arr);
    }
}

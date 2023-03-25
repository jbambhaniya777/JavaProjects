package arrayTopic;

public class FindOddNumber {
    public static void main(String[] args) {
//        add all the value
        int [] arr = {5,10,15,20,25};
        int sum = 0;
        for ( int x : arr) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}

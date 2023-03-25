package inheritanceConceptExp;

public class ExtraExamples {
    public static void fibonacci (){
        int sum = 0;
        int first = 0;
        int second = 1;
        for (int i = 1; i<10; i++) {
            System.out.println(sum);
            sum = first + second;
            second = sum;

        }
    }
    public static void main(String[] args) {
     fibonacci();


    }
}
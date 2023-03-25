package arrayTopic;

public class FindLargestSide {
    public static void main(String[] args) {
        // Equilateral - 3 Sides equal
        // Iscoclar - 2 Sides equal
        // Scalar - no sides equal
        int a, b, c;
        a = 21;
        b = 22;
        c = 20;
        if (a==b && b==c){
            System.out.println("Equilateral");
        } else if (a==b || b==c || c==a ) {
            System.out.println("Isoscalar");
        } else {
            System.out.println("Scalar");
        }

    }
}

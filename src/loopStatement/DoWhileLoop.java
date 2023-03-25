package loopStatement;

public class DoWhileLoop {
//    while (condition) {...} ----check condition then execute (entry control)
//    do {.....} while condition ----first execute then check condition (exit control)
public static void main(String[] args) {
//    print 1 -- 10
    int number = 1; // starting 1
    do {
        System.out.println(number);
        number++;
    } while (number<=0);

}
}

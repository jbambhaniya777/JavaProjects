package loopStatement;

public class TimeTableMethod {

    public static void timeTableExample(int tableNumber) {
        System.out.println("This is table for " + tableNumber);
        System.out.println(".=.=.=.=.=.=.=.=.=.");
        for (int i = 1; i <= 12; i++) {
          //  int value = tableNumber * i;
            System.out.println(tableNumber + " X " + i + " = " + tableNumber * i);
        }
        System.out.println("----------------");

    }

    public static void main(String[] args) {

        timeTableExample(18);
        timeTableExample(7);
    }
}

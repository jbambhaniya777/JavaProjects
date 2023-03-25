package controlStatements;

public class OysterCard {
    public static final int MINIMUM_BALANCE = 15;
    public static void checkOysterCard (int myBalance){
        if (myBalance>=MINIMUM_BALANCE){
            System.out.println("Gate is open");
        }else {
            System.out.println("Don't have sufficient balance pls top up");
        }
    }

    public static void main(String[] args) {

        checkOysterCard(8);
        checkOysterCard(15);
        checkOysterCard(20);

    }
}


package methodOverloading;

public class Medication {
    public static void medication (String pillsName){
        System.out.println("Take in the morning");
    }
    public static void medication (String pillsName1, String pillsName2) {
        System.out.println("take one pill in morning" + pillsName1);
        System.out.println("take one pill in night" + pillsName2);
    }
    public static void medication (String pillsName1, String pillsName2, String pillsName3) {
        System.out.println("take one pill in morning" + pillsName1);
        System.out.println("take one pill in night" + pillsName2);
        System.out.println("take one pill in afternoon" + pillsName3);
    }

    public static void main(String[] args) {
        medication("Paracetamol");
        medication("asperin", "coldfever");
        medication("paracetamol","asperin", "coldfever");
    }
}

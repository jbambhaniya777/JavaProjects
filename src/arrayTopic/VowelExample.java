package arrayTopic;

public class VowelExample {
    public static void main(String[] args) {
        String string = " Good Morning everyone";
        int count = 0;
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i)== 'a' || string.charAt(i)== 'e' || string.charAt(i)== 'i' || string.charAt(i)== 'o' || string.charAt(i)== 'u'){
            count++;
            }
        }
        System.out.println("total Vowel counts are " + count );

    }

}

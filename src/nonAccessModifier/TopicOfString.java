package nonAccessModifier;

public class TopicOfString {
    public static void main(String[] args) {
        String myName = "Jitesh";
        String lastName = " Bambhaniya";
        StringBuffer stringBuffer = new StringBuffer(lastName);
        System.out.println(stringBuffer.reverse());
        int length = myName.length();
        System.out.println(length);
        //String myNameInUpperCase = new myName.toUpperCase();
       // System.out.println(myNameInUpperCase);
        char x = lastName.charAt(3);
        System.out.println(x);
        System.out.println(myName.concat(lastName));
        System.out.println(myName.compareTo(lastName));
        System.out.println(myName.equals(lastName));
       // System.out.println(myName.replace());
        System.out.println(myName.intern());
        //System.out.println(myName.substring());
    }
}

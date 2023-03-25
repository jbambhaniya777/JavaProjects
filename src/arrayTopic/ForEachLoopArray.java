package arrayTopic;

public class ForEachLoopArray {
    public static void main(String[] args) {
        String[] studentName = {"Karan","Arjun","Amthalal","Babulal","Chamaniyo"};
//        print all student name
        System.out.println(studentName.length);
        for (int i =0; i<studentName.length; i++){
            System.out.println(studentName[i]);
        }
//        for each
        System.out.println("for each - using");
        for (String studentName1:studentName){
            System.out.println(studentName[1]);
        }
        System.out.println(studentName.length);
        for (int i = studentName.length; i<studentName.length-1; i--) {
            System.out.println(studentName[1]);
        }
        int [] number = {37,89,78,789,987,67889,6758};
        int myNumberLength = number.length;


        }
            


}

package controlStatements;

public class StudentMarks {
    public static void checkStudentResult (int marks){
        if (marks>=35 && marks<=50){
            System.out.println(marks + " Student is pass with Pass Class");
        } else if (marks>=51 && marks<=60) {
            System.out.println(marks + " Student is pass with Second Class");
        } else if (marks>=61 && marks<=70) {
            System.out.println(marks + " Student is pass with First Class");
        } else if (marks>=71 && marks<=100) {
            System.out.println(marks + " Student is pass with Distinction Class");
        } else if (marks>100) {
            System.out.println(marks + " Invalid Student Marks");
        } else {
            System.out.println(marks + " Student is fail");
        }
    }

    public static void main(String[] args) {
        checkStudentResult(91);
        checkStudentResult(35);
        checkStudentResult(63);
        checkStudentResult(105);
        checkStudentResult(50);
        checkStudentResult(71);

    }

}

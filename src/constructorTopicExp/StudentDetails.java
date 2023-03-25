package constructorTopicExp;

import controlStatements.StudentMarks;

public class StudentDetails {
    String studentName;
    int studentRollNo;
    int studentMarks;
    public StudentDetails(String name, int rollNo, int marks){
        studentName = name;
        studentRollNo = rollNo;
        studentMarks = marks;
        System.out.println("Studnet Name is " + studentName + " and Roll number is " + rollNo + " and Marks are " + marks);
    }

    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails("Rohit", 78,80);
        StudentDetails studentDetails1 = new StudentDetails("Parin", 01, 90);
        StudentDetails studentDetails2 = new StudentDetails("Radha", 18, 85);

    }



}

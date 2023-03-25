package controlStatements;

public class LeapYearExample {
    public static void checkLeapYear (int year){
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + " This year is a LEAP YEAR");
        } else {
            System.out.println(year + " This year is not a LEAP YEAR");
        }

    }

    public static void main(String[] args) {
        checkLeapYear(2020);
        checkLeapYear(2023);
        checkLeapYear(106);
        checkLeapYear(2000);
    }


}
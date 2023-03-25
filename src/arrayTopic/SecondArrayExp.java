package arrayTopic;

public class SecondArrayExp {
    public static void main(String[] args) {
        String[] arrCars = {"Kia", "Volvo", "BMW", "Lexus", "Mercedes", "Range Rover", "Tesla"};
        int myArrLength = arrCars.length;
        System.out.println(myArrLength);
//        print all car name
        System.out.println("Print Car names in array order");
        for (int i = 0; i<arrCars.length; i++){
            System.out.println(arrCars[i]);
        }
//        print array in reverse order (print cars name in reverse order
        System.out.println("Print Car names in REVERSE order");
        for (int i=arrCars.length-1; i>0; i--){
            System.out.println(arrCars[i]);
        }
    }
}

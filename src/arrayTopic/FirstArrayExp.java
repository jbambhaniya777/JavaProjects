package arrayTopic;

public class FirstArrayExp {
//    ARRAY = collection of variables - same data type
//    Array is non-primitive - Array string (not fixed in size)
//    Syntax - int[] arr = { };
//    for example -- int a = 10; int b = 20; int c = 30; int d = 40; .....
//    int[] arr = {10,20,30,40};
public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    int[] arr = {10,20,30,40,50,60,70,90}; // array
//    index       0  1  2  3  4  5  6  7
//    Length      1  2  3  4  5  6  7  8
//    Access
    System.out.println(arr[0]);
//    operation
    arr[0] = 50;
    arr[1] = arr[0] + arr[2];
    System.out.println(arr[1]);
    System.out.println(arr.length);
    if (arr[0] > arr[3]) {
        System.out.println("First position is bigger");
    } else {
        System.out.println("First position is smaller");
    }
//    print all array
    System.out.println("Print all array");
    for (int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
//    print car name in reverse order
    System.out.println("Print all array in reverse order");
    for (int i = arr.length-1; i>0; i-- ){
        System.out.println(arr[i]);
    }
}


}

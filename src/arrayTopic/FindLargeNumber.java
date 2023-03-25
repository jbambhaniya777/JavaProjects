package arrayTopic;

public class FindLargeNumber {
    public static void main(String[] args) {
        
        int [] arr = {28,65,789,-45,65,987,3562,11,5671};
        int large = 0;
        int smallest = arr[0];
        System.out.println(arr.length);
        for (int i = 0; i<arr.length; i++){
            if (large<=arr[i]){
                large = arr[i];
            }
        }

        System.out.println(large);
        for (int i = 0; i<arr.length; i++){
            if (smallest>=arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);


    }
}

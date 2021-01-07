import java.lang.Math;

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) {
        int arr1[] = {arr[0], arr[1], arr[2], arr[3], arr[4]};
        int arr2[] = {arr[5], arr[6], arr[7], arr[8], arr[9]};
        int both[] = new int[arr.length];
        int num = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            both[num] = arr1[i];
            num++;
            both[num] = arr2[i];
            num++;
        }

        return both;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int rand = (int)(Math.random() * (arr.length - 1 + 1));
            temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}

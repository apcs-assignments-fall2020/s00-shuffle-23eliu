public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) {
        int arr1[] = new int[arr.length/2];
        int arr2[] = new int[arr.length/2];
        int both[] = new int[arr.length];
        int num = 0;

        for (int i = 0; i < arr.length/2; i++) {
            arr1[num] = arr[i];
            num++;
        }
        num = 0;

        for (int j = arr.length/2; j < arr.length/2; j++) {
            arr2[num] = arr[j];
            num++;
        }
        num = 0;

        for (int k = 0; k < arr1.length; k++) {
            both[num] = arr1[k];
            num++;
            both[num] = arr2[k];
            num++;
        }

        return arr2;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        return null;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr = {1,2,3,2,3,45,6,4,3,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //Swap the numbers
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;

                }


            }
            if (!swapped) {
                break;
            }
        }
    }
}

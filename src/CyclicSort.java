import java.util.Arrays;

import static java.util.Collections.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {2,3,4,2,3,5,6,8,9};
        cyclic(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void cyclic(int[] arr){
        int i = 0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}

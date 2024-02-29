import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.swap;

public class MoreMissingElemets {
    public static void main(String[] args) {
    }
    public List<Integer> FindingMisiingelements(int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = arr[i];
            if(i < arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]!=index+1){
                ans.add(index+1);
            }

        }return ans;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
